
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(150) not null,
    mensaje varchar(300) not null,
    fecha date not null,
    estatus varchar(16) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    primary key(id)

);