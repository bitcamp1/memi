package com.memi.web.dao;

import java.util.List;

import com.memi.web.dto.Balance;
import com.memi.web.dto.PagingDto;

public interface BalanceDao {
	
	public void deleteBalance(String id) throws Exception;
	
	public Balance getBalanceById(String id) throws Exception;
	
	public int getBalanceCount() throws Exception;
	
	public List<Balance> getBalanceList(PagingDto pageInfo) throws Exception;
	
	public List<Balance> getBalances(String word) throws Exception;
	
	public void setBalance(Balance param) throws Exception;
	
	public void updateBalance(Balance param) throws Exception;

}
