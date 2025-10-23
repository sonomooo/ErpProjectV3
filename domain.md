도메인 정리

1. Brand : 의류를 만든 업체를 의미한다. 브랜드 별로 만들어낸 의류가 있으며 의류들은 
 각자 다르게 등록되지만 브랜드로 묶어서 관리가 가능하다.

  브랜드별로 조회했을때 프로덕트와 마찬가지로 브랜드에 속한 product들이 나온다. 이때 브랜드에
속한 product들이 나올뿐이지 페이지의 연결은 product로 연결된다.


2. Product : Product는 제품 각자의 고유한 상태를 갖는다. 어느 제품이든 product/number로
저장되며 이는 브랜드와 카테고리와는 상관없이  product 그 자체로 기능한다.

3. User : 해당 서비스를 활용하는 계층을 의미한다. 상품들에 대한 수정권한을 가진 어드민 계정과 
 구매만 가능한 일반 계정이 존재한다.

4. Post : 웹사이트에 올라오는 모든 게시글들을 의미한다. 이를 통해서 이벤트를 공지할 수 있으며, 
 다른 공지사항들과 전달해야할 정보들을 전달할 수 있다.

5. Order : 수익이 나오는 부분으로 고객들이 옷을 주문함으로서 얻게 되는 수익과 직결한다. 쿠폰을 사용해서
구매가 가능하며, 적립금또한 사용할 수 있다. 주문시에 결제 수단을 여러 개를 제공한다.

6. Coupon : 유저들을 대상으로 발행하며 유저들을 끌어모으거나 재고를 처리하기 위한 수단으로서 활용한다.
 퍼센티지와 고정 금액 할인으로 만들어진다.

7. Cart : 장바구니로 주문과 직결된다. 주문하기 전에 고객들이 구매를 할지 안 할지의 공존 상태에 있으며
주기별로 초기화를 해야하며 캐싱처리를 요구한다.

8. 

# URL 정리

"code": "SUCCESS",
"payload":
  "content":
"message": null

1. Brand

"brandId": 522,
"brandName": "AMFM EQUIPMENT",
"brandKorName": "AMFM EQUIPMENT, AMFM, 스케이트 휠, 휠, ",
"newArrival": false,
"imageUrl": null,
"description": "\"AMFM Equipment는 HUF 크리에이티브 디렉터 출신의 Scott Tepper 와 Odd Future의 원년 멤버 Sagan Lockhart가 2023년에 설립한 스케이트 휠 & 장비 그리고 의류 브랜드입니다. \n\n현재 AMFM은 PALACE의 Jahmir Brown, Kanin Garner 와 Carl Aikens, Sal Barbier, Dougie, 필르머 Queezy를 팀 라이더로 두고 있습니다. \"",
"categories": null,
"sort": 10

2. Product

"productId": 175885,
"brandName": "OBEY",
"productName": "OBEY OPENA JACKET",
"currentPrice": 185000,
"initialPrice": 185000,
"discountedRate": 0.0,
"isMidsale": false,
"isNewArrival": false,
"thumbnailUrl": "https://media.worksout.co.kr/resized/live/OB25FWJAJL11323001/OB25FWJAJL11323001-1.jpg",
"hoverUrl": "https://media.worksout.co.kr/resized/live/OB25FWJAJL11323001/OB25FWJAJL11323001-0.jpg",
"color": "FADED BLACK ",
"isOnlyForUser": false,
"isBlackFriday": false,
"isOnlyApp": false,
"isOnlyOne": false,
"isCollection": false,
"collectionName": null,
"isFreeDelivery": false,
"unavailableMileage": false,
"unavailableCoupon": false,
"productKoreanName": "오베이 오페나 자켓",
"colorKoreanName": "페이디드 블랙",
"onlyOffline": false,
"genderCode": "M",
"isPreOrder": false