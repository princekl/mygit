package com.xdl.bean;

/**
 * If you don't leave me ,I'll by your side utill
 * the life end.
 *
 * @Author zhukangle
 * @Date 2019/10/30
 * @Time 2:19 下午
 */
public class BankAccount {
	private int id;
	private String no;
	private String password;
	private int money;

@Override
public String toString() {
	return "BankAccount{" +
			       "id=" + id +
			       ", no='" + no + '\'' +
			       ", password='" + password + '\'' +
			       ", money=" + money +
			       '}';
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNo() {
	return no;
}

public void setNo(String no) {
	this.no = no;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getMoney() {
	return money;
}

public void setMoney(int money) {
	this.money = money;
}

public BankAccount(int id, String no, String password, int money) {
	this.id = id;
	this.no = no;
	this.password = password;
	this.money = money;
}

public BankAccount() {
}
}
