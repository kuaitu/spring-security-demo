package com.lmk.springsecuritydemo.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lmk.springsecuritydemo.base.entity.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
  * 角色用户关系表
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_role_user")
@ApiModel(value="RoleUser对象", description="角色用户关系表")
public class RoleUser extends BaseModel
<Integer> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    private Long sysUserId;

    @ApiModelProperty(value = "角色id")
    private Long sysRoleId;


}
