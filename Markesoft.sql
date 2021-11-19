Create  database Marketsoft;
use Marketsoft;
## Criando tabela Cliente
CREATE TABLE Cliente (
    Email varchar(50) PRIMARY KEY,
    Nome varchar(50) not null,
    senha varchar(25) not null
);
select * from Cliente;

delete from cliente where email = null;

## Criando  tabela Forma_Pagamento
CREATE TABLE Forma_pagamento (
    Id_Forma_Pagto integer auto_increment PRIMARY KEY,
    Descricao VARCHAR(50)
);
select* from Forma_Pagamento;

## Criando tabela Produto
CREATE TABLE Produto (
    Id_Produto integer auto_increment PRIMARY KEY,
    Descricao varchar(50),
    Preco_Venda float(10,2),
    Quant_Estoque float(12,3),
    Validade DATE
);
select * from Produto;

## Criando tabela pedido
CREATE TABLE Pedido (
    Id_Pedido integer auto_increment PRIMARY KEY,
    Data DATE,
    Valor float(10,2),
    Hora time,
    Status varchar(15),
    cliente_Email varchar(50)
);
drop table Pedido;

select * from Pedido;
#EXCLUINDO TABELA PEDIDO
drop table Pedido;
alter table Pedido drop foreign key FK_Pedido_2;
 
select * from Pedido where Status like 'CANCELADO';
select * from pedido;
desc Pedido;



## Criando tabela Item Pedido
CREATE TABLE Item_Pedido (
    Id_Item integer primary key,
    produto_Id_Produto  integer,
    pedido_Id_Pedido integer,
    Quantidade float(12,3),
    Preco_unit float(10,2)
);
select * from Item_Pedido;

delete  from item_Pedido;

#EXCLUINDO TABELA ITEM PEDIDO
drop table Item_Pedido;

alter table Item_Pedido drop foreign key FK_Item_Pedido_1;
alter table Item_Pedido drop foreign key FK_Item_Pedido_2;



## Criando tabela Pagamento_Pedido
CREATE TABLE Pagamento_Pedido (
	Id_Pagamento_Pedido integer auto_increment PRIMARY KEY,
	forma_pagamento_Id_Forma_Pagto integer,
    pedido_Id_Pedido integer,
    Valor FLOAT(10,2)
);

select * from Pagamento_Pedido;
delete from Pagamento_Pedido;
#EXCLUINDO TABELA Pagamento_Pedido
Drop Table Pagamento_Pedido;

alter table Possui drop foreign key FK_Possui_1;
alter table Possui drop foreign key FK_Possui_2;


select * from Possui;
desc Possui;
 
ALTER TABLE Pedido ADD CONSTRAINT FK_Pedido_2
    FOREIGN KEY (cliente_Email)
    REFERENCES Cliente (Email)
    ON DELETE CASCADE;
    
  
 
ALTER TABLE Item_Pedido ADD CONSTRAINT FK_Item_Pedido_1
    FOREIGN KEY (produto_Id_Produto)
    REFERENCES Produto (Id_Produto)
    ON DELETE RESTRICT;
 
ALTER TABLE Item_Pedido ADD CONSTRAINT FK_Item_Pedido_2
    FOREIGN KEY (pedido_Id_Pedido)
    REFERENCES Pedido (Id_Pedido)
    ON DELETE SET NULL;
 
ALTER TABLE Pagamento_Pedido ADD CONSTRAINT FK_Pagamento_Pedido_1
    FOREIGN KEY (forma_pagamento_Id_Forma_Pagto)
    REFERENCES Forma_pagamento (Id_Forma_Pagto)
    ON DELETE RESTRICT;
 
ALTER TABLE Pagamento_Pedido ADD CONSTRAINT FK_Pagamento_Pedido_2
    FOREIGN KEY ( pedido_Id_Pedido)
    REFERENCES Pedido (Id_Pedido)
    ON DELETE SET NULL;

