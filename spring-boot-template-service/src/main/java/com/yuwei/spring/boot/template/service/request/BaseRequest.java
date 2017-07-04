package com.yuwei.spring.boot.template.service.request;

import java.io.Serializable;

import lombok.Data;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 下午2:15 yuwei Exp
 */
@Data
public abstract class BaseRequest implements Serializable {

    /**
     * 请求ID
     */
    private String requestId;

    protected abstract String digest();
}
