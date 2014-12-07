<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	#gesi_u{width:100%; height:100px;}
	#gesi_u tr td{border:1px solid red;}
	
</style>    

<table id='gesi_bx'>
  <tr>
    <td>공지사항</td>
    <td >
    		<div height="26">
			<span class='blueFont' >  검색 </span>
			    <select name="sitem">
		            <option value="1">기간</option>
	            </select>
            <input type="text" name="gesi_srch" value="" class="input_text imea" size="25" onkeydown="if (event.keyCode == 13) {document.schFrm.submit();}">
            <input type="button" id='' class="cshand button06"  value=" 검 색 " >
		</div>
     </td>
  </tr>
  <tr>
    <td colspan="2">
    <input type='button' value='입력' class='pointer buttion06 fancybox' id='gesi_c_bt'/>
    <input type='button' value='수정' />
    <input type='button' value='삭제'/>
    <input type='button' value='게시판관리'/>
    </td>
  </tr>
</table>
 
<div id='gesi_srchform'>
		
</div>
<table id='gesi_gd'></table>
<div id='pager'></div>
<script>
	$(function(){
		$('#gesi_bx input').addClass('pointer');
		$('#gesi_u_bt').fancybox({
			helpers :{overlay:{locked : false}},
			href : '',// ${home}/gesi/update.do
			'scrolling'		: 'no',
			'titleShow'		: false,
			'width'			: 1200,
			'height'		: 700,
			'autoSize'		: false,
			'transitionIn'	: 'elastic',
			'transitionOut'	: 'elastic',
			'overlayShow'	: false,
			'type'          :'iframe'
		});
		
	});
	
		
	


$(function(){
	function underline(cellvalue, options, rowObject ){
		var url='<span style="text-decoration:underline; cursor:pointer">'+cellvalue+'</span>';
		return url;
		
	}
	function tooltip(rowid,rdata){
		return 'style="color:red"';
	}
	function ShowMessage(data,result){
		
	}

          $('#gesi_gd').jqGrid({
        	  url:'',  // '${home}/gesi/list.do'
        	  datatype:'json',
        	  mtype:'POST',
        	 colNames:['ㅁ', 'No','등록일','제목',
        	            '수신처','설정|조회|문자','작성자'],
        	  colModel:[
						{name:'ckbox',index:'ckbox',width:100,align:'center',hidden:true},
						{name:'gesiNo',index:'gesiNo',width:100,align:'center',hidden:true},
        	            {name:'regDate',index:'regDate',width:100,align:'center'},
        	            {name:'title',index:'title',width:50,align:'center'},
        	            {name:'susincho',index:'susincho',width:50,align:'center'},
        	            {name:'setting',index:'setting',width:50,align:'center'},
        	            {name:'wrter',index:'wrter',width:100,align:'center'},
        	            ],
              pager:"#pager",
              pagenation:true,
              rowNum:10,
              rowList:[10,20,30],
              rownumbers:true,
              sortname : 'gesiNo',
              emptycords:'등록된 단가가 없습니다.',
              viewrecords:true,
              sortorder:"desc",
              viewrecordes:true,
              gridview:true,
              autoencode:true,
        	  caption:'단가 목록',
        	  autowidth:true,
        	 /*  multiselect:true, */
        	  height:'auto',
        	  jsonReader:{
        		  repeatitems:false,
        		  id:"gesiNo",
        		  page:'page',
        		  total:'total'
        	  }
        	  ,
        	  onCellSelect:function(rowid,index,contents,event){

       		   $.ajax({
       			  type:'GET',
       			  dataType:'json',
       			  success:function(cust){
       					console.log('cust:'+cust);
       					window.open('${home}/gesi/detail.do?no='+rowid,'','width=800,height=700,left=700,top=0');
       			  },
       			 
           		  error:function(e){
           			  alert('에러');
           		  }
       		  });
       		 
        		
        	  },
        	  hoverrows:true,
        	  
        
        	  loadComplete: function () {
				
        	  },
        	  search : true,
        	  title : "false",
        	  resizable : true,
        	  sorttype:"date"/"integer"/"text",
        	  sortable : true,
        	  hidden :true,
        	  editurl:"${HOME}/gesi/edit.do"
        	  
        	  
        	  
          });
   
          $('#gesiList').jqGrid('navGrid','#pager'
       		  ,{excel:false,add:false,search:true,edit:true,del:true,view:true,refresh:true}
         	  ,{} //edit option
         	  ,{} // add 
         	  ,{} // delete
         	  ,{}
         	  ,{} //view
         	  
          );
          $('#custList').jqGrid('setGridParam', 
        			/* {ondblClickRow: function(rowid,iRow,iCol,e){
        								alert('double clicked');
        							}
        			} */
        			{url:''}
        	);
          
        
        });
</script>