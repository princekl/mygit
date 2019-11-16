package com.xdl.mapper;

import com.xdl.bean.BankAccount;
import org.apache.ibatis.annotations.Param;

/**
 * If you don't leave me ,I'll by your side utill
 * the life end.
 *
 * @Author zhukangle
 * @Date 2019/10/30
 * @Time 2:22 下午
 */
public interface BankAccountDao {
		BankAccount findByNoAndPwd(@Param("no") String no, @Param("password") String password);
}
