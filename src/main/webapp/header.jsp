<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item<c:if test="${param.menu=='new'}" ><c:out value=" active"></c:out></c:if>" href="/MyDiary/ShowPostsServlet?menu=new">Najnowsze posty</a>
          <a class="blog-nav-item<c:if test="${param.menu=='newpost'}" ><c:out value=" active"></c:out></c:if>" href="/MyDiary/index.jsp?menu=newpost">Dodaj post</a>
          <a class="blog-nav-item<c:if test="${param.menu=='guests'}" ><c:out value=" active"></c:out></c:if>" href="/MyDiary/index.jsp?menu=guests">Księga gości</a>
          <a class="blog-nav-item<c:if test="${param.menu=='about'}" ><c:out value=" active"></c:out></c:if>" href="/MyDiary/index.jsp?menu=about">o mnie</a>
          
        </nav>
      </div>
    </div>

    <div class="container">

      <div class="blog-header">
        <h1 class="blog-title">Mój pamiętnik - Grzegorz Foik</h1>
        <p class="lead blog-description">Kurs JavaSapiens</p>
        
        
        
            

      </div>