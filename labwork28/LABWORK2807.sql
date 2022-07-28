use Information;

create table Emp
(
Emp_ID int primary key,
fname varchar(50),
lname varchar (50),
Department varchar(50));

insert into Emp
(
Emp_ID,
fname,
lname,
Department
)

values
(01,'Sharukh','Khan','Account'),
(02,'Rani','Shukla','Finance'),
(03,'Seema','Kumar','BCA'),
(04,'Bushra','Khan','Account');


select * from Emp;

select * from Emp where fname like 'S%';