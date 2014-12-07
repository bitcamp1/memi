-- DML
--#1. count 전체수량 가져오기--
--#2. countByWord 검색결과 수량 가져오기 --
--#3. max 마지막 입력한 값 가져오기--
--#4. list 리스트 가져오기--
--#5. search 키워드로 검색하기--
--#6. retrieve ID 로 검색하기--
--#7. get SQ 로 검색하기--
--#8. set 등록하기--
insert into usim
(usim_no,usim_mdl,usim_won,usim_pay_tm,cust_id)
values
('123456789','유심모델','50000','선불','1900')
--#9. update 수정하기--
--#10.delete 삭제하기--


-- DDL

-- CREATE
CREATE TABLE [dbo].[USIM](
	[usim_no] [nvarchar](max) NOT NULL,
	[usim_mdl] [nvarchar](50) NULL,
	[usim_won] [int] NULL,
	[usim_pay_tm] [nvarchar](10) NULL,
	[cust_id] [int] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

