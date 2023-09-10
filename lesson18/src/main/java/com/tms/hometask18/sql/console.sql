create table students (
      id int primary key,
      login varchar,
      isMan boolean,
      city_name varchar constraint fk_cities references cities (name)
      on delete set null
);
drop table students;

create table cities (
    name varchar primary key
);
drop table cities cascade;
insert into cities (name) VALUES ('Grodno'),
                                 ('Mogilev'),
                                 ('Minsk'),
                                 ('Vitebsk');

insert into students (id, login, isMan, city_name) VALUES (1, 'student1', true, 'Minsk'),
                                                          (2, 'student2', true, 'Minsk'),
                                                          (3, 'student3', false, 'Grodno'),
                                                          (4, 'student4', true, 'Mogilev'),
                                                          (5, 'student5', false, 'Vitebsk'),
                                                          (6, 'student6', true, 'Minsk'),
                                                          (7, 'student7', false, 'Vitebsk'),
                                                          (8, 'student8', false, 'Grodno');