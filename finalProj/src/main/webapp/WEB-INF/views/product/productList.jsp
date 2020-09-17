
<%@page import="com.shopping.manJY.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


<div class="container">

	<div class="col-lg-9">



		<div class="row">


			<c:if test="${empty list }">
				<table>
					<tr>
						<th colspan="8">등록된 상품이 없습니다</th>
					</tr>
				</table>
			</c:if>



			<c:if test="${not empty list }">
				<c:forEach var="goods" items="${list }">
					<div class="col-lg-4 col-md-6 mb-4">
						<div class="card h-100">
							<a href="GoodsDetail.go?g_num=${goods.g_num }"> <img
								class="card-img-top"
								src="./upload/${goods.getG_image().split(',')[0]}" width="700"
								height="400" alt="">
							</a>


							<div class="card-body">
								<h4 class="card-title">
									<a href="GoodsDetail.go?g_num=${goods.g_num }">${goods.g_name}</a>
								</h4>
								<h5>${goods.g_price}원</h5>
								<p class="card-text">${goods.g_content}</p>

							</div>
							<div class="card-footer">
								<small class="text-muted">&#9733; &#9733; &#9733;
									&#9733; &#9734;</small>
							</div>



						</div>
					</div>
				</c:forEach>
			</c:if>




		</div>
		<!-- /.row -->

	</div>
	<!-- /.col-lg-9 -->


	<nav aria-label="Page navigation example">
		<ul class="pagination justify-content-center">
			<c:if test="${startPage > pagePerBlock }">
				<li class="page-item"><a class="page-link"
					href="list.action?pageNum=${startPage-1}"> Prev</a></li>
			</c:if>
			<c:if test="${startPage <= pagePerBlock }">
				<li class="page-item disabled"><a class="page-link"
					href="list.action?pageNum=${startPage-1}"> Prev</a></li>
			</c:if>
			<c:forEach var="i" begin="${startPage }" end="${endPage }">
				<c:if test="${i==currentPage }">
					<li class="page-item"><a class="page-link" href="#">${i}</a></li>
				</c:if>
				<c:if test="${i != currentPage }">
					<li class="page-item"><a class="page-link"
						href="list.action?pageNum=${i}">${i}</a></li>
				</c:if>
			</c:forEach>
			<c:if test="${endPage < totalPage }">
				<li class="page-item"><a class="page-link"
					href="list.action?pageNum=${endPage+1}">Next</a></li>
			</c:if>
			<c:if test="${endPage >= totalPage }">
				<li class="page-item disabled"><a class="page-link"
					href="list.action?pageNum=${endPage+1}">Next</a></li>
			</c:if>

		</ul>
	</nav>


</div>
<!-- /.container -->


