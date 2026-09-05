# A-Little-Piece-Of-My-Soul-Reimagined<br>

<img width="1254" height="1254" alt="logo" src="https://github.com/user-attachments/assets/9d758f9d-9aa6-44f7-896f-aceb9c9acdf5" />


<h1>Projeto Individual de Pesquisa e Inovação</h1>
<h2>Desenvolvido com muito carinho por: Diego Henrique de Novais Menegaldo</h2>
<h3>Curso: Ciência da Computação - São Paulo Tech School</h3>
<h4>Tema: Subcultura Gótica</h4>

Projeto Individual de Pesquisa e Inovação, com tema livre.<br>

<h1>COMO EXECUTAR O PROJETO?</h1>
<h2>Pré-Requisitos:</h2>
1- Ter a extensão "Live Server" instalada em seu VSCode:
<img width="907" height="186" alt="image" src="https://github.com/user-attachments/assets/21dbc64c-3ca3-4bb7-bea0-14d1f6d3deb0" />

2- Configurar o CORS no Backend, caso não esteja, por se tratar de uma aplicação local, pode ocorrer conflito de portas:
<img width="290" height="89" alt="image" src="https://github.com/user-attachments/assets/a9dcedbf-532f-4aa7-9dbb-f28bec122611" />

<h2>Execute a classe "GothicApplication" no Java:</h2>
<img width="395" height="79" alt="image" src="https://github.com/user-attachments/assets/27daad9b-4ed6-4816-bcab-d84c4dc9e39a" />

<h2>Clique em "Go Live" no VSCcode:</h2>
<img width="446" height="184" alt="image" src="https://github.com/user-attachments/assets/02a293a0-6624-42bb-b30b-de8b5f59ebd8" />

<h3>Agora é só testar, se cadastrar e descobrir qual banda gótica te define!</h3>
<img width="1914" height="872" alt="image" src="https://github.com/user-attachments/assets/9b7b0b7f-c6c7-4f1b-a843-a84d36c459f8" />

<h1>EXPLICAÇÃO DOS ENDPOINTS (HÁ EXEMPLOS DE REQUISIÇÕES HTTP NO DIRETÓRIO /backend/Collections, ABRA AS NO BRUNO!)</h1>
<h2>/usuarios POST</h2>
<h3>Usado para inserir um usuário no banco de dados.</h3>

<h2>/usuarios/autenticar POST</h2>
<h3>Usado para autenticar o usuário, o verbo é POST por questões de segurança e exposição de credenciais.</h3>

<h2>/generos GET  </h2>
<h3>Cumpre premissa do projeto de que precisa carregar do banco de dados algo, nesse caso, carrega do banco os gêneros musicais góticos e plota em radio buttons no cadastro.</h3>

<h2>/bandas GET  </h2>
<h3>Cumpre premissa do projeto de que precisa carregar do banco de dados algo, nesse caso, carrega do banco as bandas góticas e plota em forma de dropdown select no cadastro.</h3>

<h2>/quizzes/inserirPerguntas POST</h2>
<h3>Insere no banco de dados as alternativas selecionadas no quiz caso o usuário esteja autenticado.</h3>

<h2>/quizzes/inserirResultados POST</h2>
<h3>Insere no banco de dados a banda resultante do quiz, ou seja, insere o id do usuário, id do quiz e qual banda, concluindo, usuário 1 quiz 1 resultou em Lebanon Hanover, por exemplo.</h3>






