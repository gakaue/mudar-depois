Create TABLE cliente(
    id int not null primary key auto_increment,
    nome varchar(100),
    endereco varchar(120),
    numero varchar(50),
    bairro varchar(80),
    id_municipio int not null,
    telefone varchar(30),
    celular varchar(30)
);

alter table cliente add constraint fk_cliente_municipio foreign key id_municipio references municipio(id);
alter table lancamento add constraint fk_lancamento_cliente foreign key id_cliente references cliente(id);

