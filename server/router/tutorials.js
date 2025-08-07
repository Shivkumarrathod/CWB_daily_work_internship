const express = require('express');
const router = express.Router();
const Tutorial = require('../models/tutorial.js');

// Get all tutorials or filter by title
router.get('/', async (req, res) => {
  try {
    const { title } = req.query;
    const condition = title ? { title: { $regex: title, $options: 'i' } } : {};
    const tutorials = await Tutorial.find(condition);
    res.status(200).json(tutorials);
  } catch (err) {
    res.status(500).send(err.message);
  }
});

// Get tutorial by ID
router.get('/:id', async (req, res) => {
  try {
    const tutorial = await Tutorial.findById(req.params.id);
    if (!tutorial) return res.sendStatus(404);
    res.status(200).json(tutorial);
  } catch (err) {
    res.status(500).send(err.message);
  }
});

// Create new tutorial
router.post('/', async (req, res) => {
  try {
    const { title, description } = req.body;
    const tutorial = new Tutorial({ title, description });
    const saved = await tutorial.save();
    res.status(201).json(saved);
  } catch (err) {
    res.status(500).send(err.message);
  }
});

// Update tutorial by ID
router.put('/:id', async (req, res) => {
  try {
    const { title, description, published } = req.body;
    const updated = await Tutorial.findByIdAndUpdate(
      req.params.id,
      { title, description, published },
      { new: true, runValidators: true }
    );
    if (!updated) return res.sendStatus(404);
    res.status(200).json(updated);
  } catch (err) {
    res.status(500).send(err.message);
  }
});

// Delete tutorial by ID
router.delete('/:id', async (req, res) => {
  try {
    const result = await Tutorial.findByIdAndDelete(req.params.id);
    if (!result) return res.sendStatus(404);
    res.sendStatus(204);
  } catch (err) {
    res.status(500).send(err.message);
  }
});

// Delete all tutorials
router.delete('/', async (req, res) => {
  try {
    await Tutorial.deleteMany({});
    res.sendStatus(204);
  } catch (err) {
    res.status(500).send(err.message);
  }
});

// Get all published tutorials
router.get('/published/all', async (req, res) => {
  try {
    const publishedTutorials = await Tutorial.find({ published: true });
    if (publishedTutorials.length === 0) return res.sendStatus(204);
    res.status(200).json(publishedTutorials);
  } catch (err) {
    res.status(500).send(err.message);
  }
});

module.exports = router;
