package top.philsongzi.quartz.component;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import top.philsongzi.quartz.service.IScheduleService;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @since 2023/6/2
 */
@Slf4j
@Component
public class PublishPostJob extends QuartzJobBean {

    @Autowired
    private IScheduleService scheduleService;
    // IPostService 是编程喵中发布文章的服务，没带过来。
//    @Autowired
//    private IPostsService postsService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        Trigger trigger = context.getTrigger();
        JobDetail jobDetail = context.getJobDetail();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        Long data = jobDataMap.getLong("data");
        log.debug("定时发布文章操作：{}",data);

        // 获取文章的 ID后获取文章，更新文章为发布的状态，还有发布的时间
//        boolean success = postsService.updatePostByScheduler(data);
        boolean success = true;

        //完成后删除触发器和任务
        if (success) {
            log.debug("定时任务执行成功，开始清除定时任务");
            scheduleService.cancelScheduleJob(trigger.getKey().getName());
        }
    }
}
