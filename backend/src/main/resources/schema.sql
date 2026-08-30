CREATE TABLE Banda(
    idBanda INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL
);

CREATE TABLE Genero(
    idGenero INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL
);

CREATE TABLE Cadastro(
    idCadastro INT PRIMARY KEY AUTO_INCREMENT,
    fkBanda INT,
    fkGenero INT,
    nomeCompleto VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    dtNascimento DATE NOT NULL,
    senha VARCHAR(100) NOT NULL,
    FOREIGN KEY (fkBanda) REFERENCES Banda(idBanda),
    FOREIGN KEY (fkGenero) REFERENCES Genero(idGenero)
);

CREATE TABLE Quiz(
                     idQuiz INT PRIMARY KEY AUTO_INCREMENT,
                     p1 CHAR(1) NOT NULL,
                     p2 CHAR(1) NOT NULL,
                     p3 CHAR(1) NOT NULL,
                     p4 CHAR(1) NOT NULL,
                     p5 CHAR(1) NOT NULL,
                     p6 CHAR(1) NOT NULL,
                     p7 CHAR(1) NOT NULL
);


CREATE TABLE ResultadosQuiz(
                               idResultado INT AUTO_INCREMENT,
                               fkCadastro INT,
                               fkQuiz INT,
                               resultado varchar(45) NOT NULL,
                               dtResultado TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                               PRIMARY KEY(idResultado, fkCadastro, fkQuiz),
                               FOREIGN KEY (fkCadastro) REFERENCES Cadastro(idCadastro),
                               FOREIGN KEY (fkQuiz) REFERENCES Quiz(idQuiz)
);

INSERT INTO Banda (nome) VALUES
                             ('Bauhaus'),
                             ('The Cure'),
                             ('Siouxsie and the Banshees'),
                             ('The Sisters of Mercy'),
                             ('Christian Death'),
                             ('Lebanon Hanover'),
                             ('She Past Away'),
                             ('Pink Turns Blue'),
                             ('Twin Tribes'),
                             ('Ultra Sunn'),
                             ('London After Midnight'),
                             ('She Wants Revenge'),
                             ('His Infernal Majesty (HIM)');

INSERT INTO Genero (nome) VALUES
                              ('Gothic Rock'),
                              ('Post-Punk'),
                              ('Darkwave'),
                              ('Coldwave'),
                              ('Industrial'),
                              ('Deathrock'),
                              ('EBM (Electronic Body Music)'),
                              ('Gothic Metal / Love Metal');