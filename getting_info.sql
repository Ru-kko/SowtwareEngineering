-- showcases store

create database if not exists showcases;

use showcases;

create table if not exists showcases(
    id int not null primary key auto_increment,
    `weight` int not null,
    height int not null,
    price int not null,
    case_type varchar(10) not null  
);
alter table showcases add case_shape varchar(10) not null default "round";


create table if not exists `provider`(
    id int not null primary key auto_increment,
    material varchar(50)
);

create table if not exists customer(
    id int not null primary key auto_increment,
    name varchar(50)
);


create table if not exists orders(
    id int not null primary key auto_increment,
    customer_id int not null,
    constraint customer_id FOREIGN key(customer_id) REFERENCES customer(id) 
);

create table if not exists order_content(
    order_id int not null,
    showcase_id int not null, 
    `count` int not null,
    constraint order_id FOREIGN Key(order_id) REFERENCES orders(id),
    constraint showcase_id FOREIGN Key(showcase_id) REFERENCES showcases(id),
    primary key(order_id, showcase_id)
);

/*   Inserting Data  */


-- insert showcases

insert into showcases (`weight`, height, price, case_type, id) Values
    (120, 50, 250000, "gas", 1),
    (120, 50, 180000, "resistence", 2),
    (120, 50, 200000, "led", 3),
    (70, 50, 145000, "resistemce", 4),
    (70, 50, 175000, "led", 5),
    (70, 50, 200000, "gas", 6);

insert into showcases (`weight`, height, price, case_type,case_shape, id) Values
    (120, 50, 250000, "gas", "squared", 7),
    (120, 50, 180000, "resistence", "squared" , 8),
    (120, 50, 200000, "led", "squared" , 9),
    (70, 50, 145000, "resistemce", "squared", 10),
    (70, 50, 175000, "led","squared", 11),
    (70, 50, 200000, "gas", "squared", 12);

-- Inserting providers

insert into `provider` (material) Values 
    ("glass"),
    ("steel"),
    ("pipe"),
    ("cable");

-- Inserting customers // No conosco ni uno

insert into customer (name) Values
    ("pepe"), -- id 1
    ("juan"), -- id 2
    ("diana"); -- id 3

-- Inserting orders 

insert into orders (id, customer_id) Values
    (101, 1),
    (254, 1),
    (512, 2);

-- inserting order content

insert into order_content(order_id, showcase_id, `count`) Values
    (101, 2, 20),
    (254, 4, 20),
    (512, 1, 1);