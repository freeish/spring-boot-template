package com.yuwei.spring.boot.template.dal.dataobject;

import lombok.Data;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 上午11:53 yuwei Exp
 */
@Data
public class PayOrderDO extends BaseDO {

    /**
     * 金额
     */
    private int amount;
}
