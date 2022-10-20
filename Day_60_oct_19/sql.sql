create database crud_demo_1

use crud_demo_1

create table student
(
id int primary key auto_increment,
name varchar(45),
course varchar(45),
fee int
)

select * from student;