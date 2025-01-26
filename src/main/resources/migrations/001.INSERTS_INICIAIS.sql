create table if not exists naipe (
	id bigserial not null,
	nome varchar(32),
	caminho varchar(255) not null,
	primary key (id)
);

create table if not exists carta (
	id bigserial not null,
	valor int4,
	nome varchar(32),
	id_naipe int8 not null,
	descricao_certa TEXT,
	descricao_torta TEXT,
	primary key (id)
);

alter table carta add constraint FK000000000000000 foreign key (id_naipe) references naipe ;

insert into naipe (nome, caminho) values ('Paus','paus'),('Ouros', 'ouros'),('Espadas', 'espadas'),('Copas', 'copos'),('Arcana Maior', 'maior');

insert into carta (valor, nome, id_naipe, descricao_certa, descricao_torta) values
	(1,'Ás', (select id from naipe where caminho = 'paus'), 'É o Ás de paus, ué', 'É o Ás de paus, só que de cabeça pra baixo'),
	(1,'Ás', (select id from naipe where caminho = 'ouros'), 'É o Ás de ouros, ué', 'É o Ás de ouros, só que de cabeça pra baixo'),
	(1,'Ás', (select id from naipe where caminho = 'espadas'), 'É o Ás de espadas, ué', 'É o Ás de espadas, só que de cabeça pra baixo'),
	(1,'Ás', (select id from naipe where caminho = 'copos'), 'É o Ás de copos, ué', 'É o Ás de copos, só que de cabeça pra baixo'),
	(0,'Tolo', (select id from naipe where caminho = 'maior'), 'É muito eu', 'É um troxa mesmo')
;