CREATE DATABASE IF NOT EXISTS EmployeeDB;
USE EmployeeDB;
CREATE TABLE IF NOT EXISTS Employee (
	id int NOT NULL AUTO_INCREMENT,
	firstname VARCHAR(50),
	lastname VARCHAR(50),
	streetaddress VARCHAR(50),
	city VARCHAR(50),
	state VARCHAR(50),
	zipcode VARCHAR(50),
	cellphone VARCHAR(50),
	homephone VARCHAR(50),
	email VARCHAR(50),
	PRIMARY KEY (id)
);

insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Connie', 'Dybald', '222 Sunbrook Park', 'Tobol', 'LA', '70888', '8307286943', '7227793724', 'cdybald0@blogspot.com');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Myles', 'Casellas', '52734 Arkansas Avenue', 'Straldzha', 'NY', '8693', '2799894449', '5834659166', 'mcasellas1@hc360.com');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Stanly', 'Marcam', '40977 Corscot Center', 'Tsaghkahovit', 'TX', '89087', '2925764118', '7044964012', 'smarcam2@github.com');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Ax', 'Jans', '0 Dayton Way', 'Luboń', 'LA', '62-031', '5658509849', '5675807088', 'ajans3@people.com.cn');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Libbey', 'Henrichsen', '932 Lindbergh Street', 'Gorshechnoye', 'CT', '307425', '2173930983', '1996515324', 'lhenrichsen4@printfriendly.com');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Carlina', 'O''Leagham', '4963 Brown Court', 'Shaxi', 'CT', '87089', '2074872067', '4925783436', 'coleagham5@ed.gov');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Vanni', 'Curteis', '5658 Myrtle Junction', 'Kyzyl-Burun','TX', '89087', '3499165259', '8161361991', 'vcurteis6@theatlantic.com');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Giorgi', 'Riggs', '34 Lindbergh Crossing', 'Spas', 'NY', '8693', '9598550490', '8743317920', 'griggs7@cloudflare.com');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Blondy', 'Larn', '33827 Monument Road', 'Jōetsu', 'AZ', '949-1742', '5027108228', '2342452735', 'blarn8@google.ca');
insert into Employee (firstname, lastname, streetaddress, city, state, zipcode, cellphone, homephone, email) values ('Gonzales', 'Lightfoot', '005 Valley Edge Hill', 'Sena', 'AZ', '13110', '4539958060', '4538515031', 'glightfoot9@facebook.com');