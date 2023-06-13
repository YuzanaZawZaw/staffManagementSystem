<%@ taglib prefix="sf" 
	uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<h3>HOME PAGE</h3>
<sf:form action="savePath" method="post" modelAttribute="staffForm">
	Enter staff name:
		<sf:input path="frmName"/><br>
	Enter staff dob:
		<sf:input path="frmDob"/> <br>
	Enter staff experience:
		<sf:input path="frmExp"/><br>
	Enter staff certificate:
		<sf:input path="frmCert"/><br>
	<sf:hidden path="frmId"/>
	<c:if test="${homeForm.frmId==null}">	
		<input type="submit" value="Save"/>
	</c:if>
	<c:if test="${homeForm.frmId!=null}">	
		<input type="submit" value="Update"/>
	</c:if>		
</sf:form>
<hr>
<a href="newPath">New Staff</a>
<c:if test="${empty staffList}">
	<font color='red'>NO Staff</font>
</c:if>
<c:if test="${not empty staffList}">
	<table border="1" width="100%">
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>DOB</th>
			<th>EXP</th>
			<th>CERTI</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="p" items="${staffList}" varStatus="s">
			<tr>
				<td>${s.index+1}</td>
				<td>${p.staffName}</td>
				<td>${p.staffDob}</td>
				<td>${p.staffExp}</td>
				<td>${p.staffCert}</td>
				<td><a href="updatePath?frmId=${p.staffId}">Update</a></td>
				<td><a href="deletePath?frmId=${p.staffId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>