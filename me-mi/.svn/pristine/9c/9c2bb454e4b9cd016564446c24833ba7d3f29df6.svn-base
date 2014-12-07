package com.memi.web.dao;

import java.util.List;

import com.memi.web.common.utils.Count;
import com.memi.web.dto.ColorDto;
import com.memi.web.dto.PagingDto;

public interface ColorDao {

	public Count getCount() throws Exception ;
    
    public List < ColorDto> getColorList( PagingDto pageInfo )throws Exception ;
   
    public List < ColorDto> getColors( String word )throws Exception ;
   
    public ColorDto getColorById( String id )throws Exception ;
   

    public void setColor( ColorDto color )throws Exception ;

    public void updateColor( List< ColorDto > colors )throws Exception ;
   
    public void deleteColor(String id )throws Exception ;

	

}
