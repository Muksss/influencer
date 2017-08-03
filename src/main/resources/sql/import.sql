SELECT * FROM person;
SELECT * FROM influencer_info;
SELECT * FROM catagory;
SELECT * FROM influencer_activity;

UPDATE Person SET name='anything' WHERE id>1;

CREATE TABLE Person (
  id SERIAL PRIMARY KEY,
  name VARCHAR (20) NOT NULL DEFAULT '',
  country VARCHAR (20) DEFAULT NULL);

CREATE TABLE category (
  id SERIAL PRIMARY KEY,
  name VARCHAR
);

CREATE TABLE influencer_activity (
  id SERIAL PRIMARY KEY ,
  influencer_id INTEGER REFERENCES influencer_info(id),
  catagory_id INTEGER REFERENCES category(id)
);

CREATE TABLE influencer_info (
  id SERIAL PRIMARY KEY,
  name VARCHAR,
  twitter_handle VARCHAR
);

