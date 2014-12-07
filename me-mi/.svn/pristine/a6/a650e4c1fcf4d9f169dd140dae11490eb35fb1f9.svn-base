package com.memi.web.dto;

import java.io.Serializable;

public class PagingDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static final int ROWS_PER_PAGE = 20;
	public static final int PAGES_PER_BLOCK = 10;
	public static final int DEFAULT_PAGE = 1;
	
	
	private String strPageNo; //  파라미터로 넘어 온 page 번호
	private int pageNo; // 
	private int limit; //한페이지당 보여줄 최대 아이템 수
	private int offset; //해당 페이지의 시작 아이템번호..0부터
	private int endRow; //페이지 마지막 row 값
	// offset + limit = (pageNo + 1) * pageSize
	
	private int totRow; //  전체 Row 수
	private int totPage; // 전체 Page 수
	private int totBlock; // 전체 블록
	private int nowBlock; // 현재 page가 속한 블록
	private int maxSeq; // Seq 최대값 , 가장 최근에 입력한 값
	private int startPage; // 블록에서 처음 시작하는 page 번호
	private int endPage; //블록에서 마지막 page 번호
	private String pageLinkUrl=""; //12.페이지 인덱스를 클릭했을때 호출하는 기본URL
	private String srchWord; // 검색어
	private int count; // 갯수반환
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	public String getSrchWord() {
		return srchWord;
	}
	public void setSrchWord(String srchWord) {
		this.srchWord = srchWord;
	}
	
		/*
		 * 생성자
		 * @param totRow // total rows
		 * @param rowsPerPage  // rows per page
		 * @param pagesPerAll // link per page
		 * @param pageLinkUrl  
		 * */
	

	public PagingDto() {
		super();
	}




	public PagingDto(int totRow,String strPageNo, String pageLinkUrl) {
			super();

			this.totRow = totRow;
			this.strPageNo = strPageNo;
			this.pageLinkUrl = pageLinkUrl;
			initPage();
		}
	

	private void initPage() { // page initialize..
		System.out.println("페이징init함수:setRowNo 연산 진입");
		totPage = (int)Math.ceil( (float)totRow / (float)ROWS_PER_PAGE ); //  전체페이지
		if(strPageNo==null){pageNo = 1;}
		
		else if(strPageNo.equals("PREV")){  
			// 이전페이지인경우 가장 처음이 아닌경우 페이지그룹인덱스 1감소
			if((nowBlock -1)>=0){nowBlock--;}
			//현재 페이지인덱스는 이동한 페이지그룹의 첫번째 페이지인덱스로 설정된다.
			pageNo = nowBlock * PAGES_PER_BLOCK; 
			
		}else if(strPageNo.equals("NEXT")){ 
			//다음페이지인경우 가장 마지막이 아닌경우 페이지그룹인덱스 1증가
			if((nowBlock+1)<=totBlock){
				nowBlock++;
			}
			   //현재 페이지인덱스는 이동한 페이지그룹의 첫번째 페이지인덱스로 설정된다.
			pageNo = nowBlock * PAGES_PER_BLOCK;
		}else{
			pageNo = Integer.valueOf(strPageNo);
		}
		System.out.println("페이징 생성자 내부 현재페이지 pageNo :"+ pageNo);
		// 선택한 페이지에 보여지는 첫번째 Row Num
		if(totRow % ROWS_PER_PAGE!=0){
			totPage ++;
		}
		totBlock = (int)Math.ceil( (float)totPage/(float)PAGES_PER_BLOCK );
		nowBlock = (int)Math.ceil( (float)pageNo/(float)PAGES_PER_BLOCK ); // 현재페이지가 속한 블록
		
		/*endRow = offset + ROWS_PER_PAGE -1; 일련번호가 아니라 중간에 빠진 번호가 있으므로 의미가 없다 */
		//3. to get the start page number
		
		offset = (pageNo-1)*ROWS_PER_PAGE;
		System.out.println("offset 번호:"+offset);
		
		
		//offset = (pageNo+1)*ROWS_PER_PAGE - ROWS_PER_PAGE;		
		// 선택한 페이지에 보여지는 마지막 Row Num
		endRow = (pageNo+1)*ROWS_PER_PAGE;
		// 선택한 블록에서 첫번째 페이지 번호 ( 페이지 그룹 번호 * 번호갯수 * 보여지는 Row 수 ) - 보여지는 Row 수
		startPage = (nowBlock-1)* PAGES_PER_BLOCK+1;
		endPage = startPage+PAGES_PER_BLOCK-1;
		// 선택한 블록에서 마지막 페이지 
		// 이동한 페이지 그룹이 마지막 그룹페이지인 경우 남은 페이지 인덱스만 보여준다
		/*
		if(totBlock==(nowBlock+1)){
			endPage = (nowBlock*PAGES_PER_BLOCK)+(totPage%PAGES_PER_BLOCK);
		}else if(totBlock>1){
			endPage = (nowBlock*PAGES_PER_BLOCK)+PAGES_PER_BLOCK;
		}else{
			endPage = totPage;
		}
		*/
		//1. to get the total page number
		/*if(totRow % ROWS_PER_PAGE==0){
			totPage = totRow % ROWS_PER_PAGE;
		}else{
			totPage = totRow % ROWS_PER_PAGE+1;
		} 아래와 같은 의미라서 ...*/
		
		
	}
	


	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}
	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	/**
	 * @param setIndex the setIndex to set
	 * 해당 Row넘버의 페이지 설정
	 */
	public void setRowNo(String str_rowNo) {
		
		
	}
