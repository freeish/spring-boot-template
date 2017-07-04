package com.yuwei.spring.boot.template.service.request;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import lombok.Data;

/**
 * @author yuwei
 * @version v 0.1 2017/7/4 下午2:14 yuwei Exp
 */
@Data
public class PayRequest extends BaseRequest {

    private static final long serialVersionUID = 8057830254808022390L;

    /**
     * 金额
     */
    private int amount;

    @Override
    protected String digest() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
