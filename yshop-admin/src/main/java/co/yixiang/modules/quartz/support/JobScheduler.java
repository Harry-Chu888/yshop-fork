package co.yixiang.modules.quartz.support;

import co.yixiang.modules.quartz.domain.QuartzJob;

public interface JobScheduler {
    void add(QuartzJob job);
    void updateCron(QuartzJob job);
    void pause(QuartzJob job);
    void resume(QuartzJob job);
    void runNow(QuartzJob job);
    void delete(QuartzJob job);
}