alter table Pagamento_Pedido drop  foreign key FK_Pagamento_Pedido_2;   

  /*  ##Inserindo Dados na tabela Cliente
INSERT INTO `Cliente` (`Nome`,`Email`,`senha`) VALUES ("Noelle Christensen","vel.est@MorbimetusVivamus.org","123fer"),("Indigo Holloway","esdras.Proin@Quisqueornare.com","321esd"),("Chester Evans","adipiscing.lacus@fringilla.edu","eget"),("Seth Odonnell","nec.mauris.blandit@rutrum.ca","laoreet"),("Connor Britt","nec@Pelentesqueultries.co.uk","Aenean"),("Eric Bird","nisl.Maecenas.malesuada@feugiatmetussit.ca","augue,"),("August Dennis","elit.sed.consequat@vestibulum.org","Donec"),("Vernon Morrison","quam@Fuscedolorquam.edu","in"),("Juliet Glenn","at@eget.org","in"),("Jena Strickland","vestibulum.neque.sed@egestasSed.co.uk","non,");

##Inserindo Dados na tabaela Forma_Pagamento
INSERT INTO `Forma_pagamento` (`Descricao`) VALUES ("Cartão de crédito"),("PIX"),("Cartão de crédito"),("À vista"),("À vista"),("PIX"),("À vista"),("Cartão de crédito"),("PIX"),("Cartão de débito");

##Inserindo dados na tabela produto
INSERT INTO `Produto` (`Descricao`,`Preco_Venda`,`Quant_Estoque`,`Validade`) VALUES ("Pacote de Bolachas Integral.","3.50",19,"21/12/22"),("Pacote de Bolachas Tradicional","3.25",14,"22/08/10"),("Biscoito Maizena","3.00",21,"21/10/22"),("Macarrão","2.75",23,"22/11/01"),("Arroz","5.35",14,"22/12/17"),("Saco de Lete 250g","3.35",16,"22/01/11"),("Sucrilos 750g","10.25",9,"22/01/07"),("Nescau lata 350g.","8.49",5,"21/12/26"),("Farofa Yoki 500g","10.00",9,"22/03/29"),("Nescau","10.45",24,"23/01/05");
 
## Inserindo Dados na Tabela Pedido
INSERT INTO `Pedido` (`Data`,`Valor`,`Hora`,`Status`,`cliente_Id_cliente`) VALUES ("21/07/22","7.00","15:30","RECEBIDO",8),("21/05/17","10.25","16:30","AGENDADO",5),("20/03/11","16.95","17:00","AGENDADO",2),("21/03/22","6.50","10:00","RECEBIDO",7),("21/11/03","9.00","19:00","CANCELADO",6),("21/12/28","13.60","9:30","AGENDADO",7),("21/04/13","9.75","17:30","RECEBIDO",4),("20/10/15","9.25","18:30","AGENDADO",9),("20/11/12","10.00","11:00","RECEBIDO",1),("21/04/23","27.40","14:30","CANCELADO",3);

## Inserindo dados na tabela Item_Pedido
insert into `Item_Pedido` (`Id_Produto`,`Id_Pedido`,`Quantidade`,`Preco_unit`) values(31,1,2.0,3.50),(37,2,1.0,10.25),(37,3,1.0,10.25),(36,3,2.0,3.35),(32,4,1.0,3.25),(36,1,1.0,3.35),(37,6,1.0,10.25),(36,1,1.0,3.35),(33,5,3.0,3.00),(31,7,2.0,3.50),(34,7,1.0,2.75),(33,8,2.0,3.00),(32,8,1.0,3.25),(39,9,1.0,10.00),(40,10,1.0,10.45),(37,10,1.0,10.25),(36,10,2.0,3.35);

##Inserindo Dados na tabela possui
INSERT INTO `Possui` (`Id_Forma_Pagto`,`Id_Pedido`,`Valor`) VALUES (1,5,"7.00"),(2,4,"10.25"),(3,3,"16.95"),(4,2,"6.50"),(5,1,"9.00"),(6,6,"13.60"),(7,8,"9.75"),(8,7,"9.25"),(9,10,"10.00"),(10,9,"27.40");

##Alterando tabela Produtos
alter table Produto add Categoria varchar(50) after Descricao;
##Inserindo dados no campo categoria
insert into `Produto`(`Categoria`) Values ("Bolachas"),("Bolachas"),("Biscoitos"),("Macarrão"),("Arroz"),("Bolachas"),("Leite"),("Cereal"),("Chocolate"),("Farofa"),("Chocolate");
delete from Produto where Id_Produto > 40;
update Produto set Categoria = "Bolachas" where Id_Produto = 32;
update Produto set Categoria = "Biscoitos" where Id_Produto = 33;
update Produto set Categoria = "Macarrão" where Id_Produto = 34;
update Produto set Categoria = "Arroz" where Id_Produto = 35;
update Produto set Categoria = "Leite" where Id_Produto = 36;
update Produto set Categoria = "Cereal" where Id_Produto = 37;
update Produto set Categoria = "Achocolatado" where Id_Produto = 38;
update Produto set Categoria = "Farofa" where Id_Produto = 39;
update Produto set Categoria = "Achocolatado" where Id_Produto = 40;

##Vendo informações de todos os usuários
Select * from Cliente;

Select nome from Cliente where id_Cliente = 4;
## Verificando informações do cliente de Id =1
Select * from Cliente where Id_Cliente between 1 and 5;

##Informações sobre a tabela Forma_Pagamento;
select * from Forma_pagamento where Descricao like 'Cartão de Crédito';

##Informações sobre os produtos;
Select * from Produto;

select * from Pedido;

##Selecionando produtos pela categoria
Select * from Produto where Categoria Like("Bolachas");

##Itém com vencimento os que estão próximos de vencer
Select * from Produto where Validade <'2021/09/22';

select * from Forma_Pagamento;
## Verificando os pedidos que foram cancelados
select * from Pedido where Status like 'CANCELADO';
select * from pedido;

##Verificando todos os itens
select * from Item_pedido;
##Verifiicando os itens da categoria Bolachas
Select * from Produto where categoria = "Bolachas";
## Verificando itens da tabela possui
select * from Possui;

##Pesquisando item por categoria
Select * from Produto where Categoria Like("Bolachas");

##Informações Gerais de um pedido 
Select T.Id_Cliente,I.Id_Pedido,T.Valor,P.Id_Produto,P.Descricao,P.Categoria,I.Quantidade,I.Preco_Unit,P.Validade,T.Data,T.Hora, T.Status,F.Id_Forma_Pagto,F.Descricao from Item_Pedido as I 
Inner join Produto as P
on I.Id_Produto = P.Id_Produto
inner join Pedido as T
on I.Id_Pedido = T.Id_Pedido
inner join Possui as O
on O.Id_Pedido = I.Id_Pedido
inner join Forma_pagamento as F
on F.Id_Forma_Pagto = O.Id_Forma_Pagto
 where T.Id_Pedido = 3;




    
    