use slaughterhouse;

select * from product;

insert into product (Name, Description)
values ('Smakocinka', 'Je to vnorme tento product, real bussin');


insert into product (Name, Description)
values ('Nic moc produkt', 'Je to vnorme tento product, real bussin');

insert into product (Name, Description)
values ('Este horsi produkt', 'Je to vnorme tento product, real bussin');


insert into farm (Name, Description)
values ('Noice farm', 'Just a smol ol farm');

insert into animaltype (Name, Description)
values ('Pig', 'Chunky boi'), ('Cow', 'Oh boy she coming');

insert into animal (Weight, IsOk, FarmId, AnimalTypeId)
values (200, true, 1, 1), (500, true, 1, 2);

insert into animalpart (Weight, AnimalId, ProductId)
values (30, 1, 1), (20, 1, 1), (60, 2, 2);


insert into animalpart (Weight, AnimalId, ProductId)
values (60, 1, 2);


select * from animalpart;

select * from product
where Id in (
    select distinct ProductId
    from animalpart
    where AnimalId = 1);



select * from animal;

select * from animalpart;

insert into animalpart (Weight, AnimalId, ProductId)
values (40, 2, 1);

select * from product
where Id = 1;