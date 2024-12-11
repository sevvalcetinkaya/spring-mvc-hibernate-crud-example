<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Bitki Ekle</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style3.css">
</head>

<body>
<div class="container">
    <div class="wrapper">
        <header class="header">
            <h2>Bitki Detayları</h2>
        </header>
        <div class="form-wrapper">
            <form:form cssClass="form" action="save" modelAttribute="flower" method="post">
                <form:hidden path="id"/>
                <div class="form-group">
                    Ad: <form:input path="name" class="form-control"/>
                </div>
                <div class="form-group">
                    Renk: <form:input path="colour" class="form-control"/>
                </div>
                <div class="form-group">
                    Açma Sezonu: <form:input path="bloom_season" class="form-control"/>
                </div>
                <div class="form-group">
                    Tip: <form:input path="plant_type" class="form-control"/>
                </div>
                <div class="form-group">
                    Fiyat: <form:input path="price" class="form-control"/>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn">
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
