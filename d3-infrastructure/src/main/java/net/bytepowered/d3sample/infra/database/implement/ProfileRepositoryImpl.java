package net.bytepowered.d3sample.infra.database.implement;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.bytepowered.d3sample.infra.database.IProfileRepository;
import net.bytepowered.d3sample.infra.database.dataobject.ProfileDO;
import org.springframework.stereotype.Repository;

/**
 * @author 陈哈哈 (yongjia.chen@hotmail.com)
 * @since 1.0.0
 */
@Repository("profileRepository")
public class ProfileRepositoryImpl extends ServiceImpl<IProfileRepository.Mapper, ProfileDO>
        implements IProfileRepository {
}
