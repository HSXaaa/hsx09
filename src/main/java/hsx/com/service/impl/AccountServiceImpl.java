package hsx.com.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hsx.com.dao.AccountDao;
import hsx.com.entity.Account;
import hsx.com.service.AccountService;

/**
 * 帐号Service实现类
 * @author Administrator
 *
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{

	@Resource
	private AccountDao accountDao;
	
	@Transactional
	public void transferAccounts(int fromUser, int toUser, float account) {
		Account fromAccount=accountDao.getOne(fromUser);
		fromAccount.setBalance(fromAccount.getBalance()-account);
		accountDao.save(fromAccount);
		
		Account toAccount=accountDao.getOne(toUser);
		toAccount.setBalance(toAccount.getBalance()+account);
		//int zero=1/0;   验证异常情况
		accountDao.save(toAccount);
	}

}
