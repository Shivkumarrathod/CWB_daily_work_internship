const express = require('express');
const mongoose = require('mongoose');
const tutorialRoutes = require('./router/tutorials.js');
const app = express();

// Middleware
app.use(express.json());

// MongoDB connection
mongoose.connect('mongodb://localhost:27017/tutorialDB')
.then(() => console.log('MongoDB connected'))
.catch(err => console.error(err));

// Routes
app.use('/api/tutorials', tutorialRoutes);

// Start server
app.listen(3000, () => {
  console.log('Server started on port 3000');
});
