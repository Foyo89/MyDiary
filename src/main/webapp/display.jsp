<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">

        <div class="col-sm-8 blog-main">

          
          
            <div class="blog-post">
            <h2 class="blog-post-title">Sample blog post</h2>
            <p class="blog-post-meta">January 1, 2014 by <a href="#">Mark</a></p>
             <%=request.getAttribute("posts") %>
             
             
            <% List list = (List)request.getAttribute("posts"); %>
            <%= list%>
            <p></p>
            
            
            <c:forEach items="${posts}" var="post">
                    <div class="blog-post">
                        <h2 class="blog-post-title"><c:out value="${post.title}"/></h2>
                        <p class="blog-post-meta"><c:out value="${post.createDate}"/> <a href="#">Adrian</a></p>
                        <p><c:out value="${post.text}"></c:out></p>
                    </div><!-- /.blog-post -->
                    </c:forEach>


            
          </div><!-- /.blog-post -->

          

          <nav>
            <ul class="pager">
              <li><a href="#">Previous</a></li>
              <li><a href="#">Next</a></li>
            </ul>
          </nav>

        </div><!-- /.blog-main -->

        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h4>O stronie</h4>
            <p>Projekt pamiętnika w ramach kursu JavaSapiens SDA</p>
          </div>