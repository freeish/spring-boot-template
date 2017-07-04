package com.yuwei.spring.boot.template.dal.mapper;

import com.yuwei.spring.boot.template.dal.dataobject.PayOrderDO;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 上午11:54 yuwei Exp
 */
public interface PayOrderMapper {

    /**
     * 获取支付订单
     *
     * @return 支付订单
     */
    PayOrderDO select();
}
