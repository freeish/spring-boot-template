package com.yuwei.spring.boot.template.dal.dataobject;

import java.util.Date;

import lombok.Data;


/**
 * @author yuwei
 * @version v 0.1 2017/7/4 上午11:48 yuwei Exp
 */
@Data
public class BaseDO {

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

}
