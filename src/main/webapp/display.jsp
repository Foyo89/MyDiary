<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">

        <div class="col-sm-8 blog-main">

          <div class="blog-post">
            <h2 class="blog-post-title">Sample blog post</h2>
            <p class="blog-post-meta">January 1, 2014 by <a href="#">Mark</a></p>
            <form action="/MyDiary/NewPostServ" method="POST">
                <input type="text" name="firstname" value="Imię" size="80"/>
                <input type="text" name="lastname" value="Nazwisko" size="80"/>
                <input type="text" name="nick" value="nick" size="80"/>
                <input type="text" name="title" value="Tytuł" size="80"/></p>
                <textarea name="content" rows="40" cols="80">
                </textarea>
                <input type="submit" value="Wyślij" />
            </form>

            
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