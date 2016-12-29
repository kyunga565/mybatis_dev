INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES 
 (1,'4891 Pacific Hwy','San Diego','CA','92110','San Diego'),
 (2,'2400 N Jefferson St','Perry','FL','32347','Taylor'),
 (3,'710 N Cable Rd','Lima','OH','45825','Allen'),
 (4,'5108 W Gore Blvd','Lawton','OK','32365','Comanche');

INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES 
 (1,'Timothy','timothy@gmail.com','123-123-1234','1988-04-25',NULL,NULL,3),
 (2,'Douglas','douglas@gmail.com','789-456-1234','1990-08-15',NULL,NULL,4);

INSERT INTO TUTORS (TUTOR_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES 
 (1,'John','john@gmail.com','111-222-3333','1980-05-20',NULL,NULL,1),
 (2,'Ken','ken@gmail.com','111-222-3333','1980-05-20',NULL,NULL,1),
 (3,'Paul','paul@gmail.com','123-321-4444','1981-03-15',NULL,NULL,2),
 (4,'Mike','mike@gmail.com','123-321-4444','1981-03-15',NULL,NULL,2);

INSERT INTO COURSES (COURSE_ID,NAME,DESCRIPTION,START_DATE,END_DATE,TUTOR_ID) VALUES 
 (1,'Quickstart Core Java','Core Java Programming','2013-03-01','2013-04-15',1),
 (2,'Quickstart JavaEE6','Enterprise App Development using JavaEE6','2013-04-01','2013-08-30',1),
 (3,'MyBatis3 Premier','MyBatis 3 framework','2013-06-01','2013-07-15',2);

INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES 
 (1,1),
 (1,2),
 (2,2);
 
 select * from students;
 select * from tutors;
 select * from courses;
 select * from addresses;
 select * from course_enrollment;
 
 select stud_id,name,email,dob from students where stud_id = 1;
 insert into students(stud_id,name,email,phone,dob) values (6,'강보미2','kbm@test.com','010-0000-0000','1995-01-05');
 update students set name='박경아',email='pka@test.com',phone='010-8888-8888',dob='2015-05-05' where stud_id = 6;
 delete from students where stud_id = 8;
 select stud_id,name,email,phone,dob from students;
 
 select stud_id,name,email,phone,a.addr_id,street,city, state,zip,country 
 from students s 
 inner join addresses a on s.addr_id=a.addr_id where stud_id =1; 