package net.bytepowered.d3sample.infra.database.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 陈哈哈 (yongjia.chen@hotmail.com)
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_account")
public class AccountDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    /**
     * 所属租户ID
     */
    private Long tenantId;

    /**
     * 用户OpenId
     */
    private String openId;

    /**
     * 用户名：唯一性
     */
    private String username;

    /**
     * 邮件地址：唯一性
     */
    private String email;

    /**
     * 手机：唯一性
     */
    private String mobile;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 激活：0-未激活；1-已激活；2-禁用
     */
    private Integer active;

    /**
     * 类型
     */
    private Integer type;

}
