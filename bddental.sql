create database BDCONSULTORDENTAL;
USE BDCONSULTORDENTAL;

create table tb_paciente(
cod int primary key not null,
nom varchar(20) not null,
apell varchar(25) not null,
edad int not null,
tele numeric not null
);

create table tb_cita(
cod varchar(20) primary key not null,
codpac int ,
fecha date,
hora time,
direecion varchar(40),
foreign key (codpac) references tb_paciente(cod));

insert tb_cita values("C001",1,'2024-01-30','10:00',"av ampliacion 542");

insert into tb_paciente values(1,"Fredo","Castillo",24,923702450);
insert into tb_paciente values(2,"Letizia","Molina",18,923702000);
insert into tb_paciente values(3,"Keyla","Barzola",18,923702451);
insert into tb_paciente values(4,"Cris","Barzola",19,923702452);
insert into tb_paciente values(5,"Luciana","Ramos",16,923702453);
insert into tb_paciente values(6,"Jairo","Condori",16,923702454);
insert into tb_paciente values(7,"Cielo","Mendosa",15,923702455);
insert into tb_paciente values(8,"Anny","Baltran",18,923702456);
insert into tb_paciente values(9,"Abigail","Rojas",16,923702457);
insert into tb_paciente values(10,"Uriel","Valladares",18,923702458);
insert into tb_paciente values(11,"Arturo","Ortega",16,923802459);
insert into tb_paciente values(12,"Karla","Castillo",14,923902450);
insert into tb_paciente values(13,"Gina","Carrasco",24,923602450);
insert into tb_paciente values(14,"Gian","Angeles",20,923502450);
insert into tb_paciente values(15,"Salma","Hernanes",21,923102450);

select *from tb_paciente;
select *from tb_cita;

select c.cod,p.nom,p.apell,p.edad,c.fecha,c.hora from tb_cita c join tb_paciente p on c.codpac=p.cod;