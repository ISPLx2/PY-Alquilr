drop database dbalquiler;

create database dbalquiler;
use dbalquiler;

create table Arrendador(
id_usu int not null auto_increment,
nombre_usu varchar(50) not null,
apellido_usu varchar(50) not null,
usuario_usu varchar(30) not null unique,
contrasena_usu varchar(30) not null,
tipo_usu varchar(30) not null,
fnac_usu date not null,
sexo_usu char(1) not null,
direccion_usu varchar(100) not null,
telefono_usu varchar(15) not null unique,
dni_usu char(8) not null unique,
email_usu varchar(50) null unique,
primary key(id_usu)
) engine= InnoDB;

create table Habitacion(
nombre_hab varchar(50) not null,
descripcion_hab varchar(50) not null,
precio_hab int not null,
tipo_hab int not null,
estado_hab int not null,
primary key (nombre_hab)
)engine= InnoDB;


create table Pagos(
id_pag int not null auto_increment,
fecha_pag date not null,
fechaVen_pag date not null,
monto_pag int not null,
estado_pag int not null,
primary key(id_pag)) engine= InnoDB;

create table Contratos(
id_cont int not null auto_increment,
dni_cont char(8)not null unique ,
descripcion_cont varchar(50) not null,
estadiaMensual_cont varchar(50) not null,
fecha_cont date not null,
monto_cont varchar(100) not null,
documentos_cont varchar(15) not null,
estado_cont varchar(2) not null,
garantia_cont varchar(10) not null,
nombre_hab varchar(50)not null,
id_pag int not null,
primary key(id_cont),
constraint id_pag foreign key(id_pag)references Pagos(id_pag),
constraint fk_nombre_hab foreign key(nombre_hab)
references Habitacion(nombre_hab)
) engine= InnoDB;


create table Alquiler(
id_alq int not null auto_increment,
fecha_alq date not null,
fechaIni_alq date not null,
estado_alq int not null,
nombre_hab varchar(50)not null,
id_pag int not null,
id_cont int not null,
primary key(id_alq), 
constraint nombre_hab foreign key(nombre_hab) references habitacion (nombre_hab),
constraint fk_id_pag foreign key(id_pag) references Pagos (id_pag),
constraint id_cont foreign key(id_cont) references Contratos (id_cont)

) engine= InnoDB;


delimiter //
create procedure spAgregarHabitacion(
in  nombre_hab varchar(50),
in descripcion_hab varchar(50),
in precio_hab int,
in tipo_hab int,
in estado_hab int )
begin
insert into Habitacion values(nombre_hab,descripcion_hab,precio_hab,tipo_hab,estado_hab);
end //

-- pa invocar this shit :v

call spAgregarHabitacion('101','habitacion grande',400,2,1);
select *from habitacion;


delimiter //
create procedure spEditarHabitacion(
in ndescripcion_hab varchar(50),
in nprecio_hab int,
in ntipo_hab int,
in nestado_hab int,
in nnombre_hab varchar(50)
)
begin

update habitacion set descripcion_hab=ndescripcion_hab,precio_hab=nprecio_hab,tipo_hab=ntipo_hab,estado_hab=nestado_hab
where nombre_hab=nnombre_hab;
end //

-- pa invocar this hsit :v x2

call spEditarHabitacion('habitacion emperradota alv',260,1,0,'101');

select *from Habitacion;


delimiter :v
create procedure spEliminarHabitacion(
in nnombre_hab varchar(50)
)
begin
delete from Habitacion where nombre_hab=nnombre_hab;
end :v

-- call spEliminarHabitacion('101');
select *from Habitacinon;


delimiter :v
create procedure spListarHabitacion()
begin
select *from Habitacion;
end :v

call spListarHabitacion();

delimiter :v 
create procedure spBuscarHabitacion(
in nnombre_hab varchar(50)
)
begin
select *from Habitacion where nombre_hab=nnombre_hab;
end :v

call spBuscarHabitacion

delimiter :v
create procedure spListarArrendador()
begin
select *from Arrendador;
end :v

call spListarArrendador

delimiter :v
create procedure spBuscarArrendador(
in nid_usu int
 )
begin 
select *from Arrendador where id_usu=nid_usu;
end :v

delimiter :v
create procedure spListarContratos()
begin
select *from Contratos;
end :v
    
