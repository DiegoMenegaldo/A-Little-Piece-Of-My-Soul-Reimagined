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

INSERT INTO Cadastro (nomeCompleto, email, dtNascimento, senha, fkBanda, fkGenero) VALUES
    ('Larissa Iceglass', 'larissa.iceglass@lebanonhanover.com', '1988-10-18', 'Darkwave#2026!', 6, 3),
    ('Peter Murphy', 'peter.murphy@bauhaus.com', '1957-07-11', 'GothRock@1979!', 1, 1),
    ('Ville Valo', 'ville.valo@him.com', '1976-11-22', 'LoveMetal$666*', 13, 8),
    ('Andrew Eldritch', 'andrew.eldritch@sistersofmercy.com', '1959-05-15', 'TempleOfLove#87', 4, 1),
    ('Patricia Morrison', 'patricia.morrison@sisters.com', '1962-01-14', 'Lucretia@1987!', 4, 6);