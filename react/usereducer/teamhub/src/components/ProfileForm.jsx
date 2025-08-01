import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';

const ProfileForm = () => {
  const [name, setName] = useState('');
  const navigate = useNavigate();

  // Check if user already exists
  useEffect(() => {
    const existingUser = JSON.parse(localStorage.getItem('user'));
    // if (existingUser) {
    //   navigate('/events');
    // }
  }, [navigate]);

  const generateId = () => {
    return 'user-' + Math.random().toString(36).substr(2, 9);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!name.trim()) return;

    const newUser = {
      id: generateId(),
      name,
    };

    localStorage.setItem('user', JSON.stringify(newUser));
    navigate('/events');
  };

  return (
    <div style={{ padding: '2rem' }}>
      <h2>Create Your Profile</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Enter your name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
        <br /><br />
        <button type="submit">Create Profile</button>
      </form>
    </div>
  );
};

export default ProfileForm;