delimiter :v
create procedure spBuscarContratos(
in nid_cont int
)    
begin
select *from Contratos where id_cont=nid_cont;
end :v

delimiter :v
create procedure spListarPagos()
begin
select *from Pagos;
end :v

delimiter :v
create procedure spBuscarPagos(
in nid_pago int
)
begin
select *from pagos where id_pago=nid_pago;
end :v



delimiter :v
create procedure spListarAlquiler()
begin
select alquiler.id_alq,alquiler.fecha_alq,alquiler.estado_alq,alquiler.nombre_hab,pagos.fecha_pag,pagos.id_pag,
pagos.fechaVen_pag,contratos.dni_cont,contratos.fecha_cont,contratos.fecha_cont,contratos.estado_cont
from alquiler  inner join pagos  on alquiler.id_pag=pagos.id_pag 
inner join Contratos on alquiler.id_cont=contratos.id_cont
inner join habitacion on alquiler.nombre_hab=habitacion.nombre_hab;
end :v

delimiter :v
create procedure spBuscarAlquiler(
in nid_alq int
)
begin
select *from alquiler where id_alq=nid_alg;
end :v

    
delimiter :v
create procedure spLogin(
in nusuario_usu varchar(30),
in ncontrasena_usu varchar(30),
in ntipo_usu varchar(30)
)
begin
select *from Arrendador where usuario_usu=nusuario_usu and contrasena_usu=ncontrasena_usu and tipo_usu=ntipo_usu;
end :v


delimiter :v 
create procedure spAgregarArrendador(
in nnombre_usu varchar(50),
in napellido_usu varchar(50),
in nusuario_usu varchar(30),
in ncontrasena_usu varchar(30),
in ntipo_usu varchar(30),
in nfnac_usu date,
in nsexo_usu char(1),
in ndireccion_usu varchar(100),
in ntelefono_usu varchar(15),
in ndni_usu char(8),
in nemail_usu varchar(50)
)
begin
insert into Arrendador(nombre_usu,apellido_usu,usuario_usu,contrasena_usu,tipo_usu,sexo_usu,direcion_usu,
telefono_usu,dni_usu,email_usu)
values(nnombre_usu,napellido_usu,nusuario_usu,ncontrasena_usu,nfnac_usu,nsexo_usu,ndireccion_usu,
ntelefono_usu,ndni_usu,nemail_usu);
end :v

delimiter :v
create procedure spEditarArrendador(
in nnombre_usu varchar(50),
in napellido_usu varchar(50),
in nusuario_usu varchar(30),
in ncontrasena_usu varchar(30),
in ntipo_usu varchar(30),
in nfnac_usu date,
in nsexo_usu char(1),
in ndireccion_usu varchar(100),
in ntelefono_usu varchar(15),
in ndni_usu char(8),
in nemail_usu varchar(50),
in nid_usu int
)
begin
update arrendador set nombre_usu=nnombre_usu,apellido_usu=napellido_usu,contrasena_usu=ncontrasena,
tipo_usu=ntipo_usu,fnac_usu=nfnac_usu,sexo_usu=nsexo_usu,direccion_usu=ndireccion_usu,
telefono_usu=ntelefono_usu,dni_usu=ndni_usu,email_usu=nemail_usu where id_usu=nid_usu;
end :v

delimiter :v
create procedure spEliminarArrendador(
in nid_usu int
)
begin
delete from arrendador where id_usu=nid_usu;
end :v

delimiter :v
create procedure spAgregarPagos(
in nfecha_pag date,
in nfechaVen_pag date,
in nmonto_pag int,
in nestado_pag int
)
begin
insert into Pagos(fecha_pag,fechaven_pag,monto_pag,estado_pag)
values(nfecha_pag,nfechaven_pag,nmonto_pag,nestado_pag);
end :v

delimiter :v
create procedure spEditarPagos(
in nfecha_pag date,
in nfechaVen_pag date,
in nmonto_pag int,
in nestado_pag int,
in nid_pag int
)
begin
update pagos set fecha_pag=nfecha_pag,fechaven_pag=nfechaven_pag,monto_pag=nmonto_pag,estado_pag=nestado_pag
where id_pag=nid_pag;
end :v

delimiter :v
create procedure spEliminarPagos(
in nid_pag int
)
begin
delete from pagos where id_pagnid_pag;
end :v



