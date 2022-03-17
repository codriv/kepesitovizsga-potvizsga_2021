-- CREATE SCHEMA if not exists employees DEFAULT character set UTF8 COLLATE UTF8_HUNGARIAN_CI;
-- USE employees;
CREATE TABLE orders (id BIGINT PRIMARY KEY AUTO_INCREMENT, total DOUBLE, order_date TIMESTAMP, customer_name VARCHAR(255));
INSERT INTO orders (total, order_date, customer_name) VALUES (703.6, '2021-01-22T09:23:59.829', 'Maria Lebsack');
INSERT INTO orders (total, order_date, customer_name) VALUES (1374.1, '2021-01-24T13:52:07.161', 'Gloria Hyatt');
INSERT INTO orders (total, order_date, customer_name) VALUES (1385, '2021-01-22T03:40:41.063', 'Clara Spinka');
INSERT INTO orders (total, order_date, customer_name) VALUES (747.7, '2021-01-20T21:52:58.248', 'Lonnie Stamm');
INSERT INTO orders (total, order_date, customer_name) VALUES (517.9, '2021-01-24T15:38:49.595', 'Maria Lebsack');
INSERT INTO orders (total, order_date, customer_name) VALUES (830.4, '2021-01-20T07:29:12.267', 'Lonnie Stamm');
INSERT INTO orders (total, order_date, customer_name) VALUES (967.3, '2021-01-20T12:53:27.423', 'Pat Glover');
INSERT INTO orders (total, order_date, customer_name) VALUES (931.2, '2021-01-21T07:33:14.933', 'Maria Lebsack');
INSERT INTO orders (total, order_date, customer_name) VALUES (1141.2, '2021-01-19T20:56:49.386', 'Stacy Doyle Jr.');
INSERT INTO orders (total, order_date, customer_name) VALUES (569.4, '2021-01-20T23:42:01.551', 'Lester Wyman');
INSERT INTO orders (total, order_date, customer_name) VALUES (1023.4, '2021-01-24T03:24:39.362', 'Gloria Hyatt');
INSERT INTO orders (total, order_date, customer_name) VALUES (788.7, '2021-01-21T00:49:51.610', 'Mrs. Carrie Powlowski');
INSERT INTO orders (total, order_date, customer_name) VALUES (996.5, '2021-01-19T20:53:52.471', 'Barry Pollich');
INSERT INTO orders (total, order_date, customer_name) VALUES (450.7, '2021-01-21T11:35:42.433', 'Mrs. Carrie Powlowski');