import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import ProfileForm from './components/ProfileForm';
import EventList from './components/EventList';
import EventDetails from './components/EventDetails';
import Navbar from './components/Navbar';
import './App.css'; // Assuming you have some global styles
const App = () => {
  return (
    <Router>
      <Navbar/>
      <Routes>
        <Route path="/" element={<ProfileForm />} />
        <Route path="/events" element={<EventList />} />
        <Route path="/events/:id" element={<EventDetails />} />
      </Routes>
    </Router>
  );
};

export default App;
