<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="/MyDiary/NewPostServ" method="POST">
                <input type="text" name="firstname" value="Imię" size="80"/>
                <input type="text" name="lastname" value="Nazwisko" size="80"/>
                <input type="text" name="nick" value="nick" size="80"/>
                <input type="text" name="title" value="Tytuł" size="80"/></p>
                <textarea name="content" rows="40" cols="80"></textarea>
                <input type="submit" value="Wyślij" />
            </form>