<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="row">

        <div class="col-sm-8 blog-main">

          
          
            <div class="blog-post">
            
                <c:choose>
                    <c:when test="${param.menu == 'new'}">
                        <%@include file="showposts.jsp" %>
                    </c:when>
                    <c:when test="${param.menu == 'newpost'}">
                        <%@include file="newpost.jsp" %>
                    </c:when>
                    
                
                </c:choose>
                
              
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