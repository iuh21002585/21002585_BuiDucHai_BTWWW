<%@ page language="java" contentType="text/html; UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f0f4f8;
            color: #4a4a4a;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            max-width: 600px;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.1);
            text-align: center;
            overflow: hidden;
            width: 100%;
        }

        h1 {
            font-size: 36px;
            color: #e74c3c;
            margin-bottom: 20px;
            font-weight: 700;
        }

        .error-message {
            font-size: 1.2em;
            color: #721c24;
            background-color: #f8d7da;
            padding: 20px;
            border-radius: 8px;
            border: 1px solid #f5c6cb;
            margin-bottom: 30px;
            line-height: 1.5;
        }

        .back-link {
            font-size: 16px;
            color: #3498db;
            text-decoration: none;
            font-weight: 600;
            padding: 8px 20px;
            border: 2px solid #3498db;
            border-radius: 30px;
            transition: all 0.3s ease;
        }

        .back-link:hover {
            background-color: #3498db;
            color: #fff;
            text-decoration: none;
            transform: translateY(-3px);
        }

        .back-link:active {
            transform: translateY(1px);
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Oops! Something Went Wrong</h1>
    <div class="error-message">
        ${errorMessage}
    </div>

    <a href="javascript:history.back()" class="back-link">&laquo; Go Back</a>
</div>

</body>
</html>
