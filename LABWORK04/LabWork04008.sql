use Info;

create table EmployeeSalary(
EmpId primary key,
Project varchar(50),
Salary int,
Variable varchar(1)
);

select * from EmployeeSalary;

INSERT INTO EmployeeSalary ( EmpId,Project, Salary, Variable)
VALUES (101,'Java',15000,'P');

INSERT INTO EmployeeSalary ( EmpId,Project, Salary, Variable)
VALUES (102,'ASP.NET',20000,'Q');


INSERT INTO EmployeeSalary ( EmpId,Project, Salary, Variable)
VALUES (103,'Python',18000,'R');


INSERT INTO EmployeeSalary ( EmpId,Project, Salary, Variable)
VALUES (104,'C++',3000,'S');

select * from EmployeeSalary;



SELECT EmployeeDetails.FullName, EmployeeSalary.Salary 
FROM EmployeeDetails,EmployeeSalary
Where Salary >= 5000 AND Salary <= 10000 AND EmployeeDetails.EmpId=EmployeeSalary.EmpId;
