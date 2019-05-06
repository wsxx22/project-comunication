create table transport_types
(
    id   bigint primary key auto_increment,
    name varchar(20) not null
);

create table lines
(
    id                bigint primary key auto_increment,
    name              varchar(20) not null,
    id_transport_type bigint      not null,

    foreign key (id_transport_type) references transport_types (id)
);

create table drivers
(
    id      bigint primary key auto_increment,
    name    varchar(20) not null,
    surname varchar(20) not null,
    pesel   varchar(11) not null

);

create table vehicles
(
    id                bigint primary key auto_increment,
    id_transport_type bigint      not null,
    name              varchar(20) not null,

    foreign key (id_transport_type) references transport_types (id)
);

create table stops
(
    id                bigint primary key auto_increment,
    id_transport_type bigint      not null,
    name              varchar(20) not null,
    latitude          varchar(20) not null,
    longitude         varchar(20) not null,

    foreign key (id_transport_type) references transport_types (id)
);

create table schedule
(
    id            bigint primary key auto_increment,
    id_start_stop bigint    not null,
    id_end_stop   bigint    not null,
    id_line       bigint    not null,
    id_vehicle    bigint    not null,
    id_driver     bigint    not null,
    starts_at     timestamp not null,
    ends_at       timestamp not null,

    foreign key (id_start_stop) references stops (id),
    foreign key (id_end_stop) references stops (id),
    foreign key (id_line) references lines (id),
    foreign key (id_vehicle) references vehicles (id),
    foreign key (id_driver) references drivers (id)

);

create table days_of_week
(
    id  bigint auto_increment primary key,
    day varchar(20) not null
);

create table stops_schedule
(
    id             bigint primary key auto_increment,
    id_stop        bigint not null,
    id_line        bigint not null,
    id_day_of_week bigint not null,
    time           time   not null,

    foreign key (id_stop) references stops (id),
    foreign key (id_line) references lines (id),
    foreign key (id_day_of_week) references days_of_week (id)
);

create table lines_schedule
(
    id          bigint primary key auto_increment,
    id_line     bigint not null,
    id_end_stop bigint not null,
    position    int    not null,
    id_stop     bigint not null,

    foreign key (id_line) references lines (id),
    foreign key (id_end_stop) references stops (id),
    foreign key (id_stop) references stops (id)
);

