
<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Created - BookMyShow</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            padding: 20px;
        }

        .container {
            width: 100%;
            max-width: 500px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            overflow: hidden;
        }

        .header {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            color: white;
            padding: 25px 30px;
            text-align: center;
        }

        .logo {
            display: flex;
            align-items: center;
            justify-content: center;
            margin-bottom: 10px;
        }

        .logo i {
            font-size: 32px;
            color: #ffeb3b;
            margin-right: 10px;
        }

        .logo h1 {
            font-size: 28px;
            font-weight: 700;
        }

        .success-section {
            padding: 30px;
            text-align: center;
            background-color: #f9f9f9;
            border-bottom: 1px solid #eee;
        }

        .success-icon {
            font-size: 60px;
            color: #4CAF50;
            margin-bottom: 20px;
        }

        .success-section h1 {
            color: #333;
            margin-bottom: 15px;
            font-size: 24px;
        }

        .user-id-container {
            background: linear-gradient(to right, #4CAF50, #45a049);
            color: white;
            padding: 15px;
            border-radius: 8px;
            margin: 20px 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            box-shadow: 0 4px 10px rgba(76, 175, 80, 0.3);
        }

        .user-id-label {
            font-size: 16px;
            margin-bottom: 8px;
            font-weight: 500;
        }

        .user-id-value {
            font-size: 24px;
            font-weight: 700;
            letter-spacing: 1px;
        }

        .form-container {
            padding: 30px;
        }

        .form-group {
            margin-bottom: 25px;
            position: relative;
        }

        .form-group label {
            display: block;
            margin-bottom: 8px;
            font-weight: 600;
            color: #333;
        }

        .form-group input {
            width: 100%;
            padding: 12px 15px;
            border: 2px solid #e0e0e0;
            border-radius: 6px;
            font-size: 16px;
            transition: all 0.3s;
        }

        .form-group input:focus {
            border-color: #ff416c;
            outline: none;
            box-shadow: 0 0 0 3px rgba(255, 65, 108, 0.2);
        }

        .form-group i {
            position: absolute;
            right: 15px;
            top: 42px;
            color: #777;
        }

        .submit-btn {
            width: 100%;
            padding: 14px;
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 18px;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s;
            margin-top: 10px;
        }

        .submit-btn:hover {
            background: linear-gradient(to right, #e04425, #e03a62);
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(255, 65, 108, 0.4);
        }

        .footer {
            text-align: center;
            margin-top: 30px;
            color: white;
            font-size: 14px;
        }

        .footer a {
            color: white;
            text-decoration: none;
        }

        .footer a:hover {
            text-decoration: underline;
        }

        @media (max-width: 576px) {
            .container {
                max-width: 100%;
            }
            
            .success-section, .form-container {
                padding: 20px;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <div class="logo">
                <i class="fas fa-ticket-alt"></i>
                <h1>BookMyShow</h1>
            </div>
        </div>
        
        <div class="success-section">
            <i class="fas fa-check-circle success-icon"></i>
            <h1>Profile created successfully ....</h1>
            <h1>Now you can login....</h1>
            
            <div class="user-id-container">
                <div class="user-id-label">Your User ID is:</div>
                <div class="user-id-value">${userID}</div>
            </div>
        </div>
        
        <div class="form-container">
            <form action="validateLogin" method="post">
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="text" id="email" name="email" required>
                    <i class="fas fa-envelope"></i>
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                    <i class="fas fa-lock"></i>
                </div>

                <input type="submit" value="Login" class="submit-btn">
            </form>
        </div>
    </div>
    
    <div class="footer">
        <p>&copy; 2023 BookMyShow. All rights reserved. | <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
    </div>
</body>
</html>