# Validação Tela Compra Ingresso

Este é um projeto de automação de testes para a validação da tela de compra de ingressos do Kinoplex. O projeto é desenvolvido em Java utilizando Selenium para automação de navegadores e Cucumber para a estruturação dos testes em BDD.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação utilizada no projeto.
- **Maven**: Gerenciador de dependências e construção do projeto.
- **Selenium**: Ferramenta para automação de navegadores.
- **Cucumber**: Framework para testes BDD (Behavior Driven Development).
- **JUnit**: Framework para execução dos testes.
- **Ashot**: Biblioteca para captura de screenshots em testes automatizados.

## Estrutura do Projeto

- **src/main/java**: Contém as classes principais para automação.
  - **Elementos**: Contém todos os elementos da página utilizados na automação.
  - **Metodos**: Contém todos os métodos reutilizáveis na automação.
- **src/test/java**: Contém as classes de teste.
  - **Steps**: Contém a implementação dos passos para cada cenário de teste.
- **src/test/resources**: Contém os arquivos de configuração e as features do Cucumber.
  - **Feature**: Contém os arquivos `.feature` onde são definidos os cenários de teste.
- **driver**: Contém o `chromedriver` compatível com o navegador Chrome usado nos testes.
- **evidencias**: Diretório onde são armazenadas as evidências (prints) dos testes automatizados.

## Pré-requisitos

- **Java 21** instalado e configurado no `PATH` do sistema.
- **Maven** instalado e configurado no `PATH` do sistema.
- Navegador **Google Chrome** instalado.
- **Chromedriver** compatível com a versão do Chrome, localizado na pasta `driver`.

## Configuração do Projeto

1. **Clone o Repositório**

   
   git clone https://github.com/Luanninha/Code-Challenge-Scale-Kinoplex.git
   cd Code-Challenge-Scale-Kinoplex
