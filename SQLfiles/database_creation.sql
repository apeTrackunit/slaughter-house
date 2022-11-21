create database slaughterhouse;
use slaughterhouse;

create table farm(
                     Id int auto_increment,
                     Name varchar(30) not null,
                     Description text,
                     primary key (Id)
);

create table animal_type(
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
                       foreign key (FarmId) references farm(Id),
                       foreign key (AnimalTypeId) references animal_type(Id)
);

create table animal_part_type(
                                 Id int auto_increment,
                                 Name varchar(30) not null,
                                 Description text,
                                 primary key (Id)
);

create table tray(
                     Id int auto_increment,
                     MaxWeight int not null,
                     Description text,
                     AnimalPartTypeId int,
                     primary key (Id),
                     foreign key (AnimalPartTypeId) references animal_part_type(Id)
);

create table store(
                      Id int auto_increment,
                      Name varchar(40),
                      Location tinytext,
                      Description tinytext,
                      primary key (Id)
);

create table product(
                        Id int auto_increment,
                        Name varchar(30) not null,
                        Description text,
                        StoreId int,
                        primary key (Id),
                        foreign key (StoreId) references store(Id)
);

create table animal_part(
                            Id int auto_increment,
                            Weight int not null,
                            AnimalId int not null,
                            ProductId int not null,
                            TrayId int,
                            primary key (Id),
                            foreign key (TrayId) references Tray(Id),
                            foreign key (AnimalId) references animal(Id),
                            foreign key (ProductId) references product(Id)
);


select * from product;

insert into product (Name, Description)
values ('Smakocinka', 'Je to vnorme tento product, real bussin');


insert into product (Name, Description)
values ('Nic moc produkt', 'Je to vnorme tento product, real bussin');

insert into product (Name, Description)
values ('Este horsi produkt', 'Je to vnorme tento product, real bussin');


insert into farm (Name, Description)
values ('Noice farm', 'Just a smol ol farm');

insert into animal_type (Name, Description)
values ('Pig', 'Chunky boi'), ('Cow', 'Oh boy she coming');

insert into animal (Weight, IsOk, FarmId, AnimalTypeId)
values (200, true, 1, 1), (500, true, 1, 2);

insert into animal_part (Weight, AnimalId, ProductId)
values (30, 1, 1), (20, 1, 1), (60, 2, 2);


insert into animal_part (Weight, AnimalId, ProductId)
values (60, 1, 2);


select * from animal_part;

select * from product
where Id in (
    select distinct ProductId
    from animal_part
    where AnimalId = 1);



select * from animal;

select * from animal_part;

insert into animal_part (Weight, AnimalId, ProductId)
values (40, 2, 1);

select * from product
where Id = 1;

# fill:
# animal_part_type, store, tray

insert into animal_part_type (Name, Description)
values ('svieckova', 'hmmmmmmmmmmmmmmmmmmmm');

insert into store (Name, Location, Description)
values ('Vecierka', 'Terchova', 'Alko, nealko, cigarety, nanuky, sladkosti, kusovky nepredavame!!!!');

insert into tray (MaxWeight, Description, AnimalPartTypeId)
values (500, 'Slape dobre', 1);

select * from animal_part_type;
select * from store;
select * from tray;
