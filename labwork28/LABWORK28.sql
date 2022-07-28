use Information;

create table Employee_Info
(
Emp_ID INT primary key,
Emp_Name varchar(50),
Department varchar(50)
);

insert into Employee_Info
(
Emp_ID,
Emp_Name,
Department)

values
(101,'Rekha','BCA'),
(102,'Shukla','HR'),
(103,'Varma','Account'),
(104,'Rani','HR');

select * from Employee_Info;

select * from Employee_Info where Department = 'HR';
