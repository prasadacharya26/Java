create schema Airport;

create table airport_details(id int primary key not null, name varchar(45), place varchar(45), noOfairlines int);

insert into airport_details value(1, 'Kempegowda','bangalore',10);
insert into airport_details value(2, 'Hassan','hasana',9);
insert into airport_details value(3, 'Mysuru','mysuru',10);

select * from airport_details;
select name,place from airport_details;
select * from airport_details where id = 2;
select * from airport_details group by name;

update airport_details set name = "mangalore" where id = 3;
update airport_details set name="Madras International Meenambakkam", place = "chennai" where id = 3;

delete from airport_details where id = 3;

