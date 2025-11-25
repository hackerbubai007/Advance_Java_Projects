<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BookMyShow - Movies, Plays, Sports, Events & Cinemas</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background-color: #f5f5f5;
            color: #333;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 20px;
        }

        /* Header Styles */
        header {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            color: white;
            padding: 15px 0;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);
        }

        .header-content {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .logo {
            display: flex;
            align-items: center;
        }

        .logo h1 {
            font-size: 28px;
            font-weight: 700;
            margin-left: 10px;
        }

        .logo-icon {
            font-size: 32px;
            color: #ffeb3b;
        }

        .nav-links {
            display: flex;
            gap: 25px;
        }

        .nav-links a {
            color: white;
            text-decoration: none;
            font-weight: 500;
            transition: all 0.3s;
            padding: 8px 12px;
            border-radius: 4px;
        }

        .nav-links a:hover {
            background-color: rgba(255, 255, 255, 0.2);
        }

        .user-section {
            display: flex;
            align-items: center;
            gap: 15px;
        }

        .user-info {
            display: flex;
            align-items: center;
            gap: 10px;
            background: rgba(255, 255, 255, 0.2);
            padding: 8px 15px;
            border-radius: 30px;
        }

        .user-avatar {
            width: 36px;
            height: 36px;
            border-radius: 50%;
            background: white;
            color: #ff416c;
            display: flex;
            align-items: center;
            justify-content: center;
            font-weight: bold;
        }

        .user-name {
            font-weight: 600;
        }

        .btn {
            padding: 10px 20px;
            border-radius: 4px;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s;
            text-decoration: none;
            display: inline-block;
            border: none;
        }

        .btn-primary {
            background-color: #ffeb3b;
            color: #333;
        }

        .btn-primary:hover {
            background-color: #fdd835;
            transform: translateY(-2px);
        }

        .btn-outline {
            border: 2px solid white;
            color: white;
            background: transparent;
        }

        .btn-outline:hover {
            background-color: white;
            color: #ff416c;
        }

        /* Welcome Banner */
        .welcome-banner {
            background: linear-gradient(to right, #4CAF50, #45a049);
            color: white;
            padding: 15px 0;
            text-align: center;
            margin-bottom: 20px;
        }

        .welcome-banner p {
            font-size: 18px;
            font-weight: 500;
        }

        /* Hero Section */
        .hero {
            background: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), 
                        url('https://images.unsplash.com/photo-1489599804159-0363135b5f10?ixlib=rb-4.0.3&auto=format&fit=crop&w=1350&q=80');
            background-size: cover;
            background-position: center;
            color: white;
            padding: 80px 0;
            text-align: center;
            border-radius: 10px;
            margin-bottom: 40px;
        }

        .hero h2 {
            font-size: 42px;
            margin-bottom: 20px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }

        .hero p {
            font-size: 18px;
            max-width: 700px;
            margin: 0 auto 30px;
            line-height: 1.6;
        }

        .search-bar {
            max-width: 600px;
            margin: 0 auto;
            display: flex;
            background: white;
            border-radius: 50px;
            overflow: hidden;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
        }

        .search-bar input {
            flex: 1;
            padding: 15px 20px;
            border: none;
            outline: none;
            font-size: 16px;
        }

        .search-bar button {
            background: #ff416c;
            color: white;
            border: none;
            padding: 0 25px;
            cursor: pointer;
            transition: all 0.3s;
        }

        .search-bar button:hover {
            background: #ff4b2b;
        }

        /* Quick Actions */
        .quick-actions {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin-bottom: 40px;
        }

        .action-card {
            background: white;
            border-radius: 10px;
            padding: 20px;
            text-align: center;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s;
            width: 150px;
        }

        .action-card:hover {
            transform: translateY(-5px);
        }

        .action-icon {
            font-size: 30px;
            color: #ff416c;
            margin-bottom: 10px;
        }

        .action-card p {
            font-weight: 600;
            color: #333;
        }

        /* Movies Section */
        .section-title {
            font-size: 28px;
            margin: 40px 0 20px;
            color: #333;
            position: relative;
            padding-bottom: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .section-title::after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 80px;
            height: 4px;
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            border-radius: 2px;
        }

        .view-all {
            font-size: 16px;
            color: #ff416c;
            text-decoration: none;
            font-weight: 600;
        }

        .movies-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
            gap: 25px;
            margin-bottom: 50px;
        }

        .movie-card {
            background: white;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s, box-shadow 0.3s;
        }

        .movie-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2);
        }

        .movie-poster {
            width: 100%;
            height: 280px;
            object-fit: cover;
        }

        .movie-info {
            padding: 15px;
        }

        .movie-title {
            font-weight: 600;
            margin-bottom: 5px;
            font-size: 16px;
        }

        .movie-genre {
            color: #666;
            font-size: 14px;
            margin-bottom: 10px;
        }

        .movie-rating {
            display: flex;
            align-items: center;
            color: #ff9800;
            font-weight: 600;
        }

        /* Events Section */
        .events-tabs {
            display: flex;
            gap: 10px;
            margin-bottom: 20px;
        }

        .tab {
            padding: 10px 20px;
            background: white;
            border-radius: 30px;
            cursor: pointer;
            font-weight: 500;
            transition: all 0.3s;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        .tab.active {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            color: white;
        }

        .events-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
            gap: 25px;
            margin-bottom: 50px;
        }

        .event-card {
            background: white;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
        }

        .event-image {
            width: 100%;
            height: 180px;
            object-fit: cover;
        }

        .event-info {
            padding: 15px;
        }

        .event-title {
            font-weight: 600;
            margin-bottom: 5px;
            font-size: 18px;
        }

        .event-date {
            color: #ff416c;
            font-weight: 500;
            margin-bottom: 10px;
        }

        .event-location {
            color: #666;
            font-size: 14px;
            margin-bottom: 15px;
            display: flex;
            align-items: center;
        }

        .event-location i {
            margin-right: 5px;
        }

        /* Recommended for You */
        .recommended-section {
            background: white;
            border-radius: 10px;
            padding: 25px;
            margin-bottom: 50px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
        }

        /* Footer */
        footer {
            background: #333;
            color: white;
            padding: 50px 0 20px;
        }

        .footer-content {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
            gap: 30px;
            margin-bottom: 30px;
        }

        .footer-column h3 {
            font-size: 18px;
            margin-bottom: 20px;
            position: relative;
            padding-bottom: 10px;
        }

        .footer-column h3::after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 40px;
            height: 3px;
            background: #ff416c;
        }

        .footer-column ul {
            list-style: none;
        }

        .footer-column ul li {
            margin-bottom: 10px;
        }

        .footer-column ul li a {
            color: #ccc;
            text-decoration: none;
            transition: color 0.3s;
        }

        .footer-column ul li a:hover {
            color: white;
        }

        .social-icons {
            display: flex;
            gap: 15px;
            margin-top: 20px;
        }

        .social-icons a {
            color: white;
            font-size: 20px;
            transition: color 0.3s;
        }

        .social-icons a:hover {
            color: #ff416c;
        }

        .copyright {
            text-align: center;
            padding-top: 20px;
            border-top: 1px solid #444;
            color: #999;
            font-size: 14px;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .header-content {
                flex-direction: column;
                gap: 15px;
            }
            
            .nav-links {
                gap: 15px;
            }
            
            .hero h2 {
                font-size: 32px;
            }
            
            .movies-grid, .events-grid {
                grid-template-columns: repeat(auto-fill, minmax(150px, 1fr));
            }
            
            .quick-actions {
                flex-wrap: wrap;
            }
        }
    </style>
