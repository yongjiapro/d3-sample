package net.bytepowered.d3sample.infra.database.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 陈哈哈 (yongjia.chen@hotmail.com)
 * @since 1.0.0
 */
@Getter
@Setter
public abstract class BaseDO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long createdTime;
    private Long modifiedTime;

    public abstract Long getTenantId();

    public abstract void setTenantId(Long tenantId);

}
