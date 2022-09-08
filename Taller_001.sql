create table person(
    Name Varchar(24) NOT NULL,
    Age Int,
    Bridh_date Date
)

insert Into person(Name, Age, Bridh_date) Values
    ("Pepe", 18, "2004-02-08"),
    ("Juan", 20, "2000-03-18"),
    ("Andres", 19, "2003-05-12"),
    ("Alfred", 20, "2002-06-01"),
    ("Raul", 21, "2001-08-20"),
    ("Sebastian", 23, "1999-05-15"),
    ("Laura", 17, "2004-10-30"),
    ("Julian", 21, "2000-12-15"),
    ("Carolina", 22, "1999-11-22"),
    ("Diana", 23, "1999-02-08")

Select * from person;

create table person_2(
    Name Varchar(25) Not Null,
    Surname Varchar(25),
    Email Varchar(255)
)

insert Into person_2(Name, Surname, email) Values
    ("Pepe", "Morales", "pepe1234@hotmail.com"),
    ("Juan", "Martinez", "juanes24@gmail.com"),
    ("Andres", "Rios", "riosan@hotmail.com"),
    ("Alfred", "Vera", "vrease@gmail.com"),
    ("Raul", "Reyes", "reiul@hotmail.com"),
    ("Sebastian", "Galeano", "gseb124@hotmail.com"),
    ("Laura", "Gonzales", "laus24@hotmail.com"),
    ("Julian", "Rosales", "julros@gmail.com"),
    ("Carolina", "Rodrigez", "RodCarol@hotmail.com"),
    ("Diana", "Quevedo", "quevdian99@hotmail.com");

Select * from person_2;