package com.memi.web.dao;

import java.util.List;

import com.memi.web.dto.PagingDto;
import com.memi.web.dto.ShopDto;

public interface ShopDao {
    public int getCount() throws Exception;

    public int getCountByWord(String word)throws Exception;  
   
    public int getMaxSeq()throws Exception ;
   
    public List <ShopDto> getShopList(PagingDto pageInfo)throws Exception;
   
    public List <ShopDto> getShopsByWord(String word)throws Exception;
   
    public ShopDto getShopByID(String id )throws Exception;
   
    public ShopDto getShopBySeq(int seq)throws Exception;

    public void setShop(ShopDto param)throws Exception;

    public void updateShop(ShopDto param)throws Exception;
   
    public void deleteShopByID(String id)throws Exception;
   

}
