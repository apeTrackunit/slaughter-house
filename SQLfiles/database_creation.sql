create database slaughterhouse;

create table farm(
    Id int auto_increment,
    Name varchar(30) not null,
    Description text,
    primary key (Id)
);

create table AnimalType(
    Id int auto_increment,
    Name varchar(30) not null,
    Description text,
    primary key (Id)
);

create table animal(
    Id int auto_increment,
    Weight int not null,
    IsOk boolean,
    FarmId int not null,
    AnimalTypeId int not null,
    primary key (Id),
    foreign key (FarmId) references Farm(Id),
    foreign key (AnimalTypeId) references AnimalType(Id)
);

create table product(
    Id int auto_increment,
    Name varchar(30) not null,
    Description text,
    primary key (Id)
);

create table animalPart(
    Id int auto_increment,
    Weight int not null,
    AnimalId int not null,
    ProductId int not null,
    primary key (Id),
    foreign key (AnimalId) references Animal(Id),
    foreign key (ProductId) references Product(Id)
);

