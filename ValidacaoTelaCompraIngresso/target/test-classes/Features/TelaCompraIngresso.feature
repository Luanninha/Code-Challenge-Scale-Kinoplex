@tag
Feature: Site Kinoplex

  @tag1
  Scenario: Validacao Tela de Compra de Ingresso
    Given que eu acesse a url "https://kinoplex.com.br"
    And clique em cinema e escolha o Kinoplex Amazonas
    When clicar em programação e fechar a tela de popup
    And escolher data, sessao e clicar em comprar
    And devera aparecer a tela para escolher o assento
    When na tela escolher o tipo de ingresso
    And segue tela pipoca e pular
    Then aparece a tela para preencher o cpf 