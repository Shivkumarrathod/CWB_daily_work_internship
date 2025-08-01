import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';

const EventList = () => {
  const navigate = useNavigate();
  const [events, setEvents] = useState([]);
  const [showForm, setShowForm] = useState(false);
  const [newEvent, setNewEvent] = useState({
    name: '',
    description: ''
  });

  useEffect(() => {
    const storedEvents = JSON.parse(localStorage.getItem('events')) || [];
    setEvents(storedEvents);
  }, []);

  const handleInputChange = (e) => {
    setNewEvent({ ...newEvent, [e.target.name]: e.target.value });
  };

  const handleCreateEvent = (e) => {
    e.preventDefault();

    const eventWithId = {
      id: 'ev-' + Math.random().toString(36).substr(2, 6),
      ...newEvent,
      teams: []
    };

    const updatedEvents = [...events, eventWithId];
    setEvents(updatedEvents);
    localStorage.setItem('events', JSON.stringify(updatedEvents));

    setNewEvent({ name: '', description: '' });
    setShowForm(false);
  };

  const goToEventDetails = (id) => {
    navigate(`/events/${id}`);
  };

  return (
    <div style={{ padding: '2rem' }}>
      <div style={{ display: 'flex', justifyContent: 'space-between' }}>
        <h2>All Events</h2>
        <button onClick={() => setShowForm(true)}>+ Create Event</button>
      </div>

      <ul style={{ listStyle: 'none', padding: 0 }}>
        {events.map((event) => (
          <li
            key={event.id}
            style={{
              border: '1px solid #ccc',
              padding: '1rem',
              marginTop: '1rem',
              cursor: 'pointer'
            }}
            onClick={() => goToEventDetails(event.id)}
          >
            <h3>{event.name}</h3>
            <p>{event.description}</p>
          </li>
        ))}
      </ul>

      {showForm && (
        <div style={{
          position: 'fixed',
          top: '20%',
          left: '35%',
          background: 'white',
          padding: '2rem',
          border: '1px solid #888',
          boxShadow: '0 0 10px rgba(0,0,0,0.3)'
        }}>
          <h3>Create Event</h3>
          <form onSubmit={handleCreateEvent}>
            <input
              type="text"
              name="name"
              placeholder="Event name"
              value={newEvent.name}
              onChange={handleInputChange}
              required
            /><br /><br />
            <textarea
              name="description"
              placeholder="Event description"
              value={newEvent.description}
              onChange={handleInputChange}
              required
            ></textarea><br /><br />
            <button type="submit">Create</button>{' '}
            <button type="button" onClick={() => setShowForm(false)}>Cancel</button>
          </form>
        </div>
      )}
    </div>
  );
};

export default EventList;
