<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제페이지</title>
</head>
<body>
	<div id="header"></div>
	<div id="container">
		<div class="wrap">
			<div class="titleLocation">
				<h3>주문결제</h3>
					<ul class="step2">
						<li>장바구니</li>
						<li>현재위치: 주문결제</li>
						<li>주문완료</li>
					</ul>
			</div>
			<div class="payment">
				<div class="fl">
					<div class="shippingInfo">배송지</div>
					<div class="paymentInfo">결제수단</div>
				</div>
				<div class="fr">
					<div class="orderInfo">
						<h4>주문상품 정보</h4>
						<div class="cont">
							<div class="view">
								//제품 사진, 제원, 구성품, 가격 등
							<div class="total"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div id="footer"></div>
	<table>
		<tr>
			<th>배송지</th>
		</tr>
		<tr>
			<th>할인</th>
		</tr>
		<tr>
			<th>결제수단</th>
		</tr>
		<tr>
			<th>주문상품 정보</th>
		</tr>
		<tr>
			<th>최종 결제정보</th>
		</tr>
	</table>
</body>
</html>