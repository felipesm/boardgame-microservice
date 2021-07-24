INSERT INTO user (name, password, email) VALUES ('Xanthe Tillman', '1234', 'xanthe@mail.com');
INSERT INTO user (name, password, email) VALUES ('Nicole Ratcliffe', '4567', 'nicole@mail.com');

INSERT INTO role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO user_role (id_user, id_role) VALUES (1, 1);
INSERT INTO user_role (id_user, id_role) VALUES (2, 1);
INSERT INTO user_role (id_user, id_role) VALUES (2, 2);