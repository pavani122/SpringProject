<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">    
<html>    
<head>    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
<title><tiles:insertAttribute name="title" ignore="true" /></title>    
</head>    
<body>    
        <div  style="float:left;width:100%;height:30px;top:0;text-align:right;background-color: orange;display:inline-block;"><tiles:insertAttribute name="header" /></div>    
          
       <div  style="padding:10px;width:100%;height:75%;display:inline-block;"><tiles:insertAttribute name="body" /></div>  
       <div style="height:60px; display: block;">&nbsp;</div>  
        <div style="float:left;width:100%;height:60px;bottom:0;background-color:yellow;position:fixed;color:black;text-align:center;display:inline-block;"><tiles:insertAttribute name="footer" /></div>       
</body>    
</html>