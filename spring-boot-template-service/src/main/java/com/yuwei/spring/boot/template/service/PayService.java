package com.yuwei.spring.boot.template.service;

import com.yuwei.spring.boot.template.service.request.PayRequest;
import com.yuwei.spring.boot.template.service.result.PayResult;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 下午2:12 yuwei Exp
 */
public interface PayService {

    /**
     * 支付服务
     *
     * @param request 支付请求
     * @return 支付结果
     */
    PayResult pay(PayRequest request);

}
