DROP TABLE IF EXISTS BOOKING;

DROP TABLE IF EXISTS ADDRESS;


CREATE TABLE IF NOT EXISTS BOOKINGDETAILS (
  id INT PRIMARY KEY,
  firstName VARCHAR(250) NOT NULL,
  lastName VARCHAR(250) NOT NULL,
  dateofbirth DATE  NULL,
  checkin DATE  NULL,
  checkout DATE  NULL,
	totalprice DOUBLE NULL
);

CREATE TABLE IF NOT EXISTS ADDRESS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  line1 VARCHAR(250) NOT NULL,
  line2 VARCHAR(250) NULL,
  city VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL,
  zipcode VARCHAR(250) NOT NULL
  );
  