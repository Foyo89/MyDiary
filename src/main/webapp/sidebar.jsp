<%@page import="java.util.Enumeration"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix ="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="sidebar-module">
            <h4>Archiwum</h4>
            
           <ol class="list-unstyled">
            <c:forEach items="${archive}" var="element">
               
                <fmt:parseDate type="date" value="${element}" pattern="yyyy-MM" var="parsedDate"/>
                <c:set var="tosplit" value="${element}"/>
                <c:set var="spliter" value="${fn:split(tosplit, '-')}"/>
                
                <li><a href="/MyDiary/ShowArchiveServlet?year=${spliter[0]}&month=${spliter[1]}"><fmt:formatDate type="date" value="${parsedDate}" pattern="MMM yyyy"/></a></li>
            </c:forEach>
            </ol>    
            
          </div>
          <div class="sidebar-module">
            <h4>Elsewhere</h4>
            <ol class="list-unstyled">
              <li><a href="#">GitHub</a></li>
              <li><a href="#">Twitter</a></li>
              <li><a href="#">Facebook</a></li>
            </ol>
          </div>
        </div><!-- /.blog-sidebar -->

      </div><!-- /.row -->

    </div><!-- /.container -->