public String getStrPageNo() {
	return strPageNo;
}
	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}
	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * @return the endRow
	 */
	public int getEndRow() {
		return endRow;
	}
	/**
	 * @return the totRow
	 */
	public int getTotRow() {
		return totRow;
	}
	/**
	 * @return the totPage
	 */
	public int getTotPage() {
		return totPage;
	}
	public int getTotBlock() {
		return totBlock;
	}
	/**
	 * @return the nowBlock
	 */
	public int getNowBlock() {
		return nowBlock;
	}
	/**
	 * @return the maxSeq
	 */
	public int getMaxSeq() {
		return maxSeq;
	}
	/**
	 * @return the startPage
	 */
	public int getStartPage() {
		return startPage;
	}
	/**
	 * @return the endPage
	 */
	public int getEndPage() {
		return endPage;
	}
	/**
	 * @return the pageLinkUrl
	 */
	public String getPageLinkUrl() {
		return pageLinkUrl;
	}
public void setStrPageNo(String strPageNo) {
	this.strPageNo = strPageNo;
}
	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	/**
	 * @param endRow the endRow to set
	 */
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	/**
	 * @param totRow the totRow to set
	 */
	public void setTotRow(int totRow) {
		this.totRow = totRow;
	}
	/**
	 * @param totPage the totPage to set
	 */
	public void setTotPage(int totPage) {
		this.totPage = totPage;
	}
	public void setTotBlock(int totBlock) {
		this.totBlock = totBlock;
	}
	/**
	 * @param nowBlock the nowBlock to set
	 */
	public void setNowBlock(int nowBlock) {
		this.nowBlock = nowBlock;
	}
	/**
	 * @param maxSeq the maxSeq to set
	 */
	public void setMaxSeq(int maxSeq) {
		this.maxSeq = maxSeq;
	}
	/**
	 * @param startPage the startPage to set
	 */
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	/**
	 * @param endPage the endPage to set
	 */
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	/**
	 * @param pageLinkUrl the pageLinkUrl to set
	 */
	public void setPageLinkUrl(String pageLinkUrl) {
		this.pageLinkUrl = pageLinkUrl;
	}

}

