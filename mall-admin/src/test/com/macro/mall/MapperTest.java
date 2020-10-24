package com.macro.mall;

import com.macro.mall.bo.BaseConst;
import com.macro.mall.dto.MemberListParam;
import com.macro.mall.model.*;
import com.macro.mall.msservice.TestService;
import com.macro.mall.msservice.ZYService;
import com.macro.mall.service.CodeItemService;
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
public class MapperTest {

    @Autowired
    CodeItemService codeItemService;

    @Autowired
    MemberService memberService;

    @Autowired
    ZYService zyService;

    @Autowired
    NZYService nzyService;
    private static final Logger LOGGER = LoggerFactory.getLogger(MapperTest.class);

    @Test
    public void  testsql(){
        List<Codeitem> list = codeItemService.getAllCodeitem();
        List<Codeitem> list1 = codeItemService.getCodeitemBySetId(BaseConst.MEMBER_AX);
        Codeitem list2 = codeItemService.getOneCodeitem(BaseConst.MEMBER_AX,"1");
        LOGGER.info(list.toString());
    }

}

