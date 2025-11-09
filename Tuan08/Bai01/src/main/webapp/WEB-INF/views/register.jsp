<%@ page language="java" contentType="text/html; UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
            background-color: #f4f7f6;
            color: #333;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            margin: 20px auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 30px;
            font-size: 32px;
            font-weight: 700;
        }

        .form-table {
            width: 100%;
            margin-top: 20px;
        }

        .form-table td {
            padding: 12px 0;
            border: none;
            background-color: transparent !important;
        }

        .form-table td:first-child {
            font-weight: bold;
            width: 120px;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: calc(100% - 22px);
            padding: 12px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            transition: all 0.3s ease;
        }

        input[type="text"]:focus,
        input[type="email"]:focus,
        input[type="password"]:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.25);
            outline: none;
        }

        .btn {
            padding: 12px 20px;
            font-size: 16px;
            font-weight: bold;
            text-align: center;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
            transition: all 0.3s ease;
            color: #fff;
            border: none;
        }

        .btn-primary {
            background-color: #007bff;
        }

        .btn-primary:hover {
            background-color: #0056b3;
        }

        .error {
            color: #dc3545;
            font-size: 12px;
            font-style: italic;
            margin-top: 5px;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .container {
                padding: 20px;
            }

            .form-table td {
                padding: 8px;
            }

            input[type="text"],
            input[type="email"],
            input[type="password"] {
                font-size: 14px;
                padding: 10px;
            }

            .btn {
                width: 100%;
                padding: 12px;
            }
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Employee Form</h1>

    <form:form action="${pageContext.request.contextPath}/save" method="post" modelAttribute="employee">
        <table class="form-table">
            <form:hidden path="id"/>
            <tr>
                <td>First Name:</td>
                <td>
                    <form:input path="firstName"/>
                    <form:errors path="firstName" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td>
                    <form:input path="lastName"/>
                    <form:errors path="lastName" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Save Changes" class="btn btn-primary"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
