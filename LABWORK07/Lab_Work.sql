create database Information
use Information
create table Employee(
Emp_ID int primary key,
Student_Name varchar(50),
Department_Name varchar(50),
Salary int
);
insert into Employee(
Emp_ID,
Student_Name,
Department_Name,
Salary
)
values
(100,'Reema','BCA',15000),
(101,'Amrit','BMS',16000),
(102,'Rakesh','Account',20000),
(103,'Shukla','Account',25000);


select * from Employee

select Student_Name,Salary 
from Employee

delete from Employee where Emp_ID=101



Update Employee set Department_Name='Finance' where Emp_ID in(102,103)

