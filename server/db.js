const mysql = require('mysql2');

const connection = mysql.createConnection({
  host: 'localhost',
  user: 'your_mysql_user',
  password: 'your_mysql_password',
  database: 'your_database_name'
});

connection.connect(error => {
  if (error) throw error;
  console.log('Connected to MySQL database.');
});

module.exports = connection;