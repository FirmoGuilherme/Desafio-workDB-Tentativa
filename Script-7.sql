create database desafio;
use desafio;

create table previsao_tempo(
 id              int not null auto_increment, 
 dia			TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
 cidade varchar(100),
 pais varchar(100),
 temperatura_Maxima int,
 temperatura_Minima int,
 sensacao_Termica int,
 primary key (id)
);
 

desc previsao_tempo;


select * from previsao_tempo;
insert into previsao_tempo(cidade,pais,temperatura_Maxima,temperatura_Minima,sensacao_Termica) values ("Sao paulo", "Brasil", 24, 18, 20);
SELECT CURRENT_TIMESTAMP;
drop database desafio;