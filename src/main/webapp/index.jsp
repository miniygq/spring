<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>处理文件上传</h2>
<form enctype="multipart/form-data" action="upfile" method="post">
    要上传的文件：<input type ="file" name="upFile"> <br/>
    关于该文件的注意事项：<input type="text" name="note"> <br/>
    <BR/>
    <input type ="submit" value ="提交">上传文件！
</form>
</body>
</html>
