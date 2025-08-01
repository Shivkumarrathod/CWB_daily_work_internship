import React, { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';

const EventDetails = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [event, setEvent] = useState(null);
  const [events, setEvents] = useState([]);
  const [teamName, setTeamName] = useState('');
  const [user, setUser] = useState(null);

  useEffect(() => {
    const storedUser = JSON.parse(localStorage.getItem('user'));
    const storedEvents = JSON.parse(localStorage.getItem('events')) || [];
    const selectedEvent = storedEvents.find(ev => ev.id === id);

    if (!storedUser) navigate('/');
    setUser(storedUser);
    setEvents(storedEvents);
    setEvent(selectedEvent);
  }, [id, navigate]);

  const updateEvents = (updatedEvent) => {
    const updatedList = events.map(ev =>
      ev.id === updatedEvent.id ? updatedEvent : ev
    );
    setEvents(updatedList);
    setEvent(updatedEvent);
    localStorage.setItem('events', JSON.stringify(updatedList));
  };

  const handleCreateTeam = () => {
    if (!teamName.trim()) return;
    const newTeam = {
      teamId: 'team-' + Math.random().toString(36).substr(2, 6),
      name: teamName,
      members: [user.id]
    };

    const updatedEvent = {
      ...event,
      teams: [...event.teams, newTeam]
    };

    updateEvents(updatedEvent);
    setTeamName('');
  };

  const handleJoinTeam = (teamId) => {
    const updatedTeams = event.teams.map(team => {
      if (team.teamId === teamId && !team.members.includes(user.id)) {
        return { ...team, members: [...team.members, user.id] };
      }
      return team;
    });

    const updatedEvent = {
      ...event,
      teams: updatedTeams
    };

    updateEvents(updatedEvent);
  };

  if (!event) return <p>Loading event...</p>;

  return (
    <div style={{ padding: '2rem' ,width: '80%', margin: '0 auto'  }}>
      <h2>{event.name}</h2>
      <p>{event.description}</p>

      <hr />
      <h3>Teams</h3>
      {event.teams.length === 0 ? (
        <p>No teams yet. Be the first to create one!</p>
      ) : (
        <ul>
          {event.teams.map((team) => (
            <li key={team.teamId}>
              <strong>{team.name}</strong> – {team.members.length} members
              {!team.members.includes(user.id) && (
                <button style={{ marginLeft: '1rem' }} onClick={() => handleJoinTeam(team.teamId)}>
                  Join Team
                </button>
              )}
              {team.members.includes(user.id) && <span style={{ marginLeft: '1rem' }}>(You joined)</span>}
            </li>
          ))}
        </ul>
      )}

      <hr />
      <h3>Create New Team</h3>
      <input
        type="text"
        placeholder="Team name"
        value={teamName}
        onChange={(e) => setTeamName(e.target.value)}
      />
      <button onClick={handleCreateTeam} style={{ marginLeft: '0.5rem' }}>
        Create Team
      </button>
    </div>
  );
};

export default EventDetails;
