package com.memi.web.services;

import java.util.List;

import com.memi.web.common.utils.Count;
import com.memi.web.dto.ColorDto;
import com.memi.web.dto.CustDto;
import com.memi.web.dto.PagingDto;

public interface ColorService {

	
	public Count getCount() throws Exception;
	
	public List<ColorDto> getColorList(PagingDto pageInfo)throws Exception;
	
	public List<ColorDto> getColors(String word)throws Exception;
	
	public ColorDto getColorById(String id)throws Exception;
	

	public void setColor(ColorDto color)throws Exception;

	public void updateColor(List<ColorDto> params)throws Exception;
	
	public void deleteColor(String id)throws Exception;
	
	

}
