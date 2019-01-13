create database taxi_management;
use taxi_management;
create table customer
(
cust_id int primary key,
cust_name varchar(255) not null,
cust_number bigint not null ,
cust_location varchar(255)
);
create table driver
(
dri_id int primary key,
dri_name varchar(255),
dri_number bigint not null,
dri_location varchar(255)
);
CREATE TABLE vehicles (
    vehi_number INT,
    dri_id INT,
    vehi_type VARCHAR(255),
    vehi_name VARCHAR(255),
    PRIMARY KEY (vehi_number , dri_id),
    FOREIGN KEY (dri_id)
        REFERENCES driver (dri_id)
);
create table rating
(
cust_id int,
dri_id int,
rate int ,
primary key(cust_id,dri_id),
foreign key(cust_id) references customer(cust_id),
foreign key(dri_id) references driver(dri_id)
);
create table payment
(
pay_id int,
dri_id int,
cust_id int,
pay_type varchar(255),
amount int,
primary key(pay_id,cust_id,dri_id),
foreign key(cust_id) references customer(cust_id),
foreign key(dri_id) references driver(dri_id)
);
create table ride
(
ride_id int ,
cust_id int,
dri_id int,
start_time time not null,
pickup_location varchar(255) not null,
drop_location varchar(255),
primary key(ride_id,cust_id,dri_id),
foreign key(cust_id) references customer(cust_id),
foreign key(dri_id) references driver(dri_id)
);

insert into customer values(1,"shan",9606214470,"kengeri");
insert into customer values(2,"layeeq",9606254470,"marathahalli");
insert into customer values(3,"naman",9606254234,"marathahalli");
insert into customer values(4,"deepak",9606254470,"mysore");
insert into customer values(5,"aditya",8406254470,"pune");

select * from customer;

insert into driver values(1,"prateek",7606254470,"mysore");
insert into driver values(2,"manish",9996254470,"marathahalli");
insert into driver values(3,"rohan",8886254470,"pune");

select * from driver;

insert into vehicle values("KA123HR2345",1,"Pool","Indica");
insert into vehicle values("KA123HR2342",1,"Pool","Indica");
insert into vehicle values("KA123HR2",1,"Pool","Indica");
insert into vehicle values("KA123HR2345",1,"Pool","Indica");
ALTER TABLE vehicle modify COLUMN vehi_number int;

select * from vehicle;
ALTER TABLE vehicle drop COLUMN vehi_number ;
insert into vehicles values(1234,1,"Pool","Indica");
insert into vehicle values(12345,1,"Pool","Indica");
insert into vehicles values(12356,3,"HireGo","Swift");
select * from vehicles;
insert into vehicles values(12345,2,"Pool","Indica");

select * from vehicles;

insert into payment values(100,1,3,"online",200);
insert into payment values(200,1,3,"online",200);
insert into payment values(300,2,2,"offline",2000);
insert into payment values(500,2,1,"online",500);
select * from payment;
insert into ride values(1,1,3,'22:40:23',"marathalli","kengeri");
insert into ride values(1,2,3,'10:40:23',"pune","mysore");
insert into ride values(2,2,3,'10:40:23',"marathalli","pune");
select * from ride;
alter table rating add comments varchar(255);
select * from rating;
insert into rating values (1,3,5,"Excellent");
insert into rating values (2,2,4,"Good");
insert into rating values(2,1,1,"Worst");
select * from rating;

UPDATE customer SET  cust_location= 'btm layout' WHERE cust_id = 5;
drop table vehicle;
SELECT * FROM driver
WHERE dri_location LIKE 'm%';

SELECT * FROM customer WHERE cust_location IN (SELECT dri_location FROM driver);

SELECT *
FROM customer
INNER JOIN driver ON customer.cust_id = driver.dri_id;

SELECT *
FROM customer
LEFT JOIN driver ON customer.cust_id = driver.dri_id;

SELECT *
FROM customer
Right JOIN driver ON customer.cust_id = driver.dri_id;


