--#1. count 전체수량 가져오기--
--#2. countByWord 검색결과 수량 가져오기 --
--#3. max 마지막 입력한 값 가져오기--
--#4. list 리스트 가져오기--
--#5. search 키워드로 검색하기--
--#6. retrieve ID 로 검색하기--
--#7. get SQ 로 검색하기--
--#8. set 등록하기--
insert into DTE
(dte_nm, dte_mdl, dte_won, maker, telecom)
values
('G2','LG-F320K',900000,'LG','SKT')
insert into DTE
(dte_nm, dte_mdl, dte_won, maker, telecom)
values
('갤노트2','SHV-E250S',1000000,'삼성','SKT')
--#9. update 수정하기--
update color
set
--#10.delete 삭제하기--
-- DDL 
-- CREATE
CREATE TABLE [dbo].[DTE](
	[dte_nm] [varchar](30) NULL,
	[dte_mdl] [varchar](30) NOT NULL PRIMARY KEY,
	[dte_won] [varchar](30) NULL,
	[maker] [varchar](10) NULL,
	[telecom] [varchar](10) NULL
) 

-- DROP
drop table dte