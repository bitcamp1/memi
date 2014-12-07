package com.memi.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.common.utils.Count;
import com.memi.web.dao.ColorDao;
import com.memi.web.dto.ColorDto;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.ColorService;
@Service
public class ColorServiceImpl implements ColorService{
	@Autowired
	ColorDao dao;

	@Override
	public Count getCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.getCount();
	}


	@Override
	public List<ColorDto> getColorList(PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		return dao.getColorList(pageInfo);
	}

	@Override
	public List<ColorDto> getColors(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ColorDto getColorById(String id)throws Exception {
		// TODO Auto-generated method stub
		return dao.getColorById(id);
	}


	@Override
	public void setColor(ColorDto color) throws Exception {
		dao.setColor(color);
		
	}

	@Override
	public void updateColor(List<ColorDto> params) throws Exception {
		dao.updateColor(params);
		
	}

	@Override
	public void deleteColor(String id) throws Exception {
		dao.deleteColor(id);
		
	}

	

}
