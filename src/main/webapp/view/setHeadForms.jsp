<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>setHeadForms</title>
    </head>
    <body>
    <form action="/setHeadForms" method="POST">
        <h1> ใบกำกับภาษีอิเล็กทรอนิกส์ </h1>
        <br> ชื่อ <input type="text" name="Name"value="" /> </br>
        <br> เลขที่ประเภทเอกสาร <input type="text" name="TypeCode" value="" /> </br>
        <br> สาเหตุการออกเอกสาร <input type="text" name="Purpose" value="" /> </br>
        <br> ข้อความเพิ่มเติม <input type="text" name="IncludeNote" value="" /> </br>
        <br> หัวข้อ <input type="text" name="Subject" value="" /> </br>
        <br> เนือหา <input type="text" name="Content" value="" /> </br>
        <br>
        <input type="submit" value="OK" name="Confirm" />
    </form>        
    </body>
</html>
