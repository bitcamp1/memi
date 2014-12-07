package com.memi.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.dao.ShopDao;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.ShopDto;
import com.memi.web.services.ShopService;
@Service
public class ShopServiceImpl implements ShopService{
@Autowired
ShopDao dao;
	@Override
	public int getCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.getCount();
	}

	@Override
	public int getCountByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return dao.getCountByWord(word);
	}

	@Override
	public int getMaxSeq() throws Exception {
		// TODO Auto-generated method stub
		return dao.getMaxSeq();
	}

	@Override
	public List<ShopDto> getShopList(PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		return dao.getShopList(pageInfo);
	}

	@Override
	public List<ShopDto> getShopsByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return dao.getShopsByWord(word);
	}

	@Override
	public ShopDto getShopByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getShopByID(id) ;
	}

	@Override
	public ShopDto getShopBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return dao.getShopBySeq(seq);
	}

	@Override
	public void setShop(ShopDto param) throws Exception {
		dao.setShop(param);
		
	}

	@Override
	public void updateShop(ShopDto param) throws Exception {
		dao.updateShop(param);
		
	}

	@Override
	public void deleteShopByID(String id) throws Exception {
		dao.deleteShopByID(id);
		
	}

}
