<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
	<br>
	<div class=title>
		<h3 align="center" style="margin-top: 20px;">藝文商店管理</h3>
	</div>
	<div class="back" align="right">
		<form action="<c:url value='/index.html'/> " method="get">
			<div class="submitButton">
				<input type="submit" class="" name="submit" value="返回 後台管理系統">
			</div>
		</form>
	</div>
	<br>
	<div class=content>
		<table id="03"
			class="display table table-bordered table-hover table-blue">
			<thead></thead>
			<tbody>
				<tr>
					<td><a href="<c:url value='/03/cms/shop/create' /> ">新增藝文商店</a></td>
					<td><a href="<c:url value='/03/cms/shop/search' /> ">查詢藝文商店</a></td>
					<td><a href="<c:url value='/03/cms/shop/update' /> ">更新藝文商店</a></td>
					<td><a href="<c:url value='/03/cms/shop/delete' /> ">刪除藝文商店</a></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<br>
<!-- ====================================================== -->
<script>
	$(document).ready(function() {
		$('#03').DataTable({});
	});
</script>