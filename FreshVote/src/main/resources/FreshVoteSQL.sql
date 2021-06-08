Select * from users u
join authority a on a.user_id =u.id;


insert into users(name, password, username) value('robin', '$2y$10$G2bnd/RwFA/7rJTJx8wPQOvUJ6xmpYV1ipO0mlUIPmilXYbX2V3yW','robindhole@gmail.com');
insert into authority(authority, user_id) value ('ROLE_ADMIN', 1);
insert into authority(authority, user_id) value ('ROLE_USER', 1);

insert into users(name, password, username) value('aniket', '$2y$10$G2bnd/RwFA/7rJTJx8wPQOvUJ6xmpYV1ipO0mlUIPmilXYbX2V3yW','anike@gmail.com');
insert into authority(authority, user_id) value ('ROLE_USER', 2);