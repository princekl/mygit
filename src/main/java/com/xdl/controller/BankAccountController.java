package com.xdl.controller;

import com.xdl.bean.BankAccount;
import com.xdl.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * If you don't leave me ,I'll by your side utill
 * the life end.
 *
 * @Author zhukangle
 * @Date 2019/10/30
 * @Ti me 2:20 下午
 */
@Controller
public class BankAccountController {
@Autowired
private BankAccountService bankService;

@RequestMapping("/toLogin.do")
public String toLogin() {
	return "login";
}

@RequestMapping("/toMain.do")
public String toMain() {
	return "main";
}
@RequestMapping("/login.do")
public String login(String no, String password, HttpServletRequest request) {
	BankAccount account = bankService.login(no, password);
	if (account != null) {
		request.getSession().setAttribute("account", account);
		return "redirect:toMain.do";
	}
	request.setAttribute("msg", "登录失败");
	return "login";
}
}

