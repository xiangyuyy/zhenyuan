package com.macro.mall.Task;


import com.macro.mall.service.DrugReportService;
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

    @Autowired
    DrugReportService drugReportService;

    @Scheduled(cron = "0 0 1 * * ? ")
    public void task() {
        long start = System.currentTimeMillis();
        System.out.printf("UpdateTask任务每天1点执行" + nzyService.updataALL());
        long doTime = System.currentTimeMillis() - start;
        log.info("UpdateTask任务每天1点执行;耗时：{}}", doTime);

        System.out.printf("删除-1的drug_report任务每天1点执行" + drugReportService.deleteMoreDrugReport());
        long doTime1 = System.currentTimeMillis() - start;
        log.info("删除-1的drug_report任务每天1点执行;耗时：{}}", doTime);
    }
}
