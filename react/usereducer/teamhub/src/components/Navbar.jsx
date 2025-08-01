import React from 'react';
import { Link } from 'react-router-dom';

const Navbar = () => {
  const user = JSON.parse(localStorage.getItem('user'));

  return (
    <nav style={{
      padding: '1rem',
      background: '#f0f0f0',
      display: 'flex',
      justifyContent: 'space-between',
      alignItems: 'center',
      width: '100%'
    }}>
      <div>
        <Link to="/events" style={{ marginRight: '1rem' }}>Events</Link>
        <Link to="/users">All Users</Link>
      </div>

      {user && (
        <div style={{ fontSize: '0.9rem' }}>
          <strong>{user.name}</strong> (<code>{user.id}</code>)
        </div>
      )}
    </nav>
  );
};

export default Navbar;
