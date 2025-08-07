const express = require('express');
const router = express.Router();
const db = require('../db.js');

// Get all tutorials or filter by title
router.get('/', (req, res) => {
  const title = req.query.title;
  let query = 'SELECT * FROM tutorials';
  if (title) {
    query += ` WHERE title LIKE '%${title}%'`;
  }
  db.query(query, (err, results) => {
    if (err) return res.status(500).send(err);
    res.status(200).json(results);
  });
});

// Get tutorial by ID
router.get('/:id', (req, res) => {
  const { id } = req.params;
  db.query('SELECT * FROM tutorials WHERE id = ?', [id], (err, results) => {
    if (err) return res.status(500).send(err);
    if (results.length === 0) return res.sendStatus(404);
    res.status(200).json(results[0]);
  });
});

// Create new tutorial
router.post('/', (req, res) => {
  const { title, description } = req.body;
  const published = false;
  db.query(
    'INSERT INTO tutorials (title, description, published) VALUES (?, ?, ?)',
    [title, description, published],
    (err, result) => {
      if (err) return res.status(500).send(err);
      const newTutorial = { id: result.insertId, title, description, published };
      res.status(201).json(newTutorial);
    }
  );
});

// Update tutorial by ID
router.put('/:id', (req, res) => {
  const { id } = req.params;
  const { title, description, published } = req.body;

  db.query('SELECT * FROM tutorials WHERE id = ?', [id], (err, results) => {
    if (err) return res.status(500).send(err);
    if (results.length === 0) return res.sendStatus(404);

    db.query(
      'UPDATE tutorials SET title = ?, description = ?, published = ? WHERE id = ?',
      [title, description, published, id],
      err => {
        if (err) return res.status(500).send(err);
        res.status(200).json({ id, title, description, published });
      }
    );
  });
});

// Delete tutorial by ID
router.delete('/:id', (req, res) => {
  const { id } = req.params;
  db.query('DELETE FROM tutorials WHERE id = ?', [id], (err, result) => {
    if (err) return res.status(500).send(err);
    res.sendStatus(204);
  });
});

// Delete all tutorials
router.delete('/', (req, res) => {
  db.query('DELETE FROM tutorials', err => {
    if (err) return res.status(500).send(err);
    res.sendStatus(204);
  });
});

// Get all published tutorials
router.get('/published/all', (req, res) => {
  db.query('SELECT * FROM tutorials WHERE published = true', (err, results) => {
    if (err) return res.status(500).send(err);
    if (results.length === 0) return res.sendStatus(204);
    res.status(200).json(results);
  });
});

module.exports = router;