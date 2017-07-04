package com.yuwei.spring.boot.template.service.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 下午2:43 yuwei Exp
 */
@Slf4j
public final class ServiceTemplate {

    private static ServiceTemplate instance = new ServiceTemplate();

    /**
     * 禁用构造函数
     */
    private ServiceTemplate() {
    }

    public static ServiceTemplate getInstance() {
        return instance;
    }


    public void execute(ServiceCallback callback) {

        try {

            callback.execute();
        } catch (Throwable throwable) {

            log.error("execute fail", throwable);
        } finally {

        }
    }
}
