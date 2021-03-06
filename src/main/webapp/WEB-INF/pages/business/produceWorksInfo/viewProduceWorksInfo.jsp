<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="dt" uri="/dttag"%>
<%@ page import="com.cattsoft.baseplatform.func.sm.entity.SysUser"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
		<dt:comppath></dt:comppath>
		<link rel="stylesheet" href="<%=path%>/css/new.style.css" type="text/css" charset="utf-8" />
		<script type="text/javascript" src="<%=path%>/js/busi.produceWorksInfomanager.js"></script>
		<script type="text/javascript">var path='<%=path%>';</script>
	</head>
	<body>
		<form action="busi/produceWorksInfoManager!saveProduceWorksInfo.action" id="addProduceWorksInfoForm" method="post">
		<table class="query-form" width="100%">
		<caption>施肥详情</caption>
			<tr>
				<th>种植季：</th>
				<td>
					<div>
						
						<%-- <dt:input id="produceSeasonId" name="produceWorksInfo.produceSeasonId"  width="100" disabled="false" value="${prdcSeason.name } "  width="176px" height="30px"></dt:input> --%>
						${prdcSeason.name }
					</div>
				</td>
				
					<th>负责人：</th>
				<td>
					<%=((SysUser) request.getSession().getAttribute("LOGIN_USER")).getLoginName() %>
					
				</td>
			</tr>
			<tr>
			<th>开始时间：</th>
				<td>
				<dt:dateInput id="beginTime" name="produceWorksInfo.beginTime"  showTime="true" showOnbutton="true" readonly="true"  width="176px" height="30px"/>
				</td>
				<th>结束时间：</th>
				<td>
				<dt:dateInput id="endTime" name="produceWorksInfo.endTime"  showTime="true" showOnbutton="true" readonly="true"  width="176px" height="30px"/>
				</td>
			</tr>
			
			<tr>
			<th>品类：</th>
				<td>
				<div>
						
						${typeName }
					</div>
				</td>
				<th>用量：</th>
				<td>
				<%-- <dt:input id="amount" name="produceWorksInfo.amount"   width="176px" height="30px" disabled="false"></dt:input> --%>
					${ produceWorksInfo.amount}（克）
				</td>
			</tr>
			<tr>
				<th>其他：</th>
				<td colspan="3">
				<textarea rows="5" cols="80" id="remark" name="produceWorksInfo.remark" readonly>${produceWorksInfo.remark }</textarea>
				</td>
			</tr>
		</table>
		</form>
	<div class="query-form-btns">
			<dt:button id="cancelBtn" label="返回" type="ok" icon=""/>
		</div>
</body>
</html>