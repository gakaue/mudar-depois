Create TABLE lancamento(
    id int not null primary key auto_increment,
    datalancamento date,
    id_cliente int not null,
    tipolancamento varchar(10),
    valorlancamento decimal(12,2)
);