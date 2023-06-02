package top.philsongzi.springtask.task;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @author 小子松
 * @version 1.0
 * @description 定时任务类。
 * @since 2023/6/2
 */
@Slf4j
@Component
public class CronTask {

    // 1. 支持 cron 表达式
    @Scheduled(cron = "0/1 * * ? * ?")
    public void cron() {
        // 每秒打印一次日志
        log.info("定时执行，时间：{}", DateUtil.now());
    }

    // 2. fixedRate 固定速率执行
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTimeWithFixedRate() {
        log.info("Current Thread : {}", Thread.currentThread().getName());
        log.info("Fixed Rate Task : The time is now {}", DateUtil.now());
    }

    // 3. fixedDelay 固定延迟执行
    @Scheduled(fixedDelay = 2000)
    public void reportCurrentTimeWithFixedDelay() {
        try {
            TimeUnit.SECONDS.sleep(3);
            log.info("Fixed Delay Task : The time is now {}",DateUtil.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 4. initialDelay 初始延迟
    @Scheduled(initialDelay = 5000, fixedRate = 5000)
    public void reportCurrentTimeWithInitialDelay() {
        log.info("Fixed Rate Task with Initial Delay : The time is now {}", DateUtil.now());
    }
}
