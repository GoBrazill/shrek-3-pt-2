# Abstração com Contas Bancárias
## Você foi contratado para desenvolver uma aplicação bancária simplificada. O sistema deve ser capaz de lidar com diferentes tipos de contas bancárias, como:

- Conta Corrente (CC)

- Conta Poupança (CP)

- Conta Pessoa Jurídica (PJ)
---
### Crie uma classe abstrata chamada Conta, que será a superclasse para todas as outras contas. Essa classe deve conter:

#### Atributos comuns: 
- numero;
- agencia;
- titular;
- saldo;

#### Métodos:
- depositar(double valor)
- sacar(double valor)
- exibirSaldo()
- Um método abstrato: calcularTarifaMensal() que será implementado pelas subclasses.
---
### Regras específicas por tipo de conta:
#### 1. Conta Corrente (CC):
- Tarifa mensal fixa de R$ 12,00.
- Pode ter saque e depósito normalmente.

#### 2. Conta Poupança (CP):
- Sem tarifa mensal.

#### 3. Conta Pessoa Jurídica (PJ):
- Tarifa mensal de R$ 20,00
- Cada saque tem uma taxa adicional de R$ 1,50.
---
### Requisitos:
- Utilize a palavra-chave abstract na classe Conta.
- Implemente pelo menos os métodos obrigatórios nas subclasses.
- Crie uma classe Banco (ou Main) com o método main que:
- Crie instâncias de cada tipo de conta.
- Realize operações de saque, depósito e exibição de saldo.

Calcule e mostre a tarifa mensal de cada conta.
