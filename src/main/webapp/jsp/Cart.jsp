<%@ page import="java.util.Queue" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.PriorityQueue" %>
<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div>
    <div class="container">
        <div style="display: flex; flex-direction: row; justify-content: space-between;">
            <h1>Cart</h1>
        </div>
        <hr>
        <div class="row">
            <table cellpadding="2" cellspacing="2" border="1">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Photo</th>
                    <th>Price</th>
                    <th>Option</th>
                </tr>
                <c:forEach var="product" items="${sessionScope.cart }">
                    <tr>
                        <td>${product.id }</td>
                        <td>${product.name }</td>
                        <td>
                            <img src="${product.photo }" width="120">
                        </td>
                        <td>${product.price }</td>
                        <td align="center">
                            <a href="${pageContext.request.contextPath }/cart?&action=remove&id=${product.id }">Remove</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

<style>
    *{
        font-family: 'Patua One', cursive;
    }
    .list{
        margin: 20px;
    }
    .list .container{
        box-shadow: 0 0 20px;
        padding: 50px;
        background-color: white;
    }
    .list .col-md-3{
        opacity: .5;
        transition: .5s;
        transform: scale(.9);
        position: relative;
    }
    .list .col-md-3:hover{
        opacity: 1;
        transform: scale(1);
    }
    .col-md-3:hover .centered{
        opacity: 1;
        transform: scale(3);
    }
    #asd
    {
        position: fixed; width: 100%; z-index: +1;
    }
</style>
<%@include file="footer.jps.jsp"%>
