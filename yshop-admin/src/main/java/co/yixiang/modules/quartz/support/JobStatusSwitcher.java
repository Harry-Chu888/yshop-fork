package co.yixiang.modules.quartz.support;

import co.yixiang.modules.quartz.domain.QuartzJob;

public class JobStatusSwitcher {

    public static void toggle(QuartzJob job, JobScheduler scheduler) {
        if (job.getIsPause()) {
            scheduler.resume(job);
            job.setIsPause(false);
        } else {
            scheduler.pause(job);
            job.setIsPause(true);
        }
    }
}
