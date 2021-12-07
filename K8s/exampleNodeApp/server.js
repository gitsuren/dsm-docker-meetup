'use strict';

const express = require('express');

// Constants
const PORT = 8888;
const HOST = '0.0.0.0';

// App
const app = express();
app.get('/', (req, res) => {
  res.send('Hello FROM SURENDRA - THIS IS DOCKER + KUBERNETES 101 SESSION');
});

app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);