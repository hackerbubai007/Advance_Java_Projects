<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Successful - BookMyShow</title>
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
            text-align: center;
        }

        .header {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            color: white;
            padding: 25px 30px;
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

        .success-content {
            padding: 50px 30px;
        }

        .success-icon {
            font-size: 80px;
            color: #4CAF50;
            margin-bottom: 25px;
            animation: bounce 1s ease-in-out;
        }

        .success-message {
            font-size: 28px;
            font-weight: 600;
            color: #333;
            margin-bottom: 30px;
        }

        .redirect-message {
            color: #666;
            font-size: 16px;
            margin-bottom: 30px;
        }

        .btn {
            display: inline-block;
            padding: 12px 30px;
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            color: white;
            text-decoration: none;
            border-radius: 6px;
            font-weight: 600;
            font-size: 16px;
            transition: all 0.3s;
            margin: 5px;
        }

        .btn:hover {
            background: linear-gradient(to right, #e04425, #e03a62);
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(255, 65, 108, 0.4);
        }

        .btn-outline {
            background: white;
            color: #ff416c;
            border: 2px solid #ff416c;
        }

        .btn-outline:hover {
            background: #f8f8f8;
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

        @keyframes bounce {
            0%, 20%, 50%, 80%, 100% {
                transform: translateY(0);
            }
            40% {
                transform: translateY(-20px);
            }
            60% {
                transform: translateY(-10px);
            }
        }

        @media (max-width: 576px) {
            .container {
                max-width: 100%;
            }
            
            .success-content {
                padding: 30px 20px;
            }
            
            .success-message {
                font-size: 24px;
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
        
        <div class="success-content">
            <i class="fas fa-check-circle success-icon"></i>
            <div class="success-message">Successfully logged in!</div>
            <div class="redirect-message">You're being redirected to your dashboard...</div>
            <div class="button-group">
                <a href="validationPage" class="btn">Go to Dashboard</a>
                <a href="#" class="btn btn-outline">Browse Movies</a>
            </div>
        </div>
    </div>
    
    <div class="footer">
        <p>&copy; 2023 BookMyShow. All rights reserved. | <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
    </div>

    <script>
        // Simple redirect after 3 seconds
        setTimeout(function() {
            // In a real application, this would redirect to the user dashboard
            // window.location.href = "dashboard.jsp";
        }, 3000);
    </script>
</body>
</html>