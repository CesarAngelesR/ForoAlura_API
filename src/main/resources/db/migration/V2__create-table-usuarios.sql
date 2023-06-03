
create table usuarios(

    id bigint not null auto_increment,
    usuario varchar(100) not null,
    email varchar(300) not null,
    contrasena varchar(300)not null, 

    primary key(id)
);
