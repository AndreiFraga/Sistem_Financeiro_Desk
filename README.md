# Sistema de Controle Financeiro Pessoal

Este sistema tem como objetivo auxiliar as pessoas na administração de seus recursos financeiros pessoais, permitindo que elas acompanhem suas receitas, despesas e movimentações financeiras. Em síntese, o projeto busca proporcionar maior controle e conhecimento sobre a entrada e a saída de dinheiro, contribuindo para a identificação de gastos desnecessários, o planejamento financeiro, a economia de recursos e a prevenção do endividamento.

## Objetivos do Trabalho

> O objetivo deste projeto é desenvolver um sistema de controle financeiro pessoal que permita aos usuários registrar e consultar suas movimentações financeiras, facilitando o acompanhamento de receitas, despesas e saldo disponível. Dessa forma, busca-se oferecer uma ferramenta simples e prática para auxiliar na organização e no planejamento financeiro.

## Funcionalidades do Sistema
> O sistema permite que o usuário cadastre **receitas** (ganhos) e **despesas** (gastos) por meio de um formulário. Cada cadastro recebe o seu próprio **ID** (identificador) gerado automaticamente, facilitando sua identificação.

> Durante o cadastro, o usuário deve selecionar o tipo de cadastro que ele deseja fazer **(receita ou despesa)**. Além disso, o usuário também deve informar uma breve **descrição,** como **salário do mês, mercado, internet e luz**, além de fornecer o **valor** e a **data**.

> A data deve ser informada no formato **dd/MM/yyyy**, sendo **dd** a representação do dia, com dois dígitos; **MM** a representação do mês, também com dois dígitos; e **yyyy** a representação do ano, com quatro dígitos. Caso o usuário esqueça de preencher qualquer um dos campos, o programa apresentará uma mensagem de aviso, solicitando que o usuário preencha os campos que faltam.

> Após o cadastro, o usuário pode acessar uma tabela que apresenta todas as movimentações registradas anteriormente, incluindo seu **ID, tipo, descrição, valor e data**, organizadas na ordem em que foram cadastradas.

> Na parte superior da tela de consulta, também são apresentados o **total de receitas, o total de despesas e o saldo atual**, que é a diferença entre as **receitas** e as **despesas**. Dessa forma, o usuário consegue acompanhar suas movimentações e verificar o resultado de sua organização financeira.

## Tecnologias Utilizadas

> Para o desenvolvimento deste projeto, foram utilizadas as seguintes tecnologias e ferramentas:

 - **Java:** linguagem de programação utilizada para desenvolver a lógica e as funcionalidades do sistema.
 - **Apache NetBeans:** ambiente de desenvolvimento integrado (IDE) utilizado para escrever, organizar e executar o código.
 - **Git:** sistema de controle de versão utilizado para acompanhar as alterações realizadas no projeto.
 - **GitHub:** plataforma utilizada para hospedar o repositório e disponibilizar o código-fonte do projeto.

## Estrutura do Projeto (Padrão MVC)

> O projeto foi desenvolvido utilizando o padrão **MVC (Model - View - Controller)**, que organiza o código em três partes principais: **Modelo, Visão e Controlador.** Essa organização facilita a manutenção, a compreensão e a organização do sistema, separando os dados, as interfaces gráficas e as regras de funcionamento.

### Organização dos Pacotes

 - **Modelo (Model):** contém as classes responsáveis por representar e armazenar os dados utilizados pelo sistema, como as informações das movimentações financeiras e os valores das consultas.
 - **Visão (View):** contém as classes responsáveis pelas interfaces gráficas, permitindo que o usuário interaja com o sistema por meio das telas de cadastro e consulta, que podem ser acessadas através da tela inicial.
 - **Controlador (Controller):** contém as classes responsáveis por controlar as funcionalidades do sistema, realizar os cálculos, processar os dados e realizar as trocas de tela.

## Instalação do Java (JDK) e Apache NetBeans

> Para executar e caso deseje, modificar este projeto, é necessário instalar o **Java Development Kit (JDK)** e o **Apache NetBeans** em seu computador.

### Instalação do Java (JDK)

> O **JDK** é o kit de desenvolvimento do Java, necessário para compilar, desenvolver e executar aplicações nessa linguagem.

