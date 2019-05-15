insert into transport_types (name) values ('bus');
insert into transport_types (name) values ('tram');

insert into lines (name, id_transport_type) values ('50', 1);
insert into lines (name, id_transport_type) values ('20', 1);
insert into lines (name, id_transport_type) values ('5', 1);
insert into lines (name, id_transport_type) values ('10', 1);
insert into lines (name, id_transport_type) values ('15', 1);
insert into lines (name, id_transport_type) values ('17', 1);

insert into drivers (name, surname, pesel) values ('Fairlie', 'Verrill', '88706374472');
insert into drivers (name, surname, pesel) values ('Kimmy', 'Weetch', '42641142916');
insert into drivers (name, surname, pesel) values ('Craig', 'Vandenhoff', '43539230476');
insert into drivers (name, surname, pesel) values ('Davy', 'Sissot', '65093658490');
insert into drivers (name, surname, pesel) values ('Bennie', 'Tighe', '46733113917');
insert into drivers (name, surname, pesel) values ('Laurice', 'Mosey', '45809753953');
insert into drivers (name, surname, pesel) values ('Robby', 'Dy', '89379946204');
insert into drivers (name, surname, pesel) values ('Micheal', 'Girdler', '53745410747');
insert into drivers (name, surname, pesel) values ('Akim', 'Pele', '68374227107');
insert into drivers (name, surname, pesel) values ('Antony', 'Gornall', '26656738920');
insert into drivers (name, surname, pesel) values ('Donaugh', 'Riggert', '56157215810');
insert into drivers (name, surname, pesel) values ('Eamon', 'Hinckley', '21717180156');
insert into drivers (name, surname, pesel) values ('Kale', 'Muzzollo', '35797842684');
insert into drivers (name, surname, pesel) values ('Jorie', 'Longthorne', '62909731414');
insert into drivers (name, surname, pesel) values ('Reba', 'Durante', '96032821790');
insert into drivers (name, surname, pesel) values ('Thomasin', 'Crassweller', '35417513094');
insert into drivers (name, surname, pesel) values ('Rheba', 'Carnock', '70301242673');
insert into drivers (name, surname, pesel) values ('Ingrid', 'Bisacre', '61171776111');
insert into drivers (name, surname, pesel) values ('Cristal', 'Gateshill', '08932072659');
insert into drivers (name, surname, pesel) values ('Gothart', 'Danforth', '87300293812');
insert into drivers (name, surname, pesel) values ('Mark', 'Swindley', '77513542810');
insert into drivers (name, surname, pesel) values ('Giordano', 'Maplethorp', '21737652720');
insert into drivers (name, surname, pesel) values ('Claus', 'Creaser', '38425360155');
insert into drivers (name, surname, pesel) values ('Lisabeth', 'Pennrington', '36824459746');
insert into drivers (name, surname, pesel) values ('Kass', 'Stokey', '65640865556');
insert into drivers (name, surname, pesel) values ('Torrance', 'Aicheson', '05783896467');
insert into drivers (name, surname, pesel) values ('Lillis', 'Cowill', '53769460654');
insert into drivers (name, surname, pesel) values ('Katie', 'Vernazza', '68561794437');
insert into drivers (name, surname, pesel) values ('Sydney', 'Peake', '82222903976');
insert into drivers (name, surname, pesel) values ('Ambrosio', 'Godsafe', '37511045449');

insert into vehicles (id_transport_type, name) values (1, '34547');
insert into vehicles (id_transport_type, name) values (2, '38ej7');
insert into vehicles (id_transport_type, name) values (1, '94d3');
insert into vehicles (id_transport_type, name) values (2, '129dx');

insert into stops (id_transport_type, name, latitude, longitude) values (1, 'A50', '20.032', '30.302');
insert into stops (id_transport_type, name, latitude, longitude) values (1, 'B50', '11.032', '55.302');
insert into stops (id_transport_type, name, latitude, longitude) values (2, 'C60', '12.032', '33.302');
insert into stops (id_transport_type, name, latitude, longitude) values (2, 'D70', '17.032', '22.302');
insert into stops (id_transport_type, name, latitude, longitude) values (1, 'N50', '19.032', '5.302');

insert into schedule (id_start_stop, id_end_stop, id_line, id_vehicle, id_driver, starts_at, ends_at) values (1, 2, 1, 1, 5, current_timestamp, current_timestamp);
insert into schedule (id_start_stop, id_end_stop, id_line, id_vehicle, id_driver, starts_at, ends_at) values (1, 2, 2, 1, 15, current_timestamp, current_timestamp);
insert into schedule (id_start_stop, id_end_stop, id_line, id_vehicle, id_driver, starts_at, ends_at) values (1, 2, 3, 1, 20, current_timestamp, current_timestamp);

insert into days_of_week (day) values ('MONDAY');
insert into days_of_week (day) values ('TUESDAY');
insert into days_of_week (day) values ('WEDNESDAY');

insert into stop_lines (id_stop, id_line, id_day_of_week, time) values (1, 2, 1, current_time);
insert into stop_lines (id_stop, id_line, id_day_of_week, time) values (2, 1, 2, current_time);
insert into stop_lines (id_stop, id_line, id_day_of_week, time) values (2, 3, 3, current_time);

insert into lines_stops (id_line, id_end_stop, position, id_stop) values (2, 1, 2, 1);
insert into lines_stops (id_line, id_end_stop, position, id_stop) values (2, 1, 3, 2);
insert into lines_stops (id_line, id_end_stop, position, id_stop) values (2, 1, 1, 3);