# Trabalho Arquitetura e Design Patterns desenvolvido para a Metéria de Arquitetura de Software

Este repositório contém três projetos Java que demonstram padrões de arquitetura e design:

- `builder_pattern`
- `proxy_pattern`
- `templateMethod_pattern`

Cada projeto está isolado em seu próprio módulo Maven e exemplifica um padrão de projeto diferente.

---

## 1. builder_pattern

### Padrão utilizado: Builder

Este projeto demonstra o padrão Builder para criar objetos complexos de forma fluente e passo a passo.

### O que ele faz

- Define a interface `BuilderInterface` que expõe métodos para configurar um plano de treino.
- Implementa `BuilderImplementation`, que acumula dados como nome do treino, exercícios, data e descrição.
- Constrói um objeto `ExerciseRoutine` usando o método `build()`.
- Possui um método `reset()` para limpar o estado do builder e permitir a construção de um novo objeto.

### Fluxo principal

- O `Main` cria instâncias de `Exercise` e configura seus valores.
- Utiliza `BuilderImplementation` para montar planos de treino (`ExerciseRoutine`) em etapas:
  - `workOutName(...)`
  - `addExercise(...)`
  - `setDate(...)`
  - `addDescription(...)`
  - `build()`
- Imprime os planos de treino resultantes.

### Objetivo do padrão

O padrão Builder separa a construção de um objeto complexo de sua representação, permitindo montar diferentes variações de `ExerciseRoutine` sem usar construtores com muitos parâmetros.

> Observação: o pacote `director` contém a classe `Director`, mas ela está vazia neste exemplo.

---

## 2. proxy_pattern

### Padrão utilizado: Proxy

Este projeto demonstra o padrão Proxy, que envolve o acesso a um objeto real com um objeto representante que pode controlar ou proteger as operações.

### O que ele faz

- Define a interface `BankAccount` com métodos `getBalance()` e `withdraw(...)`.
- Implementa `BankAccountImplementation`, que mantém o saldo e executa saques.
- Cria `BankAccountProxy`, que também implementa `BankAccount` e delega chamadas para a implementação real.
- O proxy faz verificação de credenciais (`userName` e `passwd`) antes de permitir o saque.

### Fluxo principal

- O `Main` cria dois usuários: um inválido e outro válido.
- Cria um `BankAccountProxy` para cada usuário.
- Tenta exibir o saldo e fazer saque usando o proxy.
- Apenas o proxy com credenciais válidas permite o saque.

### Objetivo do padrão

O proxy age como um intermediário entre o cliente e o objeto real, permitindo controle de acesso, autenticação, log, cache ou proteção sem modificar a implementação principal.

---

## 3. templateMethod_pattern

### Padrão utilizado: Template Method

Este projeto demonstra o padrão Template Method, em que uma classe abstrata define a estrutura de um algoritmo e subclasses fornecem detalhes específicos.

### O que ele faz

- Define a classe abstrata `PrepareDrink` com o método `prepareDrink()` como `final`.
- `prepareDrink()` executa a sequência fixa de passos:
  1. `boilWater()`
  2. `addIngredient()`
  3. `addComplements(...)`
  4. `mix()`
  5. `serveDrink()`
- As subclasses `PrepareCoffe`, `PrepareTea` e `PrepareHotChocolate` implementam os passos específicos `addIngredient()` e `addComplements(...)`.

### Fluxo principal

- O `Main` cria objetos de bebidas concretas com complementos.
- Executa o método `prepareDrink()` em cada instância.
- Cada bebida segue a mesma sequência de preparação, mas com ingredientes diferentes.

### Objetivo do padrão

O Template Method permite reutilizar a lógica comum de um algoritmo enquanto deixa as partes específicas a cargo das subclasses, garantindo consistência no processo.

---

## Como executar

Cada projeto é um módulo Maven separado. A partir do diretório de cada projeto, use:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.example.Main"
```

Ou execute a classe `Main` diretamente na IDE.

## Estrutura do repositório

- `builder_pattern/`
  - `src/main/java/builder/`
  - `src/main/java/director/`
  - `src/main/java/entities/`
  - `src/main/java/org/example/application/`
- `proxy_pattern/`
  - `src/main/java/org/example/`
  - `src/main/java/org/example/BankAccountInterface/`
  - `src/main/java/org/example/implementation/`
  - `src/main/java/org/example/proxy/`
  - `src/main/java/org/example/entities/`
- `templateMethod_pattern/`
  - `src/main/java/org/example/`
  - `src/main/java/org/example/template/`
  - `src/main/java/org/example/concreteDrinks/`

---

## Observações gerais

- O repositório foca em exemplos simples de cada padrão de design.
- Cada projeto mostra como estruturar classes e interfaces para aplicar um padrão arquitetural específico.
- Esses exemplos foram são úteis para aprendizado de matéria de arquitetura de software e padrões de projeto em Java.