> **Para instalá-lo:**

  - **Acesse o site oficial da Oracle:** (https://www.oracle.com/br/java/technologies/downloads/).
  - Localize a seção **Java SE Development Kit 25** (JDK 25).
  - Escolha a opção correspondente ao seu sistema operacional (**Windows, macOS ou Linux**).
  - Faça o download do instalador.
  - **Execute o arquivo baixado e siga as instruções apresentadas na tela**.

### Instalação do Apache NetBeans

> Após instalar o **JDK**, podemos instalar o ambiente de desenvolvimento utilizado neste projeto.

  - **Acesse o site oficial do Apache NetBeans:** (https://netbeans.apache.org/front/main/download/).
  - Acesse a página de **downloads** e baixe a versão mais recente.
  - Escolha o pacote de instalação **compatível com seu sistema operacional**.
  - Faça o download e execute o instalador, **seguindo as instruções apresentadas na tela**.
  - Após concluir a instalação, abra o Apache NetBeans para verificar se está funcionando corretamente.

#### Observação

> Este projeto foi desenvolvido utilizando **Java 25 e Apache NetBeans**. Portanto, recomenda-se utilizar o **JDK 25** para garantir a compatibilidade com a configuração original do projeto.

## Como Baixar e Executar o Projeto

> Esta seção apresenta as etapas necessárias para baixar, abrir e executar o projeto no Apache NetBeans. São disponibilizadas duas opções para obter os arquivos: o **download direto pelo GitHub** ou a **clonagem do repositório utilizando o Git**.

### Baixando o Projeto pelo GitHub

 - Acesse o **repositório do projeto** no GitHub.
 - Clique no botão **Code** e selecione a opção **Download ZIP**.
 - Aguarde o **download** e extraia o arquivo em uma **pasta de sua preferência**.
 - Abra o **Apache NetBeans**.
 - Selecione a opção **Open Project** (Abrir Projeto), no canto **superior esquerdo**.
 - Localize a pasta extraída e **selecione o projeto**.
 - Aguarde o carregamento dos arquivos.

### Baixando o Projeto Utilizando o Git

> Outra possibilidade é **clonar** o repositório diretamente para o computador utilizando o **Git**.

 - Acesse o **repositório do projeto** no GitHub.
 - Clique no botão **Code** e copie o endereço **HTTPS** disponibilizado.
 - Localize a **pasta** em que deseja armazenar o projeto. Como exemplo, você pode utilizar a pasta **NetBeansProjects**, geralmente localizada em **Documentos**.
 - Abra a **pasta** desejada, clique com o **botão direito do mouse** em uma **área vazia** e selecione a opção **Abrir no Terminal** ou **Open in Terminal**.
 - No terminal aberto, execute o seguinte comando:

   `git clone https://github.com/AndreiFraga/Sistem_Financeiro_Desk.git`

 - Aguarde a **conclusão da clonagem**. O Git criará automaticamente uma nova pasta contendo os arquivos do projeto.
 - Abra o **Apache NetBeans**, selecione a opção **Open Project**, localizada no canto superior esquerdo, e **localize a pasta recém-criada**.
 - **Selecione o projeto e aguarde o carregamento dos arquivos**.

**Observação:** para executar essa opção, é necessário **ter o Git instalado no computador**.

### Executando o Programa

> Agora vamos aprender a fazer a execução deste sistema.

 - Com o projeto aberto no Apache NetBeans, clique no botão **Run Project** (Executar Projeto), ícone verde que está localizado na parte superior da tela. Se tiver dúvidas, **passe o mouse sobre os ícones até encontrar "Run Project"**.
 - Aguarde a **inicialização do programa**. A tela inicial do sistema será apresentada.
 - Clique no botão **Cadastrar** para acessar a tela de cadastro de movimentações financeiras.

### Realizando os Primeiros Cadastros

> Agora, com o programa rodando, vamos aprender a **cadastrar movimentações financeiras**, começando com o cadastro de uma **receita** (dinheiro que você recebeu).

 - Na tela de cadastro, selecione o tipo **Receita**.
 - Informe uma descrição, como por exemplo, **"Salário do mês"**, o seu respectivo **valor** e uma **data válida**, no formato apresentado anteriormente (**dd/MM/yyyy**).
 - Clique no botão **Salvar** para registrar a movimentação.
 - Em seguida, realize outro **cadastro**, selecionando o tipo **Despesa**.
 - Informe uma **descrição**, como por exemplo, **"Mercado"**, o respectivo **valor** e a **data**.
 - Clique novamente em **Salvar** para registrar a movimentação.
 - E **pronto**, você **acabou de concluir o seu primeiro cadastro de receita e o seu primeiro cadastro de despesa**.

### Consultando as Movimentações

> Agora que você cadastrou sua primeira receita e a sua primeira despesa, vamos aprender a **consultar esses cadastros, visualizando-os na tabela**.

 - Após realizar os cadastros, clique no botão **Consultar** para acessar a tela de consulta.
 - Verifique se as movimentações cadastradas aparecem corretamente na tabela.
 - Confira os valores apresentados na parte superior da tela, incluindo o **total de receitas, o total de despesas e o saldo atual**.
 - Caso deseje realizar novos cadastros (sejam eles de novas receitas ou de novas despesas), clique novamente no botão **Cadastrar**.

> **Observação:** os dados são armazenados de forma **temporária**, portanto, após **fechar o programa, as movimentações cadastradas serão perdidas**, sendo necessário registrá-las novamente ao iniciar o programa.

## Melhorias Futuras

> Como possibilidades de evolução do projeto, **algumas funcionalidades poderão ser desenvolvidas futuramente**, visando ampliar os **recursos disponíveis** e proporcionar uma melhor experiência ao usuário.

 - **Armazenamento Permanente de Dados:** implementar um **banco de dados** para armazenar as movimentações financeiras, permitindo que os registros sejam mantidos mesmo após o **encerramento do programa**. Atualmente, **os dados são armazenados de forma temporária** enquanto o programa está sendo executado.
 - **Edição e Exclusão de Movimentações:** permitir que o usuário **altere ou remova** registros cadastrados anteriormente.
 - **Filtros de consulta:** possibilitar a pesquisa de movimentações por **tipo** (receita ou despesa) e **data** (como por exemplo, as mais antigas e as mais recentes). 

## Autor

> Projeto desenvolvido por **Andrei**, estudante do **Terceiro Ano do curso Técnico em Informática Integrado ao Ensino Médio do Instituto Federal de Educação, Ciência e Tecnologia do Rio Grande do Sul (IFRS) – Campus Rolante**, como um trabalho avaliativo referente à disciplina de **Programação III**. 
