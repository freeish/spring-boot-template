package com.yuwei.spring.boot.template.service.result;

import java.io.Serializable;

import lombok.Data;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 下午2:24 yuwei Exp
 */
@Data
public abstract class BaseResult implements Serializable {

    /**
     * 是否处理成功，默认为false
     */
    private boolean success = false;

}
