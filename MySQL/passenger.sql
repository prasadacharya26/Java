create table passenger
(p_id int primary key not null,
p_name varchar(45),
p_contact long,
p_address varchar(45),
a_id int, foreign key(a_id) references airport_details(id));

insert into passenger values
(1,"prasad",8197192003,"udupi",2),
(2,"sanath",8197192045,"mangalore",3),
(3,"deepak",8197191197,"udupi",1),
(4,"pavan",9937192003,"udupi",2);

select * from passenger;
select * from passenger where p_id = 4;
select p_name,p_contact from passenger;
select * from passenger right join airport_details on a_id = id;

update passenger set p_address = "bangalore" where p_id = 4;

delete from passenger where p_id = 3;




