package net.bytepowered.d3sample.infra.database;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import net.bytepowered.d3sample.infra.database.dataobject.ProfileDO;

/**
 * @author 陈哈哈 (yongjia.chen@hotmail.com)
 * @since 1.0.0
 */
public interface IProfileRepository extends IService<ProfileDO> {

    interface Mapper extends BaseMapper<ProfileDO> {
    }
}
