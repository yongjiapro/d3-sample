package net.bytepowered.d3sample.infra.database.implement;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.bytepowered.d3sample.infra.database.IAccountRepository;
import net.bytepowered.d3sample.infra.database.dataobject.AccountDO;
import org.springframework.stereotype.Repository;

/**
 * @author 陈哈哈 (yongjia.chen@hotmail.com)
 * @since 1.0.0
 */
@Repository("accountRepository")
public class AccountRepositoryImpl extends ServiceImpl<IAccountRepository.Mapper, AccountDO>
        implements IAccountRepository {
}
