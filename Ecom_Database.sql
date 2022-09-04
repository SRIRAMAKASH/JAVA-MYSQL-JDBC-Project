drop database ecom;
create database ecom;
use ecom;

-- Admin table
create table admin(email varchar(20),password varchar(20));
desc admin;
 -- Admin detail
 insert into admin(email,password) values('akash@gmail.com','akash');
 select * from admin;
 
 -- User table
 create table user(id int not null primary key auto_increment,name varchar(20),email varchar(20) unique not null,password varchar(20) not null,mobile numeric);
 desc user;
 select * from user;
 
 -- product table
 create table product(id int not null primary key auto_increment,name varchar(20),price numeric);
  desc product;
 select * from product;
