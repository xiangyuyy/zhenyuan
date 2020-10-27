package com.macro.mall;


import com.macro.mall.dto.MemberListDto;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.model.*;
import com.macro.mall.msservice.TestService;
import com.macro.mall.msservice.ZYService;
import com.macro.mall.service.MemberService;
import com.macro.mall.service.NZYService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsDaoTests {
    @Autowired
    TestService testService;

    @Autowired
    MemberService memberService;

    @Autowired
    ZYService zyService;

    @Autowired
    NZYService nzyService;
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsDaoTests.class);

    @Test
    public void  testsql(){
        List<com.macro.mall.msmodel.Test> list = testService.list("",1,10);
        LOGGER.info(list.toString());
    }

    @Test
    public void  testMember(){
        MemberListParam param  = new MemberListParam();
 /*       param.setMajor("药学");
        param.setShopId("10301");
        param.setName("陈伟");*/
        List<Member> list = memberService.getMemberList(param);

        List<MemberListDto> list1 = memberService.MemberListToDto(list);
        //List<Member> list1 = memberService.getAllMemberList();
        LOGGER.info(list.toString());
    }

    @Test
    public void  testzy(){
        List<Codeitem> list = zyService.getAllCodeItem();
        List<Organization> list8 = zyService.getAllOrganization();
        List<Usra01> list1 = zyService.getAllUsra01();
        List<Usra04> list3 = zyService.getAllUsra04();
        List<Usra22> list4 = zyService.getAllUsra22();
        List<Usra64> list5 = zyService.getAllUsra64();
        List<Usra65> list6 = zyService.getAllUsra65();
        List<Usra71> list7 = zyService.getAllUsra71();
        LOGGER.info(list.toString());
    }

    @Test
    public void  testInset(){
        List<Codeitem> list = zyService.getAllCodeItem();
        nzyService.insertAllCodeItem(list);

        List<Codeitem> list1 = nzyService.getAllCodeItem();

      /*  List<Organization> list2 = zyService.getInintOrganization();
        nzyService.insertAllOrganization(list2);
        List<Organization> list3 = nzyService.getAllOrganization();

        List<Usra01> list4 = zyService.getInintUsra01();
        nzyService.insertAllUsra01(list4);

        List<Usra01> list5 = nzyService.getAllUsra01();
        List<Member> list6 = memberService.getAllMemberList();*/


        LOGGER.info("1212");
    }
}
