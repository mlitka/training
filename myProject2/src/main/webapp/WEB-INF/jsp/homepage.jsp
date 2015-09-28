<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head><body>
        <div style="text-align: center;">
                <h1>Zażółć gęślą jaźń</h1>
                <h3 style="font-weight: 500;">Martynka Litkowska</h3>
                <c:out value="This is JSTL" /><br /> <br />
 
                <form action="" method="post">
                        First part of the secret message:<br>
                        <input type="text" name="part1"> <br> <br>
                        Second part of the secret message:<br>
                        <input type="text" name="part2"> <br>
                        <br>
                        <input type="submit" value="Submit">
                </form>
               
                <h4><strong><c:out value="Secret message: ${part1} and ${part2}" /></strong></h4>
        </div>
        <br />
<h4><strong>Pozdrowienia od ${username}</strong></h4>
       
</body></html>