# language: en
@BancoTeste
Feature: Testar as operacoes basicas de banco
  O sistema deve prover operações básicas de banco de forma correta.

  Background: Cria todas as contas e associa ao banco
    Given que as contas sao do "Banco do Brasil"
      | dono                       | numero | saldo |
      | Abias Corpus Da Silva      | 111    | 100   |
      | Antônio Morrendo das Dores | 222    | 200   |
      | Carabino Tiro Certo        | 333    | 200   |

  Scenario: Verifica o total de contas criadas
    Given o calculo do total de contas criadas
    Then o total de contas e 3

  Scenario: Verifica o total de dinheiro no banco
    Given o calculo do total de dinheiro
    Then o total de dinheiro no banco e 500