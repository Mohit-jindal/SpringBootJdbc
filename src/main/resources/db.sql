
create table employee_table(
		employee_id int(11) not null auto_increment,
		email varchar(255) DEFAULT NULL,
		employee_name varchar(255) DEFAULT NULL,
		salary double DEFAULT NULL,
		primary key(employee_id),
		KEY EMAIL_INDEX (email)
);