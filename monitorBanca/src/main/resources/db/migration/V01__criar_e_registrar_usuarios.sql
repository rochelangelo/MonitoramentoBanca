CREATE TABLE tb_usuario (
	cod_usuario INT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	senha VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;