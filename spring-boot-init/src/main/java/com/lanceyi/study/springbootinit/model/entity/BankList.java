package com.lanceyi.study.springbootinit.model.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lanceyi
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BankList对象", description="")
public class BankList implements Serializable {

    private static final long serialVersionUID = 1L;

    private String storeNo;

    private String dealTime;

    private String orderNo;

    private BigDecimal orderAmount;

    private Integer useStatus;

    private Integer userId;

    private String addTime;

    private String ip;


}
