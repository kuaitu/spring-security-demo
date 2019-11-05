package com.lmk.springsecuritydemo.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public abstract class BaseModel<ID extends Serializable> implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private ID id;

}
