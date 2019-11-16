package com.xdl.test;

import com.xdl.service.BankAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * If you don't leave me ,I'll by your side utill
 * the life end.
 *
 * @Author zhukangle
 * @Date 2019/11/16
 * @Time 9:20 上午
 */
public class Test {
public static void main(String[] args) {
	ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
	BankAccountService bankAccountService = (BankAccountService)app.getBean("bankService");
	System.out.println(bankAccountService.login("aa", "aa"));
}
}
