DROP TABLE IF EXISTS Category;
DROP TABLE IF EXISTS BOOK;

CREATE TABLE Category (
  id    BIGINT auto_increment PRIMARY KEY NOT NULL,
  name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE BOOK (
  id    BIGINT auto_increment PRIMARY KEY NOT NULL,
  name VARCHAR(255)              NOT NULL,
  price DOUBLE NOT NULL,
  category_id BIGINT,
    constraint FKM1T3YVW5I7OLWDF32CWUUL7TA
    foreign key (CATEGORY_ID) references Category
);