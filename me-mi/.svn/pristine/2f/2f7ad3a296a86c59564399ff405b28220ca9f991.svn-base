package com.memi.web.dao;

import java.util.List;

import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TariffDto;
import com.memi.web.dto.TelecomDto;

public interface TariffDao {


	 public int getCount() throws Exception;

     public int getCountByWord(String word)throws Exception;  
    
     public int getMaxSeq()throws Exception ;
    
     public List <TariffDto> getTariffList(PagingDto pageInfo)throws Exception;
    
     public List <TariffDto> getTariffsByWord(String word)throws Exception;
    
     public TariffDto getTariffByID(String id )throws Exception;
    
     public TariffDto getTariffBySeq(int seq)throws Exception;

     public void setTariff(TariffDto param)throws Exception;

     public void updateTariff(TariffDto param)throws Exception;
    
     public void deleteTariffByID(int id)throws Exception;

}
