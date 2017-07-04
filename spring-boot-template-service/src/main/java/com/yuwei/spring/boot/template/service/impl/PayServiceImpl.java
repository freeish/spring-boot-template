package com.yuwei.spring.boot.template.service.impl;

import com.yuwei.spring.boot.template.service.PayService;
import com.yuwei.spring.boot.template.service.request.PayRequest;
import com.yuwei.spring.boot.template.service.result.PayResult;
import com.yuwei.spring.boot.template.service.template.ServiceCallback;
import com.yuwei.spring.boot.template.service.template.ServiceTemplate;

import org.springframework.stereotype.Service;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 下午2:31 yuwei Exp
 */
@Service
public class PayServiceImpl implements PayService {

    @Override
    public PayResult pay(PayRequest request) {

        ThreadLocal<PayResult> result = new ThreadLocal<>();

        ServiceTemplate.getInstance().execute(new ServiceCallback() {

            @Override
            public void execute() {

                PayResult payResult = new PayResult();
                payResult.setSuccess(true);

                result.set(payResult);
            }
        });

        return result.get();
    }
}
