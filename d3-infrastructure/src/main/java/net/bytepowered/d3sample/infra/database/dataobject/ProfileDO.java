package net.bytepowered.d3sample.infra.database.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 陈哈哈 (yongjia.chen@hotmail.com)
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_profile")
public class ProfileDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    /**
     * 所属租户ID
     */
    private Long tenantId;

    /**
     * 所属帐号ID
     */
    private Long accountId;

    /**
     * 头像地址
     */
    private String avatarUri;

    /**
     * 所属地区
     */
    private String region;

    /**
     * 用户语言
     */
    private String lang;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 国家码
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 其它地址
     */
    private String address;

}
