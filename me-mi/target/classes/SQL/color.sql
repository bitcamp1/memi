
--#1. count 전체수량 가져오기--

select top 20 col_seq as colorSeq , color  
from COLOR 
where col_seq not in (select top (0) col_seq 
from COLOR order by col_seq DESC) order by col_seq DESC

--#2. countByWord 검색결과 수량 가져오기 --
--#3. max 마지막 입력한 값 가져오기--
--#4. list 리스트 가져오기--
--#5. search 키워드로 검색하기--
--#6. retrieve ID 로 검색하기--
--#7. get SQ 로 검색하기--
--#8. set 등록하기--
insert into COLOR
(color)
values
('티타늄그레이')
--#9. update 수정하기--
--#10.delete 삭제하기--






--#0. create 테이블생성--

CREATE TABLE [dbo].[COLOR](
	[col_seq] [int] IDENTITY(1000,1) NOT NULL,
	[color] [nvarchar](20) NOT NULL
) ON [PRIMARY]
