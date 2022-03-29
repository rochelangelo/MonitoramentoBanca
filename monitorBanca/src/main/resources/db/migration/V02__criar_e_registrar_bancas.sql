CREATE TABLE tb_banca (
	cod_banca INT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	valor_inicial DOUBLE NOT NULL,
	valor_atual DOUBLE NOT NULL,
	cod_usuario INT(20) REFERENCES tb_usuario(cod_usuario)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;