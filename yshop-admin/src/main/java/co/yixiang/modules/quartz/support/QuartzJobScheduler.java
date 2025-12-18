package co.yixiang.modules.quartz.support;

import co.yixiang.modules.quartz.domain.QuartzJob;
import co.yixiang.modules.quartz.utils.QuartzManage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuartzJobScheduler implements JobScheduler {

    private final QuartzManage quartzManage;

    @Override
    public void add(QuartzJob job) {
        quartzManage.addJob(job);
    }

    @Override
    public void pause(QuartzJob job) {
        quartzManage.pauseJob(job);
    }

    @Override
    public void resume(QuartzJob job) {
        quartzManage.resumeJob(job);
    }

    @Override
    public void runNow(QuartzJob job) {
        quartzManage.runJobNow(job);
    }

    @Override
    public void delete(QuartzJob job) {
        quartzManage.deleteJob(job);
    }

    @Override
    public void updateCron(QuartzJob job) {
        quartzManage.updateJobCron(job);
    }
}

