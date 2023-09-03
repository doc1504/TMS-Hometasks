create table persons (
                         id int primary key,
                         name varchar,
                         isMan boolean,
                         birthday date
);

create table hobby(
                      id int primary key,
                      name varchar,
                      type_id int constraint fk_type references type (id)
);

create table type(
                     id int primary key,
                     type varchar
);

create table person_hobby (
                              id int primary key,
                              person_id int constraint fk_person references persons (id),
                              hobby_id int constraint fk_hobby references hobby (id)
);

insert into persons (id, name, isMan, birthday) VALUES (1, 'ivan', true, '2000-04-20'),
                                                       (2, 'maria', false, '1996-09-25'),
                                                       (3, 'olya', false, '1997-07-13'),
                                                       (4, 'alex', true, '1999-04-19'),
                                                       (5, 'oleg', true, '2002-09-16'),
                                                       (6, 'viktor', true, '1987-06-24'),
                                                       (7, 'marina', false, '1990-07-24'),
                                                       (8, 'vlad', true, '1993-05-24'),
                                                       (9, 'arina', false, '2000-03-19'),
                                                       (10, 'anna', false, '1980-02-01');
insert into type (id, type) VALUES (1, 'active'),
                                   (2, 'passive');
insert into hobby (id, name, type_id) VALUES (1, 'football', 1),
                                             (2, 'jogging', 1),
                                             (3, 'reading', 2),
                                             (4, 'drawing', 2),
                                             (5, 'ski', 1),
                                             (6, 'sleeping', 2),
                                             (7, 'chess', 2),
                                             (8, 'swimming', 1);

insert into person_hobby (id, person_id, hobby_id) VALUES (1, 1, 4),
                                                          (2, 2, 5),
                                                          (3, 2, 7),
                                                          (4, 3, 1),
                                                          (5, 4, 8),
                                                          (6, 5, 7),
                                                          (7, 6, 2),
                                                          (8, 7, 3),
                                                          (9, 8, 6),
                                                          (10, 9, 8),
                                                          (11, 10, 1);
drop table persons;
drop table hobby;
drop table type;
drop table person_hobby;

select p.name, p.isMan, p.birthday, h.name from persons p join person_hobby ph on p.id = ph.person_id
                                                          join hobby h on ph.hobby_id = h.id;
select * from persons where birthday < '1999-01-01';
select isMan, count(*) from persons group by isMan;
select p.name, count(*) from persons p join person_hobby ph on p.id = ph.person_id
                                       join hobby h on ph.hobby_id = h.id
group by p.name having count(*) >1;
select type_id, count(*) from hobby group by type_id;
select hobby.name as active_hobby from hobby where type_id = 1;
select hobby.name as passive_hobby from hobby where type_id = 2;


