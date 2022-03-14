INSERT INTO student (name,age,mobile_no,registration_no,year_of_batch)
VALUES
('Arun',20,'6381355047',811719104013,2019),
('John',19,'9283325861',811718104123,2020),
('Peter',22,'9838137234',811717104045,2017),
('Lisa',21,'9025347681',811718104014,2018),
('Jams',23,'9183456236',811719104012,2019),
('andresion',18,'9457634824',811722104001,2022),
('vimal',21,'9437503223',8117191040116,2019),
('vishu',20,'7849703298',8117191040110,2019),
('hari',19,'93459485398',811719104043,2020),
('emma',21,'94595938592',811718104078,2018),
('mia',18,'987654321',8117221104025,2022),
('Sophia',23,'9876555047',811717104089,2017);

INSERT INTO teacher (name,domain ,department)
VALUES
('Jackson','Technical','cse'),
('Lucas','non-Technical','cse'),
('Leo','Technical','ece'),
('Jack','non-Technical','mech'),
('Grayson','non-Technical','eee'),
('William','Technical','cse'),
('James','Technical','mech'),
('Benjamin','Technical','civil'),
('Chloe','non-Technical','cse'),
('Ella','Technical','civil'),
('Nora','Technical','eee');


SELECT * FROM student WHERE year_of_batch=2020;

SELECT * FROM teacher WHERE department='cse';


UPDATE student
SET  name='Thulasi'
WHERE registration_no=811718104078;


UPDATE student
SET  age='20'
WHERE registration_no=811718104078;

UPDATE student
SET  mobile_no='9943256734'
WHERE registration_no=811718104123;


DELETE FROM teacher
WHERE domain='eee';

DELETE FROM teacher
WHERE name='William';

DELETE FROM teacher
WHERE name='Ella';

