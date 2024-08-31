@tag
Feature: Site Kinoplex

  @tag1
  Scenario: Validacao Tela de Compra de Ingresso
    Given que eu acesse a url "https://kinoplex.com.br"
    And clique e escolha o Kinoplex Amazonas
    When fechar a tela de popup
    Then escolher data e sessao e clicar em comprar