</head>
<body>
    <!-- Header -->
    <header>
        <div class="container">
            <div class="header-content">
                <div class="logo">
                    <i class="fas fa-ticket-alt logo-icon"></i>
                    <h1>BookMyShow</h1>
                </div>
                <div class="nav-links">
                    <a href="#">Movies</a>
                    <a href="#">Events</a>
                    <a href="#">Plays</a>
                    <a href="#">Sports</a>
                    <a href="#">Activities</a>
                </div>
                <div class="user-section">
                    <div class="user-info">
                        <div class="user-avatar">U</div>
                        <div class="user-name">Welcome, User!</div>
                    </div>
                    <button class="btn btn-outline">Logout</button>
                </div>
            </div>
        </div>
    </header>

    <!-- Welcome Banner -->
    <div class="welcome-banner">
        <div class="container">
            <p>🎉 Welcome back! Check out personalized recommendations just for you.</p>
        </div>
    </div>

    <!-- Main Content -->
    <main class="container">
        <!-- Hero Section -->
        <section class="hero">
            <h2>Welcome to BookMyShow</h2>
            <p>Book tickets for the latest movies, events, plays, sports and more. Experience entertainment like never before!</p>
            <div class="search-bar">
                <input type="text" placeholder="Search for movies, events, plays...">
                <button><i class="fas fa-search"></i></button>
            </div>
        </section>

        <!-- Quick Actions -->
        <div class="quick-actions">
            <div class="action-card">
                <div class="action-icon">
                    <i class="fas fa-film"></i>
                </div>
                <p>Movies</p>
            </div>
            <div class="action-card">
                <div class="action-icon">
                    <i class="fas fa-music"></i>
                </div>
                <p>Events</p>
            </div>
            <div class="action-card">
                <div class="action-icon">
                    <i class="fas fa-theater-masks"></i>
                </div>
                <p>Plays</p>
            </div>
            <div class="action-card">
                <div class="action-icon">
                    <i class="fas fa-basketball-ball"></i>
                </div>
                <p>Sports</p>
            </div>
            <div class="action-card">
                <div class="action-icon">
                    <i class="fas fa-ticket-alt"></i>
                </div>
                <p>My Tickets</p>
            </div>
        </div>

        <!-- Recommended for You -->
        <div class="recommended-section">
            <h2 class="section-title">Recommended For You <a href="#" class="view-all">View All</a></h2>
            <div class="movies-grid">
                <div class="movie-card">
                    <img src="https://images.unsplash.com/photo-1594909122845-11baa439b7bf?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 1" class="movie-poster">
                    <div class="movie-info">
                        <div class="movie-title">The Last Adventure</div>
                        <div class="movie-genre">Action, Adventure</div>
                        <div class="movie-rating">
                            <i class="fas fa-star"></i> 8.5/10
                        </div>
                    </div>
                </div>
                <div class="movie-card">
                    <img src="https://images.unsplash.com/photo-1536440136628-849c177e76a1?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 2" class="movie-poster">
                    <div class="movie-info">
                        <div class="movie-title">Midnight Dreams</div>
                        <div class="movie-genre">Drama, Romance</div>
                        <div class="movie-rating">
                            <i class="fas fa-star"></i> 7.9/10
                        </div>
                    </div>
                </div>
                <div class="movie-card">
                    <img src="https://images.unsplash.com/photo-1489599804159-0363135b5f10?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 3" class="movie-poster">
                    <div class="movie-info">
                        <div class="movie-title">Space Odyssey</div>
                        <div class="movie-genre">Sci-Fi, Thriller</div>
                        <div class="movie-rating">
                            <i class="fas fa-star"></i> 8.7/10
                        </div>
                    </div>
                </div>
                <div class="movie-card">
                    <img src="https://images.unsplash.com/photo-1574267432553-4b4628081c31?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 4" class="movie-poster">
                    <div class="movie-info">
                        <div class="movie-title">Comedy Nights</div>
                        <div class="movie-genre">Comedy</div>
                        <div class="movie-rating">
                            <i class="fas fa-star"></i> 7.2/10
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Movies Section -->
        <h2 class="section-title">Now Showing <a href="#" class="view-all">View All</a></h2>
        <div class="movies-grid">
            <div class="movie-card">
                <img src="https://images.unsplash.com/photo-1535016120720-40c646be5580?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 5" class="movie-poster">
                <div class="movie-info">
                    <div class="movie-title">Action Hero</div>
                    <div class="movie-genre">Action, Thriller</div>
                    <div class="movie-rating">
                        <i class="fas fa-star"></i> 8.1/10
                    </div>
                </div>
            </div>
            <div class="movie-card">
                <img src="https://images.unsplash.com/photo-1485846234645-a62644f84728?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 6" class="movie-poster">
                <div class="movie-info">
                    <div class="movie-title">Mystery Island</div>
                    <div class="movie-genre">Mystery, Adventure</div>
                    <div class="movie-rating">
                        <i class="fas fa-star"></i> 7.8/10
                    </div>
                </div>
            </div>
            <div class="movie-card">
                <img src="https://images.unsplash.com/photo-1560169897-fc0cdbdfa4d5?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 7" class="movie-poster">
                <div class="movie-info">
                    <div class="movie-title">Love Story</div>
                    <div class="movie-genre">Romance, Drama</div>
                    <div class="movie-rating">
                        <i class="fas fa-star"></i> 8.3/10
                    </div>
                </div>
            </div>
            <div class="movie-card">
                <img src="https://images.unsplash.com/photo-1593359677879-a4bb92f829d1?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Movie 8" class="movie-poster">
                <div class="movie-info">
                    <div class="movie-title">Horror Night</div>
                    <div class="movie-genre">Horror, Thriller</div>
                    <div class="movie-rating">
                        <i class="fas fa-star"></i> 7.5/10
                    </div>
                </div>
            </div>
        </div>

        <!-- Events Section -->
        <h2 class="section-title">Upcoming Events <a href="#" class="view-all">View All</a></h2>
        <div class="events-tabs">
            <div class="tab active">Concerts</div>
            <div class="tab">Plays</div>
            <div class="tab">Sports</div>
            <div class="tab">Workshops</div>
        </div>
        <div class="events-grid">
            <div class="event-card">
                <img src="https://images.unsplash.com/photo-1501281668745-f7f57925c3b4?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Concert" class="event-image">
                <div class="event-info">
                    <div class="event-title">Summer Music Festival</div>
                    <div class="event-date">June 15, 2023 | 7:00 PM</div>
                    <div class="event-location">
                        <i class="fas fa-map-marker-alt"></i> City Stadium
                    </div>
                    <a href="#" class="btn btn-primary">Book Now</a>
                </div>
            </div>
            <div class="event-card">
                <img src="https://images.unsplash.com/photo-1492684223066-81342ee5ff30?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Play" class="event-image">
                <div class="event-info">
                    <div class="event-title">The Phantom of the Opera</div>
                    <div class="event-date">June 20, 2023 | 6:30 PM</div>
                    <div class="event-location">
                        <i class="fas fa-map-marker-alt"></i> Grand Theater
                    </div>
                    <a href="#" class="btn btn-primary">Book Now</a>
                </div>
            </div>
            <div class="event-card">
                <img src="https://images.unsplash.com/photo-1461896836934-ffe607ba8211?ixlib=rb-4.0.3&auto=format&fit=crop&w=500&q=80" alt="Sports" class="event-image">
                <div class="event-info">
                    <div class="event-title">National Football League</div>
                    <div class="event-date">June 25, 2023 | 4:00 PM</div>
                    <div class="event-location">
                        <i class="fas fa-map-marker-alt"></i> Sports Arena
                    </div>
                    <a href="#" class="btn btn-primary">Book Now</a>
                </div>
            </div>
        </div>
    </main>

    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="footer-content">
                <div class="footer-column">
                    <h3>BookMyShow</h3>
                    <ul>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Careers</a></li>
                        <li><a href="#">Contact Us</a></li>
                        <li><a href="#">Press</a></li>
                    </ul>
                </div>
                <div class="footer-column">
                    <h3>Movies</h3>
                    <ul>
                        <li><a href="#">Movies in Theaters</a></li>
                        <li><a href="#">Upcoming Movies</a></li>
                        <li><a href="#">Movie Reviews</a></li>
                        <li><a href="#">Movie Trailers</a></li>
                    </ul>
                </div>
                <div class="footer-column">
                    <h3>Events</h3>
                    <ul>
                        <li><a href="#">Concerts</a></li>
                        <li><a href="#">Plays</a></li>
                        <li><a href="#">Sports</a></li>
                        <li><a href="#">Workshops</a></li>
                    </ul>
                </div>
                <div class="footer-column">
                    <h3>Follow Us</h3>
                    <div class="social-icons">
                        <a href="#"><i class="fab fa-facebook-f"></i></a>
                        <a href="#"><i class="fab fa-twitter"></i></a>
                        <a href="#"><i class="fab fa-instagram"></i></a>
                        <a href="#"><i class="fab fa-youtube"></i></a>
                    </div>
                </div>
            </div>
            <div class="copyright">
                &copy; 2023 BookMyShow. All rights reserved.
            </div>
        </div>
    </footer>

    <script>
        // Simple tab functionality
        document.querySelectorAll('.tab').forEach(tab => {
            tab.addEventListener('click', () => {
                document.querySelectorAll('.tab').forEach(t => t.classList.remove('active'));
                tab.classList.add('active');
            });
        });
    </script>
</body>
</html>