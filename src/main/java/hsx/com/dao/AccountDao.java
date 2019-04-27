package hsx.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hsx.com.entity.Account;

/**
 * 账户Dao接口
 * @author Administrator
 *
 */
public interface AccountDao extends JpaRepository<Account, Integer>{

}
