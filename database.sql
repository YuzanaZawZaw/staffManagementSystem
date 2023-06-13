
create table staff_cert	(
	staff_cert_id int primary key auto_increment,				
	staff_cert_name varchar(10)				
);


insert into staff_cert
values(null,'J2EE'),
(null,'PHP'),
(null,'J2SE'),
(null,'C#'),
(null,'Android');

select * from staff_cert;


create table staff(
	staff_id int primary key auto_increment,				
	staff_name	varchar(10),			
	staff_dob date,				
	staff_exp int,		
	staff_cert_id int,
	foreign key (staff_cert_id) references staff_cert(staff_cert_id) 
);

select * from staff;
