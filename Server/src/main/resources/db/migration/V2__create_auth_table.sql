CREATE TABLE auth (
  id SERIAL primary key,
  username VARCHAR(255) NOT NULL unique,
  password VARCHAR(255) NOT NULL
)