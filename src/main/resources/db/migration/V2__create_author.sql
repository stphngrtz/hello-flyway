create sequence hello_flyway.s_author_id start with 1;

create table hello_flyway.author (
  id int not null,
  first_name varchar(50),
  last_name varchar(50) not null,
  date_of_birth date,
  address varchar(50),

  constraint pk_author primary key (id)
);