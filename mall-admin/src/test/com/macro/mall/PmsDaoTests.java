package com.macro.mall;


import com.macro.mall.dto.MemberListParam;
import com.macro.mall.model.Codeitem;
import com.macro.mall.model.Member;
import com.macro.mall.msservice.TestService;
import com.macro.mall.msservice.ZYService;
import com.macro.mall.service.MemberService;
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
    ZYService zyService
            ;
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsDaoTests.class);

    @Test
    public void  testsql(){
        List<com.macro.mall.msmodel.Test> list = testService.list("",1,10);
        LOGGER.info(list.toString());
    }

    @Test
    public void  testMember(){
        MemberListParam param  = new MemberListParam();
        List<Member> list = memberService.getMemberList(param);
        LOGGER.info(list.toString());
    }

    @Test
    public void  testzy(){
        List<Codeitem> list = zyService.getAllCodeItem();
        LOGGER.info(list.toString());
    }
}
