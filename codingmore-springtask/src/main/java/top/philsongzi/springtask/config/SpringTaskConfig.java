package top.philsongzi.springtask.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @since 2023/6/2
 */
@Configuration  // 配置类
@EnableScheduling   // 开启 spring task
public class SpringTaskConfig implements SchedulingConfigurer {

    /**
     * 默认情况下，@Scheduled  创建的线程池大小为 1，
     * 如果想增加线程池大小的话，可以让 SpringTaskConfig 类实现 SchedulingConfigurer 接口，
     * 通过 setPoolSize 增加线程池大小。
     * @param taskRegistrar
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();

        threadPoolTaskScheduler.setPoolSize(10);
        threadPoolTaskScheduler.setThreadNamePrefix("my-scheduled-task-pool-");
        threadPoolTaskScheduler.initialize();

        taskRegistrar.setTaskScheduler(threadPoolTaskScheduler);
    }
}
