package com.macro.mall.Task;


import com.macro.mall.service.NZYService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 更新定时任务相关配置
 * Created by macro on 2019/4/8.
 */
//@Configuration
@Slf4j
@Lazy(false)
@Component
@EnableScheduling
public class UpdateTask {

    @Autowired
    NZYService nzyService;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void task() {
        long start = System.currentTimeMillis();
        nzyService.getAllCodeItem();
        System.out.printf("UpdateTask任务" + nzyService.getAllCodeItem().size());
        long doTime = System.currentTimeMillis() - start;
        log.info("UpdateTask任务结束;耗时：{}}", doTime);
    }
}
