<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Çiçek Listesi</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style2.css">
</head>

<body>
    <div class="container">
        <div class="wrapper">
            <header class="header">
                <h2>Çiçek Detayları</h2>
            </header>
            <div class="content">
                <a href="show-flower-form" class="btn">Çiçek Ekle</a>
                <table>
                    <tr>
                        <th>Ad</th>
                        <th>Renk</th>
                        <th>Açma Sezonu</th>
                        <th>Bitki Tipi</th>
                        <th>Fiyat</th>
                        <th>Güncelle</th>
                        <th>Sil</th>
                    </tr>
                    <c:forEach var="flower" items="${flowers}">
                        <c:url var="updateLink" value="/flower/update-form">
                            <c:param name="id" value="${flower.id}"/>
                        </c:url>
                        <c:url var="deleteLink" value="/flower/delete">
                            <c:param name="id" value="${flower.id}"/>
                        </c:url>
                        <tr>
                            <td>${flower.name}</td>
                            <td>${flower.colour}</td>
                            <td>${flower.bloom_season}</td>
                            <td>${flower.plant_type}</td>
                            <td>${flower.price}</td>
                            <td>
                                <a href="${updateLink}" class="btn-link">Güncelle</a></td>
                             <td>
                                <a href="${deleteLink}" class="btn-link" onclick="if(!(confirm('Silmek istediğinizden emin misiniz?'))) return false">Sil</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</body>