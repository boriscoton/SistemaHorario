create database Horario
use Horario

create table Catedraticos(
idCatedratico int not null primary key identity,
idCurso int not null,
idGrados int not null,
Nombre varchar(250),
idHorario int not null
)

drop table Catedraticos

create Table Grado(
idGrado int not null primary key identity,
Nombre varchar(250),
idSeccion int not null,

)


create table Horario(
idHorario int not null primary key identity,
Nombre varchar(250),
idEntrada int,
idSalida int
)

create table Salida(
idSalida int not null primary key identity,
HoraSalida varchar(250),

)

create table Entrada(
idEntrada int not null primary key identity,
HoraEntrada varchar(250),

)

create table Seccion(
idSeccion int not null primary key identity,
Nombre varchar(10),
idCurso int 
) 
create table Curso(
idcurso int not null primary key identity,
Nombre Varchar(250),

)

ALTER TABLE [Catedraticos] add foreign key ([idCurso]) references [Curso] ([idCurso])
ALTER TABLE [Catedraticos] add foreign key ([idGrados]) references [Grado] ([idGrado])
ALTER TABLE [Catedraticos] ADD FOREIGN KEY ([idHorario]) references [Horario] ([idHorario])
ALTER TABLE [Grado] ADD FOREIGN KEY ([idSeccion]) REFERENCES [Seccion] (idSeccion)
ALTER TABLE [Horario] ADD FOREIGN KEY ([idEntrada]) REFERENCES [Entrada] ([idEntrada])
ALTER TABLE [Horario] ADD FOREIGN KEY ([idSalida]) REFERENCES [Salida] ([idSalida])
ALTER TABLE [Seccion] ADD FOREIGN KEY ([idCurso]) REFERENCES [Curso] ([idCurso])


INSERT INTO Curso(Nombre)values ('Matematicas'),('Lenguaje'),('Ingles');}
INSERT INTO Seccion(Nombre,idCurso)values('A',1),('B',2)
INSERT INTO Grado(Nombre,idSeccion)VALUES('Tercero',2),('SEGUNDO BASICO',2)
INSERT INTO Entrada(HoraEntrada)values('11am'),('12am')
INSERT INTO Salida(HoraSalida)values('11:55am'),('12:30am')
INSERT INTO Horario(Nombre,idEntrada,idSalida)values('Tuno mañana',3,3),('turno Mañana',4,4)
INSERT INTO Catedraticos(idCurso,idGrados,Nombre,idHorario)values(1,5,'Roberto',3)


select c.Nombre, g.Nombre,cu.Nombre,s.Nombre, h.Nombre, e.HoraEntrada,sa.HoraSalida
from Catedraticos c, Grado g, Curso cu, Seccion s, Horario h, Entrada e, Salida sa
where c.idCurso=cu.idCurso and c.idGrados=g.idGrado and c.idHorario=h.idHorario and h.idEntrada=e.idEntrada and h.idSalida=sa.idSalida and
 g.idSeccion=s.idSeccion
SELECT *FROM Curso
SELECT *FROM Seccion
SELECT *FROM Grado
SELECT *FROM Entrada
SELECT *FROM Salida
SELECT *FROM Horario
select *from Catedraticoscreate table Catedraticos( idCatedratico int not null primary key identity, idCurso int not null, idGrados int not null, Nombre varchar(250), idHorario int not null )
