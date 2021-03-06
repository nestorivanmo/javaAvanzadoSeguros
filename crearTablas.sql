CREATE TABLE CLIENTE (
	id_cliente INT(3) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(40) NOT NULL,
	direccion VARCHAR(50) NOT NULL

);

CREATE TABLE FACTURA(
	id_factura INT(5) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	monto INT(15) NOT NULL
);

CREATE TABLE VEHICULO(
	id_vehiculo INT(5) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	id_factura_fk INT(5) UNSIGNED,
	placa VARCHAR(10) NOT NULL,
	modelo VARCHAR(10) NOT NULL,
	marca VARCHAR(10) NOT NULL,
	FOREIGN KEY (id_factura_fk) REFERENCES FACTURA(id_factura)
);

CREATE TABLE POLIZA (
	id_poliza INT(5) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	id_cliente_fk INT(5) UNSIGNED,
	id_vehiculo_fk INT(5) UNSIGNED,
	costoPoliza INT(10) NOT NULL,
	valorPrima INT(10) NOT NULL,
	FECHA_APERTURA DATE NOT NULL,
	FECHA_VENCIMIENOT DATE NOT NULL,
	FOREIGN KEY (id_cliente_fk) REFERENCES CLIENTE(id_cliente),
	FOREIGN KEY (id_vehiculo_fk) REFERENCES VEHICULO(id_vehiculo)
);


SELECT 
	id_cliente, 
	nombre,
	costoPoliza,
	placa,
	modelo, 
	monto
FROM 
	CLIENTE c1
		INNER JOIN 
	POLIZA p1 ON c1.id_cliente = p1.id_cliente_fk
		INNER JOIN
	VEHICULO v1 ON p1.id_vehiculo_fk = v1.id_vehiculo
		INNER JOIN
	FACTURA f1 ON v1.id_factura_fk = f1.id_factura;


