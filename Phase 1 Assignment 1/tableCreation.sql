CREATE TABLE student (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
   	name TEXT NOT NULL,
   	age  INTEGER ,
   	mobile_no TEXT,
   	registration_no  INTEGER,
   	year_of_batch  INTEGER NOT NULL
);

CREATE TABLE teacher (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
   	name TEXT NOT NULL,
   	domain TEXT,
   	department TEXT
);

