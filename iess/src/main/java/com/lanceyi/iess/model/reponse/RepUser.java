package com.lanceyi.iess.model.reponse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Lance YI
 * @date 2019/7/24 14:50
 */
@Data
public class RepUser {
    @ApiModelProperty("用户ID")
    private Long id;
    @ApiModelProperty("用户名称")
    private String name;
}
