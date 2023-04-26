create table if not exists vehicles(
vehicleID INT,
year int not null,
make varchar(100) not null);

create table SaledFeedback(
customerFeedback varchar(2048)  not null,
createsDate datetime not null default current_timestamp,
customerReference varchar(15) default 'Online Sales',
username varchar(50) not null
);

create table Department_one(
id INT primary key,
name varchar(30) not null
);

create table department_two(
id int,
name varchar(32) not null,
primary key(id));

create table Student(
std_id int,
roll_id int,
fullname varchar(255),
is_completed boolean,
primary key(std_id, roll_id)
);


CREATE TABLE department (
    id INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    dname VARCHAR(20) NOT NULL DEFAULT 'pending'
);

CREATE TABLE employee (
    empId INT(10) PRIMARY KEY AUTO_INCREMENT,
    eName VARCHAR(10) NOT NULL,
    depID INT(10),    
    FOREIGN KEY (depID) REFERENCES department (id)
);



create database employeesData;
create table empDetails(
name varchar(20),
id int,
department varchar(20),
joinDate date
);

