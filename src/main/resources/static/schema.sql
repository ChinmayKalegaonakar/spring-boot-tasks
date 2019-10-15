drop table if exists track;

create table track(
track_Id int auto_increment primary key,
track_Name varchar(20) not null,
track_Album varchar(20),
track_Length double(4),
track_Listens int);




