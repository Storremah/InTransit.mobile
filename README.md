<!DOCTYPE html>
<head>
    <h1>Projeto-Intransit-de-Back-Mobile</h1>
    <h2>Tema: Figma, Modelagens UML e Pacote Json </h2>
    <p>O Intransit é um aplicativo que tem a finalidade de ajudar alunos a se locomoverem da instituição de ensino que estudam, para a sua casa e vice-versa. Ele permite que o aluno saiba onde o seu transporte está em tempo real e possibilita que ele mantenha contato com os estudantes que já estão dentro do veículo. Além de transportar os alunos, esse aplicativo tem por objetivo aproximá-lo do mundo acadêmico, pois, um dos fatores que resultam altas taxas de evasão nas universidades é o difícil acesso e a precária locomoção. Assim, visando resolver essa problemática e permitir que mais pessoas tenham acesso a um Ensino superior de qualidade, nós desenvolvemos esse aplicativo mobile.</p>
</head>
<body>
    <p>Este projeto foi desenvolvido para aplicação mobile, onde tivemos contato com várias ferramentas para 
        construção do projeto como: Figma, Diagrams.net, Intellij, Notepad++, VSCode e Android Studio.</p>
        
 <h1>Membros</h1>
 <ul>
       <li><strong>Gustavo dos Santos Oliveira</strong> - Matrícula: 01538489</strong></li>
       <li><strong>Hagassi Abrahão Gomes dos Santos</strong> - Matrícula: 01560411</strong></li>
       <li><strong>José Augusto de Oliveira Abreu</strong> - Matrícula: 01558864</strong></li>
       <li><strong>Maria Conceição Torres da Silva Alves</strong> - Matrícula: 01145991</strong></li>
       <li><strong>Willams Ramos da Silva</strong> - Matrícula: 01353101</strong></li>
 </ul>
        
 <h2>Etapas da construção do projeto</h2>
        <ul>
            <li>Definição de Telas no papel</li>
            <li>Definição de funcionalidades</li>
            <li>Design das telas no Figma</li>
            <li>Criação do diagrama uml</li>
            <li>Criação da documentação</li>
            <li>Definição de atividades</li>
        </ul>
       
  <h2>Ferramentas utilizadas</h2>
        <ul>
            <li>Papel oficio</li>
            <li>Figma</li>
            <li>Intellij</li>
            <li>VsCode</li>
            <li>Notepad++</li>
            <li>Draw.io</li>
            <li>Android Studio</li>
        </ul>
