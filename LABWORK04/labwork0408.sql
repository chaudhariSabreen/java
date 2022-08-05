use Info;

create table EmployeeDetails(
EmpId primary key,
FullName varchar(50),
ManagerId int,
DateOfJoining date,
City varchar(50)
);

select * from EmployeeDetails;

INSERT INTO EmployeeDetails ( EmpId,FullName, ManagerId, DateOfJoining,City)
VALUES (101,'Sidra',120,'02/13/2016','Pune');

INSERT INTO EmployeeDetails ( EmpId,FullName, ManagerId, DateOfJoining,City)
VALUES (102,'Bushra',122,'03/23/2017','Kolkata');

INSERT INTO EmployeeDetails ( EmpId,FullName, ManagerId, DateOfJoining,City)
VALUES (103,'Salim',130,'09/25/2018','Pune');

INSERT INTO EmployeeDetails ( EmpId,FullName, ManagerId, DateOfJoining,City)
VALUES (104,'Sidra',120,'02/13/2016','Pune');


SELECT FullName FROM EmployeeDetails WHERE FullName LIKE '__hn%'; 