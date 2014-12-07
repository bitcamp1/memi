
--#1. count 전체수량 가져오기

select COUNT(0) from EMP

--#2. countByWord 검색결과 수량 가져오기 
--#3. max 마지막 입력한 값 가져오기
--#4. list 리스트 가져오기

select * from emp 
order by emp_nm ASC

--<2중 inner join>
select * from EMP  inner join CONTACT 
on EMP.cnt_sq = CONTACT.cnt_sq 
order by emp_nm ASC

--<3중 inner join>
select * from EMP 
inner join CONTACT 
on EMP.cnt_sq = CONTACT.cnt_sq 
inner join SHOP
on EMP.shp_sq = SHOP.shp_sq
order by emp_nm ASC

--#5. search 키워드로 검색하기
--#6. retrieve ID 로 검색하기
--#7. get SQ 로 검색하기
--#8. set 등록하기

insert into EMP
(emp_id, emp_pw, emp_nm,emp_duty,juso, shp_sq,cnt_sq)
values
('8888', '8888', ' 김대영' , '차장' ,'에이스하이엔드1차1016호','1002','1007');

insert into EMP
(emp_id, emp_pw, emp_nm,emp_duty,juso, shp_sq,cnt_sq)
values
('jechoi', 'jechoi', '최재은' , '부장','에이스하이엔드1차1016호','1002' ,'1006');

insert into EMP
(emp_id, emp_pw, emp_nm, emp_duty, juso, shp_sq, cnt_sq)
values
('superr','superr','이민철','대표','에이스하이엔드1차1016호','1002','1005')

insert into EMP
(emp_id, emp_pw, emp_nm, emp_duty, juso, shp_sq, cnt_sq)
values
('gdnoh','gdnoh','노기덕','과장','에이스하이엔드1차1016호','1002','1008')
		

--#9. update 수정하기
update EMP
set cnt_sq = '1008'
where emp_id = 'gdnoh'
		
--#10.delete 삭제하기
delete from EMP where emp_id = @emp_id

--============DDL===========
--#11. 테이블생성
CREATE TABLE [dbo].[EMP](
	[emp_id] [nvarchar](30) NOT NULL PRIMARY KEY,
	[emp_pw] [nvarchar](30) NOT NULL,
	[emp_nm] [nvarchar](20) NOT NULL,
	[emp_duty] [nvarchar](20) NULL,
	[juso] [nvarchar](max) NULL,
	[shp_sq] [INT] NOT NULL,
	[cnt_sq] [nvarchar](10) NULL,
	[zip] [nvarchar](20) NULL,
) 
--#12.
drop table emp



