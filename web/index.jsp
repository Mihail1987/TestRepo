<%--
  Created by IntelliJ IDEA.
  User: mborisovsky
  Date: 18.02.14
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
       <div>
           <table>
               <tr>
                   <td>Количество посещений</td>
                   <td><%=(request.getAttribute("current_count"))%></td>
               </tr>
           </table>
       </div>
  </body>
</html>