<h2>Relação de Caso de Uso</h2>
<h3>Aluno/Usuário</h3>
  <li><h4> Realizar cadastro do aluno</h4></li>
  <p> Na tela de cadastro, o aluno que faz parte de um instituição de ensino se cadastra nesse aplicativo, onde ele pode ver os motoristas que fazem rotas na sua localidade para leva-lo ate a instituição.</p>
  <li><h4> Realizar login do aluno </h4></li>
  <p> Na tela de login o aluno ira efetuar seu login atraves de user e senha(gerada pela instituição), para acessar o corpo do aplicativo, e usufruir do mesmo.</p>
  <li><h4> Identificar localização do aluno</h4></li>
  <p> Na tela de localidade, ira mostrar a localização exata do aluno por meio do seu endereço. E nisso o motorista com a rota nessa área irá busca-lo, sem atrapalhar sua rota.</p>
    
  <h1>Projeto Figma</h1>
  <p>No périodo anterior fizemos o uso do Figma para a modelagem do designer do nosso projeto em outra disciplína, deste modo conseguimos criar algo mais próximo do que temos como ideal do visual final do aplicativo.</p>
  
  <h2>Imagens das telas de cadastro e navegação do aluno</h2>
  
  <img>![completo](https://user-images.githubusercontent.com/113267971/232251698-823a690e-d059-4ef1-903f-314f755462ed.png)</img>
 
  
  <h2>Fontes</h2>
  
 <img>![Imagem do WhatsApp de 2023-04-10 à(s) 20 48 09](https://user-images.githubusercontent.com/111431438/231023353-889b8200-1207-496f-a2c0-54fd5665166e.jpg)
</img>

  <h2>Cores</h2>
  
  <img>![cores](https://user-images.githubusercontent.com/113267971/232250497-fa396608-3f39-45b8-8d77-e8a9085ebb79.png)</img>
    
   <h2>Diagrama-UML</h2>

<img>![uml projeto](https://user-images.githubusercontent.com/111474763/231048215-711a17e4-b784-4736-bc1c-8f23ce63a091.png)</img>

<h1>JSON</h1>

<p><h3>Funcionalidade:</h3> _Login_

Requisição:
Método: POST
Endpoint:/ _login_ </p>

**Parâmetros**

username: string contendo o nome de usuário ou matrícula
password: string contendo a senha do usuário

![Screenshot_1](https://user-images.githubusercontent.com/111620570/232322977-1c56e994-bd13-4d32-bfca-13b404d94728.png)

**Resposta**

Status Code: 200 OK

![image](https://user-images.githubusercontent.com/111620570/232323026-22423767-bd34-4754-bbd5-2a81155d1c16.png)

Status Code: 401 Unauthorized

![image](https://user-images.githubusercontent.com/111620570/232323065-78dbb1b5-d509-4354-b7a3-00b8958f6042.png)

<p>h3>Funcionalidade:</h3> _Localização em Tempo Real_

Requisição:
Método: GET
Endpoint: / _localizacao_ </p>

**Parâmetros**

token: string contendo o token de autenticação do usuário
Resposta:
Status Code: 200 OK

![image](https://user-images.githubusercontent.com/111620570/232323140-80cbc029-4fab-4240-8bad-932a3c3f7409.png)

<p><h3>Funcionalidade:</h3> _Check-in Embarque_

Requisição:
Método: POST
Endpoint: / _embarque_ </p>

**Parâmetros**

token: string contendo o token de autenticação do usuário

**Resposta**

Status Code: 200 OK

![image](https://user-images.githubusercontent.com/111620570/232323323-21482248-8f1b-4e57-88ec-ab63e5f4e542.png)

<h3>Funcionalidade:</h3> _Check-in Desembarque_
Requisição:
Método: POST
Endpoint: / _desembarque_

**Parâmetros**

token: string contendo o token de autenticação do usuário

**Resposta**

Status Code: 200 OK

![image](https://user-images.githubusercontent.com/111620570/232323450-c7fc3f51-9d61-4bc6-98cc-d18931908294.png)

<h3>Funcionalidade:</h3> _Histórico de Viagens_
Requisição:
Método: GET
Endpoint: / _historico_

**Parâmetros**

token: string contendo o token de autenticação do usuário,

**Resposta**

Status Code: 200 OK

![image](https://user-images.githubusercontent.com/111620570/232323577-34a13f18-eb83-4a93-9b41-f0c0005f6394.png)

<h3>Funcionalidade:</h3> _Chat da Rota_
Requisição:
Método: GET
Endpoint: / _chat_

**Parâmetros**

token: string contendo o token de autenticação do usuário

**Resposta**

Status Code: 200 OK

![image](https://user-images.githubusercontent.com/111620570/232323617-23cc9cf1-b491-4e51-8458-09bc2b95e714.png)

<h3>Funcionalidade:</h3> _Cadastro_
Requisição:
Método: POST
Endpoint: / _cadastro_

**Parâmetros**

nome: string contendo o nome completo do usuário
matricula: string contendo a matrícula do usuário
rg: string contendo o RG do usuário
telefone: string contendo o número de telefone do usuário
cep: string contendo o CEP do usuário
logradouro: string contendo o endereço do usuário
complemento: string contendo o complemento do endereço do usuário
instituicao: string contendo o nome da instituição de ensino do usuário
codigo_rota:string contendo o código da rota do usuário
senha: string contendo a senha do usuário
confirmar_senha: string contendo a confirmação da senha do usuário

![image](https://user-images.githubusercontent.com/111620570/232323718-439b718d-bdd9-47c3-9b75-5dc7c8e0b0ef.png)

**Respostas**

200 OK: retorno bem-sucedido, retorna uma mensagem de sucesso

![image](https://user-images.githubusercontent.com/111620570/232323764-b9630c04-a269-4375-9773-ef7a38461adc.png)

400 Bad Request: erro nos parâmetros enviados

![image](https://user-images.githubusercontent.com/111620570/232323819-df2d918f-c1be-463b-b854-840b11d08824.png)

401 Unauthorized: usuário não autorizado

![image](https://user-images.githubusercontent.com/111620570/232323835-cbaa104b-072d-4af8-bfc9-901acca64383.png)


</body>
</html>
