-- DML
--#1. count 전체수량 가져오기--
--#2. countByWord 검색결과 수량 가져오기 --
--#3. max 마지막 입력한 값 가져오기--
--#4. list 리스트 가져오기--
--#5. search 키워드로 검색하기--
--#6. retrieve ID 로 검색하기--
--#7. get SQ 로 검색하기--
--#8. set 등록하기--
insert into CONTACT (pho_no,tel_no,fax,eml,user_sq)
values('010-4610-2258','02-822-2258','','superr@whitewingsys.com','') -- 이민철 대표
insert into CONTACT (pho_no,tel_no,fax,eml,user_sq)
values('010-9042-2576','02-822-2258','','jechoi@whitewingsys.com','') --최재은 부장
insert into CONTACT (pho_no,tel_no,fax,eml,user_sq)
values('010-2485-2333','02-822-2258','','8888@whitewingsys.com','') --김대영 차장
insert into CONTACT (pho_no,tel_no,fax,eml,user_sq)
values('010-7744-1376','02-822-2258','','gdnoh@whitewingsys.com','') --노기덕 과장
--#9. update 수정하기--

--#10.delete 삭제하기--

-- DDL
-- 컬럼추가
alter table contact add user_sq int null