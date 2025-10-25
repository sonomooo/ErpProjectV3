# 도메인 모델

## 브랜드 (Brand)

### 속성

식별자 (브랜드 Id로 구별) - id
name : 브랜드 명 
content : 브랜드 설명
product_id : 브랜드별 상품 id


### 행위
브랜드 생성 : name 충족
브랜드 조회 : 보유한 product_id를 출력

### 규칙
- 브랜드별로 설명을 가진다
- 상품없이 브랜드만 생성이 가능하다.

## 상품 (Product)

### 속성

Id = 식별자

Brand_id = 상품의 브랜드
name = 상품명
cereal : 상품 번호
price = 상품 가격
size = 상품 사이즈
model_info = 모델 정보, 착용 사이즈
product_info 
explain = 상품 설명

### 행위
상품 생성: 식별자를 제외한 모든 정보를 바탕으로 생성

### 규칙



## 상품 사이즈(ENUM)

###
S, M, L




 
## 회원 (Member)

### 속성
식별자 ( 이메일로 구별) = Id
nickName : 닉네임 -
password : 비밀번호
status : 회원의 상태

### 행위
회원 생성: email nickName password status : 4가지 조건을 충족해야함
- 가입을 완료 시킨다
- 탈퇴시킨다.

### 규칙
- 회원 생성 후 상태는 가입 대기
- 일정 조건을 만족하면 가입 완료가 된다.
- 가입 완료 상태에서는 탈퇴할 수 있다.

## 회원 상태(MemberSttatus)
Enum

### 상수
- PENDING : 가입 대기
- ACTIVE : 가입 완료
- DEACTIVATED : 탈퇴

## Post

### 속성

Long Id - 게시글의 식별자
String title - 제목
content - 게시글의 내용

## Order

### 속성
Id - 주문 번호 식별자
orderId : 주문 번호
price - 주문 총 금액
status - 주문 상태
product_id - 상품 번호
member_id - 회원 정보
discount - 할인 정보 (EUNM 으로 관리) -> 퍼센티지, 정해진 금액
delivery - 배송지
payment - 결제 수단

## 주문 상태

### 상수
- IN_CART : 장바구니
-         : 결제 완료
-         : 배송 준비
-         : 배송중
-         : 배송완료
-         : 구매 확정

## 쿠폰 (Coupon)

### 속성

Id : 쿠폰 식별자
name : 쿠폰명
discount : 할인율
least : 최소 주문 금액
discountAmount : 최대 할인 금액
getPeriod : 발급 기간
usePeriod : 사용 기간
content : 쿠폰 설명

### 행위

할인율에 따른 금액 계산

## 장바구니 (Cart)

### 속성

Id : 장바구니 id
product_id : 상품 정보
quantity : 수량
product_price : 가격

## 카테고리 (Category)

### 속성
mainCategory_Id : 메인 카테고리 식별자 (남성, 여성 ...)
subCategory_Id : 메인 카테고리 속의 카테고리 (자켓, 가방 ... )

###


## 주문내역 (OrderHistory)

### 속성
order_Id : 결제내역



### 규칙

주문내역에 반영되기 위해서 결제상태가 구매 확정이여야함

## 상품관리 (OrderProduct)

###
Id = 식별자
Order_Id : 주문 식별자

도메인 로직을 코드로 표현하는 방법

-> 도메인 모델 패턴 
도메인/비즈니스 로직을 구성하는 아키텍처 패턴의 한 가지
도메인 모델의 속성과 행위를 모두 포함하는 도메인의 오브젝트 모델
오브젝트 모델이기 때문에 복잡한 연관 관계, 커스텀 속성, 상속 등을 사용할 수 있다.

트랜잭션 스크립트는 하나의 업무절차를 처리하기 위한 스크립트를 만들고 비즈니스 로직을 순서대로 코드로 작성하는 방법