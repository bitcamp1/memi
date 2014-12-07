package com.memi.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.common.utils.Count;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.Usim;
import com.memi.web.dao.UsimDao;
import com.memi.web.services.UsimService;
@Service
public class UsimServiceImpl implements UsimService{
@Autowired
UsimDao dao;

@Override
public void deleteUsim(String id) throws Exception {
	dao.deleteUsim(id);
	
}


@Override
public Usim getUsimById(String id) throws Exception {
	// TODO Auto-generated method stub
	return dao.getUsimById(id);
}



@Override
public Count getUsimCount() throws Exception {
	return dao.getUsimCount();
}

@Override
public List<Usim> getUsimList(PagingDto pageInfo) throws Exception {
	// TODO Auto-generated method stub
	return dao.getUsimList(pageInfo);
}

@Override
public void setUsim(Usim usim) throws Exception {
	// TODO Auto-generated method stub
	dao.setUsim(usim);
}

@Override
public void updateUsim(Usim usim) throws Exception {
	// TODO Auto-generated method stub
	dao.updateUsim(usim);
}


@Override
public List<Usim> getUsims(String word) throws Exception {
	// TODO Auto-generated method stub
	return dao.getUsims(word);
}

}
