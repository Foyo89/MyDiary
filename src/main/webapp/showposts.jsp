<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:forEach items="${posts}" var="post">
                    <div class="blog-post">
                        <h2 class="blog-post-title"><c:out value="${post.title}"/></h2>
                        <p class="blog-post-meta"><fmt:formatDate type="date" value="${post.createDate}" pattern="dd MMMM yyyy HH:mm"/><c:out value=" ${post.user.firstname} ${post.user.lastname} aka ${post.user.nick}"></c:out>
                        <p><c:out value="${post.text}"></c:out></p>
                        <p><c:out value="${post.user.firstname}"></c:out></p>
                    </div><!-- /.blog-post -->
                    </c:forEach>