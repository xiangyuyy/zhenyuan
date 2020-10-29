package com.macro.mall.service.impl;


import com.github.pagehelper.PageHelper;
import com.macro.mall.bo.BaseConst;
import com.macro.mall.dao.MemberDao;
import com.macro.mall.dto.*;
import com.macro.mall.mapper.*;
import com.macro.mall.model.*;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.MemberService;
import com.macro.mall.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

//import com.macro.mall.service.UmsAdminCacheService;

/**
 * UmsAdminService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class MemberServiceImpl implements MemberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);
    @Autowired
    private MemberDao memberDao;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private Usra01Mapper usra01Mapper;

    @Autowired
    private Usra04Mapper usra04Mapper;

    @Autowired
    private CodeItemService codeItemService;

    @Autowired
    private DrugCountMapper drugCountMapper;

    @Autowired
    private VZhichengMapper vZhichengMapperMapper;



    @Override
    public List<Member> getMemberList(MemberListParam param) {
        PageUtil.init(param);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return memberDao.getMemberList(param);
    }

    @Override
    public List<Member> getAllMemberList() {
        MemberExample memberExample = new MemberExample();
        return memberMapper.selectByExample(memberExample);
    }

    @Override
    public List<DepartmentDto> getAllDepartment() {
        List<Organization> list = getAllOrganizationList();
        List<DepartmentDto> result = new ArrayList<>();
        list.stream().forEach(x -> {
            DepartmentDto dto = new DepartmentDto(x.getCodeitemid(), x.getCodeitemdesc(), x.getParentid());
            result.add(dto);
        });
        return getThree(result, "102");
    }

    @Override
    public Member getMember(String id) {
        return memberMapper.selectByPrimaryKey(new Long(id));
    }

    @Override
    public UpdateMemberDto getUpdateMember(String id) {
        Member model = getMember(id);
        if (model == null) {
            return null;
        }
        UpdateMemberDto member = new UpdateMemberDto();
        member.setId(model.getId().toString());
        member.setDrugEducationId(model.getDrugEducationId());
        member.setWorkTime(model.getWorkTime());
        member.setDrugMajorId(model.getDrugMajorId());
        member.setDrugPositionOneId(model.getDrugPositionOneId());
        member.setDrugPositionTwoId(model.getDrugPositionTwoId());
        member.setDrugPositionThreeId(model.getDrugPositionThreeId());
        member.setDrugTitleId(model.getDrugTitleId());
        member.setDrugShopId(model.getDrugShopId());
        member.setDrugOrgId(model.getDrugOrgId());
        return member;
    }


    @Override
    public List<Organization> getAllOrganizationList() {
        OrganizationExample organizationExample = new OrganizationExample();
        return organizationMapper.selectByExample(organizationExample);
    }

    @Override
    public List<SelectDto> getAllShopName() {
        List<Organization> list = getAllOrganizationList();
        List<SelectDto> dtoList = new ArrayList<>();
        list.stream().forEach(x -> {
            if (x.getCodeitemid().length() >= 9) {
                if (x.getCodeitemid().substring(0, 9).equals("102080202") || x.getCodeitemid().substring(0, 9).equals("102080203")
                        || x.getCodeitemid().substring(0, 9).equals("102080201")) {
                    SelectDto selectDto = new SelectDto();
                    selectDto.setValue(x.getCodeitemid());
                    selectDto.setLabel(x.getCodeitemdesc());
                    dtoList.add(selectDto);
                }
            }
        });
        return dtoList;
    }

    @Override
    public List<SelectDto> getAllmajor() {
        List<String> list = memberDao.getAllmajor();
        List<SelectDto> dtoList = new ArrayList<>();
        list.stream().forEach(x -> {
            SelectDto selectDto = new SelectDto();
            selectDto.setValue(x);
            selectDto.setLabel(x);
            dtoList.add(selectDto);
        });
        return dtoList;
    }

    @Override
    public List<SelectDto> getAllTitle() {
        List<String> list = memberDao.getAllTitle();
        List<SelectDto> dtoList = new ArrayList<>();
        list.stream().forEach(x -> {
            SelectDto selectDto = new SelectDto();
            selectDto.setValue(x);
            selectDto.setLabel(x);
            dtoList.add(selectDto);
        });
        return dtoList;
    }

    @Override
    public List<SelectDto> getAllDrugPosition() {
        return getItemSelectDtoByType(BaseConst.DRUG_DRGW);
    }

    @Override
    public List<SelectDto> getAllDrugTitle() {
        return getItemSelectDtoByType(BaseConst.DRUG_SBZC);
    }

    @Override
    public List<SelectDto> getAllDrugOrg() {
        return getItemSelectDtoByType(BaseConst.DRUG_BZZC);
    }

    @Override
    public List<SelectDto> getItemSelectDtoByType(String type) {
        List<Codeitem> list = codeItemService.getCodeitemBySetId(type);
        List<SelectDto> dtoList = new ArrayList<>();
        list.stream().forEach(x -> {
            SelectDto selectDto = new SelectDto();
            selectDto.setValue(x.getCodeitemid());
            selectDto.setLabel(x.getCodeitemdesc());
            dtoList.add(selectDto);
        });
        return dtoList;
    }

    @Override
    public List<SelectDto> getMemberEducation(String id) {
        String relationId = getMember(id).getRelationId();
        List<SelectDto> dtoList = new ArrayList<>();
        Usra04Example usra04Example = new Usra04Example();
        usra04Example.createCriteria().andA0100EqualTo(relationId);
        List<Usra04> list = usra04Mapper.selectByExample(usra04Example);
        list.stream().forEach(x -> {
            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, x.getA0405());
            if (codeitem != null) {//最高学历
                SelectDto selectDto = new SelectDto();
                selectDto.setValue(codeitem.getCodeitemid());
                selectDto.setLabel(codeitem.getCodeitemdesc());
                dtoList.add(selectDto);
            }
        });
        return dtoList;
    }

    @Override
    public List<SelectDto> getMemberMajor(String id) {
        String relationId = getMember(id).getRelationId();
        List<SelectDto> dtoList = new ArrayList<>();
        Usra04Example usra04Example = new Usra04Example();
        usra04Example.createCriteria().andA0100EqualTo(relationId);
        List<Usra04> list = usra04Mapper.selectByExample(usra04Example);
        list.stream().forEach(x -> {

            //待确认
/*            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AI, x.getA0410());
            if (codeitem != null) {//专业
                SelectDto selectDto = new SelectDto();
                selectDto.setValue(codeitem.getCodeitemid());
                selectDto.setLabel(codeitem.getCodeitemdesc());
                dtoList.add(selectDto);
            }*/

            SelectDto selectDto = new SelectDto();
            selectDto.setValue(x.getA0444());
            selectDto.setLabel(x.getA0444());
            dtoList.add(selectDto);


        });
        return dtoList;
    }

    @Override
    public List<VZhicheng> getMemberVZhichengr(String id) {
        VZhichengExample vZhichengExample = new VZhichengExample();
        vZhichengExample.createCriteria().andGhEqualTo(id);
        List<VZhicheng> list = vZhichengMapperMapper.selectByExample(vZhichengExample);
        return list;
    }

    @Override
    public List<MemberListDto> MemberListToDto(List<Member> list) {
        List<MemberListDto> daoList = new ArrayList<>();
        list.stream().forEach(x -> {
            MemberListDto dto = doToDto(x);
            daoList.add(dto);
        });
        return daoList;
    }

    @Override
    public MemberListDto getMemberToDto(String id) {
        return doToDto(getMember(id));
    }

    private MemberListDto doToDto(Member x) {
        MemberListDto dto = new MemberListDto();
        dto.setId(x.getId().toString());
        Usra01 usra01 = usra01Mapper.selectByPrimaryKey(x.getRelationId());
        if (usra01 != null) {
            dto.setAge(usra01.getA0112());
            dto.setBirthday(usra01.getA0111());
            dto.setMajor(usra01.getA0130());
            Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, usra01.getA0134());
            if (codeitem != null) {//最高学历
                dto.setEducation(codeitem.getCodeitemdesc());
            }
            dto.setIdCard(usra01.getA0177());
            //dto.setTitle("待定");
            List<VZhicheng> vZhichengList  = getMemberVZhichengr(x.getRelationId());
            String title = "";
            for (VZhicheng y:vZhichengList) {
                title += y.getZcjb()+ "/" + y.getZcsj().toString()+"<br>";
            }
            dto.setTitle(title);

            dto.setTitleTime(null);
            dto.setName(usra01.getA0101());
            Codeitem codeitemSex = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX, usra01.getA0107());
            if (codeitemSex != null) {
                dto.setSex(codeitemSex.getCodeitemdesc());
            }
            Organization organization = organizationMapper.selectByPrimaryKey(usra01.getA0192());
            if (organization != null) {
                dto.setShopName(organization.getCodeitemdesc());
            }
        }

        dto.setWorkTime(x.getWorkTime());
        dto.setEducationStatus(x.getEducationStatus());
        dto.setTrainStatus(x.getTrainStatus());
        dto.setHealthStatus(x.getHealthStatus());
        Organization organization = organizationMapper.selectByPrimaryKey(x.getDrugShopId());
        if (organization != null) {
            dto.setDrugShopName(organization.getCodeitemdesc());
        }

        Codeitem codeitem = codeItemService.getOneCodeitem(BaseConst.MEMBER_AM, x.getDrugEducationId());
        if (codeitem != null) {//药监学历
            dto.setDrugEducation(codeitem.getCodeitemdesc());
        }

        //待确认

              /*      Codeitem codeitemMajor = codeItemService.getOneCodeitem(BaseConst.MEMBER_AI,x.getDrugMajorId());
            if (codeitemMajor != null){//药监专业
                dto.setDrugMajor(codeitemMajor.getCodeitemdesc());
            }
*/
        dto.setDrugMajor(x.getDrugMajorId());

        Codeitem drugPositionOne = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionOneId());
        if (drugPositionOne != null) {//岗位1
            dto.setDrugPositionOne(drugPositionOne.getCodeitemdesc());
        }
        Codeitem drugPositionTwo = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionTwoId());
        if (drugPositionTwo != null) {//岗位2
            dto.setDrugPositionTwo(drugPositionTwo.getCodeitemdesc());
        }
        Codeitem drugPositionThree = codeItemService.getOneCodeitem(BaseConst.DRUG_DRGW, x.getDrugPositionThreeId());
        if (drugPositionThree != null) {//岗位3
            dto.setDrugPositionThree(drugPositionThree.getCodeitemdesc());
        }

        Codeitem drugOrg = codeItemService.getOneCodeitem(BaseConst.DRUG_BZZC, x.getDrugOrgId());
        if (drugOrg != null) {//药监编制职称
            dto.setDrugOrg(drugOrg.getCodeitemdesc());
        }

        Codeitem drugTitle = codeItemService.getOneCodeitem(BaseConst.DRUG_SBZC, x.getDrugTitleId());
        if (drugTitle != null) {//药监上报职称
            dto.setDrugTitle(drugTitle.getCodeitemdesc());
        }
        return dto;
    }

    @Override
    public int updateMember(UpdateMemberDto updateMemberDto) {

        Member member = memberMapper.selectByPrimaryKey(new Long(updateMemberDto.getId()));
        if (member == null) {
            return -1;
        }
        member.setDrugEducationId(updateMemberDto.getDrugEducationId());
        member.setWorkTime(updateMemberDto.getWorkTime());
        member.setDrugMajorId(updateMemberDto.getDrugMajorId());
        member.setDrugPositionOneId(updateMemberDto.getDrugPositionOneId());
        member.setDrugPositionTwoId(updateMemberDto.getDrugPositionTwoId());
        member.setDrugPositionThreeId(updateMemberDto.getDrugPositionThreeId());
        member.setDrugTitleId(updateMemberDto.getDrugTitleId());
        member.setDrugShopId(updateMemberDto.getDrugShopId());
        member.setDrugOrgId(updateMemberDto.getDrugOrgId());
        return memberMapper.updateByPrimaryKeySelective(member);
    }

    private static List<DepartmentDto> getThree(List<DepartmentDto> list, String parentId) {
        //获取所有子节点
        List<DepartmentDto> childTreeList = getChildTree(list, parentId);
        for (DepartmentDto dept : childTreeList) {
            dept.setChildren(getThree(list, dept.getId()));
        }
        return childTreeList;
    }

    private static List<DepartmentDto> getChildTree(List<DepartmentDto> list, String id) {
        List<DepartmentDto> childTree = new ArrayList<>();
        for (DepartmentDto dept : list) {
            if (dept.getParentId().equals(id)) {
                childTree.add(dept);
            }
        }
        return childTree;
    }
}
