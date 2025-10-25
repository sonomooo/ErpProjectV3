#ErpProjectV3 과정 설명

# 이번 프로젝트 목표는 새로운 어노테이션 활용 및 새로운 기술을 도입해서 사용할 수 있는 역량을 기르는 것을 목표로 함

# 그 전 프로젝트와의 차이점
1. worksout 카피

# Erp 도메인
1. product : product는 상품을 의미하며 모든 제품들을 일컫는다. 내가 만드는 erp 재고 관리는 옷 시스템을 기준으로 하기에 상 하의 악세사리 까지의 모든 제품들을 product 도메인으로 묶어서 관리를 해보자
* product는 재고가 있으며, CRUD가 가능하다. 이때 CD는 관리자만이 가능하며, 실물은 창고에서 관리한다.
* product는 카테고리처럼 구별하며 이를 상품하나하나의 디테일은 productImpl에서 관리하도록 한다. -> 따로 관리할 필요가 있을까? 시리얼넘버별로 
* 
2. customer : 제품을 구매하는 고객과 제품에 관심을 가지는 모든 유저를 뜻한다. 이때 비로그인상태와 로그인상태로 구분해서 비로그인도 조회가 가능하지만 구매는 로그인이 필요하다. 
* customer은 고객의 등급을 뜻한다. 고객의 등급은 전월 실적에 따라서 구분한다.
* 회원 가입시 쿠폰을 지급한다.
* 회원 탈퇴시 6개월은 해당 정보를 보관한다. -> soft delete
* 
3. order : order은 주문을 뜻하며, customer에서 로그인된 고객들의 주문 정보를 뜻한다.
4. warehouse : 창고를 뜻하며 product의 실물이 관리되는 장소를 뜻한다. 우선적으로는 하나의 큰창고를 만들고 후에 지역별로 창고를 만들어서 확장해 나간다.
5. member : 관리자 및 상품을 관리하는 사람들, 즉 회사원들을 뜻한다.
* member는 직급이 정해져있어서 직원과 관리자로 구분한다.
6. cash : 상품을 결제하는 것을 의미한다. 이때 상품의 결제는 순차적으로 진행되며 수량이 제한되어 있다.

#worksout domain

메인 페이지

/workout.co.kr
backPage -> 
scoreType -> /brand/000?scoreType

1. brand
/brand/000?

2. content
/contents

3. notification

/notification?tab=0
/notification

------로그인시

notification?tab=0

4. category

5. login

아이디 찾기 find/id
비밀번호 찾기 find/password

회원 가입 /personal-verification

6. wear

/wear?openSliderStyling

7. app-download

응모 

----

로그인 시
8. my/liked

관심목록

?activeIndex=0,1,2,3&sort=정렬방식

9. product

10.검색

/results?keyword=칼하트&openFilter=true&filter=true

11. 장바구니

/cart

12. 매장 정보


13. editorial
-> content로 연결 /content/00?backPage=editorial

14.웍스아웃
-> store/worksout

그외

/cc
/membership
/about
/work-with-us


true,false로 화면에 보여지는 정보를 구별?

# url 설정



기본 url : worksout.co.kr

검색 url : worksout.co.kr/results?keyword=반바지&openFilter=true&filter=true


[ApiResponse.java](src/main/java/erpproject/worksin/common/response/ApiResponse.java)