package com.xdl.service;

import com.xdl.bean.BankAccount;
import com.xdl.mapper.BankAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * If you don't leave me ,I'll by your side utill
 * the life end.
 *
 * @Author zhukangle
 * @Date 2019/10/30
 * @Time 2:21 下午
 */
@Service("bankService")
public class BankAccountService {
@Autowired
private BankAccountDao accountDao;
public BankAccount  login(String no,String password) {
	return  accountDao.findByNoAndPwd(no, password);
}
}
