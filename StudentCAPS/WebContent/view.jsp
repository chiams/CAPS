<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="<c:url value='/styles/style.css'/>" rel="stylesheet" type="text/css"/>
</head>
<body>

<h1>Hello</h1>

 <table class="borderAll">
            <tr>
               <th>#</th>
                <th>Course ID</th>
                <th>courseName</th>
                <th>lecturerID</th>
                 <th>startDate</th>
           		<th>endDate</th>
                <th>courseFees</th>
                <th>courseCredits</th>
                <th>comments</th>
                <th>courseSize</th>
            </tr>


 	<c:forEach var="course" items="${courses}" varStatus="status">
                <tr class="${status.index%2==0?'even':'odd'}">
                     <td class="nowrap">${status.index + 1}</td>
                    <td class="nowrap">${course.courseID}</td>
              		<td class="nowrap">${course.courseName}</td>               
                    <td class="nowrap">${course.lecturerID}</td>
                    <td class="nowrap">${course.startDate}</td>
                    <td class="nowrap">${course.endDate}</td>
                    <td class="nowrap">${course.courseFees}</td>
                    <td class="nowrap">${course.courseCredits}</td>
      		         <td class="nowrap">${course.comments}</td>
 						<td class="nowrap">${course.courseSize}</td>
 						
<%--                     <td class="nowrap">
                        <c:url var="updurl" scope="page" value="view.jsp">
                            <c:param name="Course ID" value="${course.courseID}"/>
                            <c:param name="Course Name" value="${course.courseName}"/>
                            <c:param name="Lecturer ID" value="${course.lecturerID}"/>
                       <c:param name="Course StartDate" value="${course.startDate}"/>
						 <c:param name="Course EndDate" value="${course.endDate}"/>
       						 <c:param name="Course Fess" value="${course.courseFees}"/>
                 	 <c:param name="Course Fess" value="${course.courseCredits}"/>
                         	 <c:param name="Course Comments" value="${course.comments}"/>
               	 <c:param name="Course Size" value="${course.courseSize}"/>
                             <c:param name="update" value="true"/>
                        </c:url>
                        <a href="${updurl}"><fmt:message key="label.hero.edit"/></a>
                        &nbsp;&nbsp;&nbsp;
                        <c:url var="delurl" scope="page" value="/deleteHero">
                            <c:param name="name" value="${hero.name}"/>
                        </c:url>
                        <a href="${delurl}"><fmt:message key="label.hero.delete"/></a>
                    </td>
                </tr> --%>
            </c:forEach>
</table>
</body>
</html>


