drop database if exists blogdb;
create database blogdb;
use blogdb;

create table blog(
no int primary key auto_increment,
userid varchar(255),
password varchar(255),
colum varchar(1500)
);

INSERT INTO blog(no, userid, password, colum) VALUES("1", "1", "1","testcollum1");
INSERT INTO blog(no, userid, password, colum) VALUES("2", "1", "1","testcollum2");
INSERT INTO blog(no, userid, password, colum) VALUES("3", "1", "1",null);