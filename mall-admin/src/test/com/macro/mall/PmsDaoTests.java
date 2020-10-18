package com.macro.mall;


import com.macro.mall.msservice.TestService;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsDaoTests.class);

    @Test
    public void  testsql(){
        List<com.macro.mall.msmodel.Test> list = testService.list("",1,10);
        LOGGER.info(list.toString());
    }
}
