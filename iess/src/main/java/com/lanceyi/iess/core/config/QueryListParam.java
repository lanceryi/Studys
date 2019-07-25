package com.lanceyi.iess.core.config;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Lance YI
 * @date 2019/7/25 9:23
 */
@Data
public class QueryListParam {
    @ApiModelProperty("页数")
    private Integer pageSize = 20;
    @ApiModelProperty("第几页")
    private Integer pageIndex = 1;
}
