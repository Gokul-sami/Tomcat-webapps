<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Groovy</title>
    <link rel="stylesheet" href="./Exercise 5 servlet/styles/ex5_c_home.css">
</head>
<body>
    <div class="main">
        <!-- Navigation area (d1) -->
        <div class="d1">
            <div class="logo">🎵 Groovy</div>
            <div class="nav-section">
                <div class="nav-link"><span class="icon">🏠</span>Home</div>
                <div class="nav-link"><span class="icon">🔍</span>Search</div>
                <div class="nav-link"><span class="icon">📚</span>My Library</div>
            </div>
            <div class="nav-section">
                <div class="nav-link"><span class="icon">➕</span>New Playlist</div>
                <div class="nav-link"><span class="icon">❤️</span>Liked Songs</div>
            </div>
            <div class="nav-bottom">
                <div class="nav-link"><span class="icon">⚙️</span>Settings</div>
                <div class="nav-link"><span class="icon">🚪</span>Logout</div>
            </div>
        </div>

        <!-- Content area (d2) -->
        <div class="d2">
            <!-- Header area (d3) -->
            <div class="d3">
                <!-- <div class="library-title">Your Library</div> -->
                <!-- Display the name from session -->
                <div class="library-title">
                    <p>Welcome, <%= session.getAttribute("userName") %>!</p>
                </div>
                <div class="profile-icon">👤</div>
            </div>

            <!-- Category grid (d4) -->
            <div class="d4">
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Pop</div>
                </div>
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Rock</div>
                </div>
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Jazz</div>
                </div>
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Hip Hop</div>
                </div>
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Classical</div>
                </div>
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Blues</div>
                </div>
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Country</div>
                </div>
                <div class="category-tile">
                    <img src="https://via.placeholder.com/150" alt="Category Image" class="category-image">
                    <div class="category-name">Electronic</div>
                </div>              
            </div>

            <!-- Song listing area (d5) -->
            <div class="d5">
                <h2>Song List</h2>
                <div class="song-item">
                    <span class="song-title">Song 1</span>
                    <span class="song-artist">Artist 1</span>
                    <audio controls>
                        <source src="song1.mp3" type="audio/mp3">
                        Your browser does not support the audio element.
                    </audio>
                </div>
                <div class="song-item">
                    <span class="song-title">Song 2</span>
                    <span class="song-artist">Artist 2</span>
                    <audio controls>
                        <source src="song2.mp3" type="audio/mp3">
                        Your browser does not support the audio element.
                    </audio>
                </div>
                <div class="song-item">
                    <span class="song-title">Song 3</span>
                    <span class="song-artist">Artist 3</span>
                    <audio controls>
                        <source src="song3.mp3" type="audio/mp3">
                        Your browser does not support the audio element.
                    </audio>
                </div>
                <div class="song-item">
                    <span class="song-title">Song 4</span>
                    <span class="song-artist">Artist 4</span>
                    <audio controls>
                        <source src="song4.mp3" type="audio/mp3">
                        Your browser does not support the audio element.
                    </audio>
                </div>
            </div>
        </div>
    </div>
</body>
</html>