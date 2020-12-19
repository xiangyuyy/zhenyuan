package com.macro.mall;

import cn.hutool.json.JSONUtil;
import com.alibaba.druid.support.json.JSONParser;
import com.macro.mall.bo.BaseConst;
import com.macro.mall.dto.DepartmentDto;
import com.macro.mall.dto.DepartmentShopDto;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.dto.SelectDto;
import com.macro.mall.model.*;
import com.macro.mall.msdao.ZYOrganizationMapper;
import com.macro.mall.msservice.TestService;
import com.macro.mall.msservice.ZYService;
import com.macro.mall.service.CodeItemService;
import com.macro.mall.service.DrugReportService;
import com.macro.mall.service.MemberService;
import com.macro.mall.service.NZYService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springfox.documentation.spring.web.json.Json;
import springfox.documentation.spring.web.json.JsonSerializer;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    CodeItemService codeItemService;

    @Autowired
    MemberService memberService;

    @Autowired
    DrugReportService drugReportService;

    @Autowired
    ZYOrganizationMapper zyOrganizationMapper;


    @Autowired
    ZYService zyService;

    @Autowired
    NZYService nzyService;
    private static final Logger LOGGER = LoggerFactory.getLogger(MapperTest.class);

    @Test
    public void  testItem(){
        List<Codeitem> list = codeItemService.getAllCodeitem();
/*        codeItemService.addOrUpdateItem(BaseConst.DRUG_DRGW,null,"岗位1");
        codeItemService.addOrUpdateItem(BaseConst.DRUG_DRGW,null,"岗位2");
        codeItemService.addOrUpdateItem(BaseConst.DRUG_DRGW,null,"岗位3");

        codeItemService.addOrUpdateItem(BaseConst.DRUG_BZZC,null,"药监编制职称1");
        codeItemService.addOrUpdateItem(BaseConst.DRUG_BZZC,null,"药监编制职称2");
        codeItemService.addOrUpdateItem(BaseConst.DRUG_BZZC,null,"药监编制职称3");

        codeItemService.addOrUpdateItem(BaseConst.DRUG_SBZC,null,"药监上报职称1");
        codeItemService.addOrUpdateItem(BaseConst.DRUG_SBZC,null,"药监上报职称2");
        codeItemService.addOrUpdateItem(BaseConst.DRUG_SBZC,null,"药监上报职称3");*/
        codeItemService.addOrUpdateItem(BaseConst.DRUG_SBZC,"1603771870894","药监上报职称33");

        LOGGER.info(list.toString());
    }

    @Test
    public void  testsql(){
        List<Codeitem> list = codeItemService.getAllCodeitem();
        List<Codeitem> list1 = codeItemService.getCodeitemBySetId(BaseConst.MEMBER_AX);
        Codeitem list2 = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX,"1");
        LOGGER.info(list.toString());
    }

    @Test
    public void  testsql1(){
   /*     List<SelectDto> list = memberService.getAllDrugTitle();
        Long a = new Long(1000000000);
        Member s = memberService.getMember(a);*/
/*        List<Organization> list1 = zyOrganizationMapper.getInintOrganization();
        List<DepartmentDto> list2 = memberService.getAllDepartment();
        List<DepartmentShopDto> list3 = memberService.getAllDepartmentShop();*/

        //nzyService.insertDrugCount();

        drugReportService.deleteMoreDrugReport();
        LOGGER.info("12");
    }

    @Test
    public void  testsql12(){
        DrugCount list = drugReportService.getDrugCountByShopId("10301");
        DrugCount drugCount = new DrugCount();
        drugCount.setArea(new BigDecimal(1212.12));
        drugCount.setChineseMedicine(1);
        drugCount.setLongRange(1);
        drugCount.setSubjection(1);
        drugCount.setMechanic(12);
        drugCount.setPharmacist(33);
        drugCount.setPraChinesePharmacist(2323);
        drugCount.setPraPharmacist(121);
        drugCount.setShopId("10301");
        drugReportService.addOrUpdateDrugCount(drugCount);
        DrugCount list1 = drugReportService.getDrugCountByShopId("10301");
        LOGGER.info(list.toString());
    }
}

