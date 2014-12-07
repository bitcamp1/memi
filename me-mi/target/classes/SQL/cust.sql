--#1. count 전체수량 가져오기--
--#2. countByWord 검색결과 수량 가져오기 --
--#3. max 마지막 입력한 값 가져오기--
--#4. list 리스트 가져오기--
--#5. search 키워드로 검색하기--
--#6. retrieve ID 로 검색하기--
--#7. get SQ 로 검색하기--
--#8. set 등록하기--
insert into CUST
(cust_id, cust_nm, phno, telno, addr, eml, cust_gubun, birth, regdt, gen)
-- 고객ID , 성명 , 전화번호 , 연락처번호 , 청구지주소 , 이메일 , 구분 , 생년월일 , 등록일 , 성별
values
('740819-1-010-9075-3070' , ' 홍길동', '010-9075-3070', '031-2222-3333',
'서울시구로구구로동', 'jkpark@whitewingsys.com' ,'일반 ' , '1974-08-19', CONVERT(varchar (10), GETDATE(),121 ),1
);
--#9. update 수정하기--
--#10.delete 삭제하기--
