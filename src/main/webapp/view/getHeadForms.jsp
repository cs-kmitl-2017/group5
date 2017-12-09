<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>หัวเรื่องเอกสาร<b></b><br>
        เลขที่เอกสาร             <%= request.getParameter("Id") %><br>
        ชื่อ                    <%= request.getParameter("Name") %><br>
        เลขประเภทเอกสาร         <%= request.getParameter("TypeCode") %><br>
        วันเดือนปีที่ออกเอกสาร      <%= request.getAttribute("CreateionDateTime")%><br>
        สาเหตุการออกเอกสาร      <%= request.getParameter("Purpose") %><br>
        เลขที่สาเหตการออกเอกสาร  <%= request.getParameter("PurposeCode")%><br>
        เลขที่เอกสารสากล        <%= request.getParameter("GrobalId")%><br>
        วันเดือนปีที่สร้างเอกสาร    <%= request.getAttribute("CreateionDateTime")%><br>
        ข้อความเพิ่มเตอม        <%= request.getParameter("IncludeNote")%><br>
        หัวข้อ                 <%= request.getParameter("Subject")%><br>
        เนิ้อหา                <%= request.getParameter("Content")%><br>
        <%= request.getAttribute("headForm")%><br>
        $Content
    </body>
</html>