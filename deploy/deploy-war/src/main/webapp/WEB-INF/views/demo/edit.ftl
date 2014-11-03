<html>
<body>
<form action="${rca.contextPath}/demo/insert" method="POST">
    <legend>创建文章</legend>
    <div>
        <label>&nbsp;I&nbsp;D&nbsp;</label>
        <input type="number" name="demo.id" readonly value="${demo.id}"/>
    </div>
    <div>
        <label>姓名</label>
        <input type="text" name="demo.name" value="${demo.name}" placeholder="姓名"/>
    </div>
    <div>
        <label>生日</label>
        <input type="text" name="demo.birthday" value="${demo.birthday?datetime}" placeholder="生日"/>
    </div>
    <input type="submit" id="submit" value="保存" data-loading="稍候..."/>

</form>
</body>
</html>