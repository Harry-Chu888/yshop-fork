package co.yixiang.modules.quartz.support;

import co.yixiang.modules.quartz.service.dto.QuartzJobDto;

import java.util.LinkedHashMap;
import java.util.Map;

public class QuartzJobExcelMapper {

    public static Map<String, Object> toMap(QuartzJobDto job) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("Spring Bean名称", job.getBeanName());
        map.put("cron 表达式", job.getCronExpression());
        map.put("状态：1暂停、0启用", job.getIsPause());
        map.put("任务名称", job.getJobName());
        map.put("方法名称", job.getMethodName());
        map.put("参数", job.getParams());
        map.put("备注", job.getRemark());
        map.put("创建日期", job.getCreateTime());
        return map;
    }
}
