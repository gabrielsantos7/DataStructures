
# ☕ Stack Implementation

Este projeto apresenta a implementação de uma **Pilha (Stack)**. Além disso, inclui um exemplo prático que valida a correta utilização de parênteses em expressões matemáticas.

## 📕 Conceitos Básicos

A **Pilha (Stack)** é uma estrutura de dados linear que segue o princípio  **LIFO (Last In, First Out)** , onde o último elemento a entrar é o primeiro a sair.

### 🔍 Características

* **Inserção (push):** Adiciona um elemento ao topo da pilha.
* **Remoção (pop):** Remove e retorna o elemento no topo da pilha.
* **Acesso restrito:** Apenas o elemento no topo pode ser acessado diretamente.
* **Dinâmica:** Cresce e encolhe conforme necessário.

## 🔧 Funcionalidades da Implementação

A implementação da classe `Stack` neste projeto oferece:

* **Operações básicas:**
  * `push(T value)`: Adiciona um elemento ao topo da pilha.
  * `pop()`: Remove e retorna o elemento do topo da pilha.
  * `peek()`: Retorna o elemento do topo sem removê-lo.
  * `getSize()`: Retorna o número de elementos na pilha.
  * `isEmpty()`: Verifica se a pilha está vazia.
* **Representação:** A pilha pode ser convertida para uma string (`toString()`), exibindo todos os elementos em ordem.

## 🎲 Exemplo Prático: Validação de Parênteses em Expressões

A aplicação de exemplo utiliza a pilha para verificar se uma expressão matemática possui os parênteses balanceados.

### 📒 Funcionalidade

O programa valida expressões que incluem:

* Parênteses `()`
* Chaves `{ }`
* Colchetes `[ ]`

A lógica do programa consiste em:

1. Adicionar parênteses de abertura (`(`, `{`, `[`) na pilha.
2. Remover da pilha quando um parêntese de fechamento correspondente (`)`, `}`, `]`) for encontrado.
3. Garantir que a pilha esteja vazia ao final, indicando que todos os parênteses foram balanceados corretamente.

## 📁 Estrutura do Projeto

* **Stack:** Implementação da estrutura de dados Pilha baseada em lista ligada.
* **App:** Aplicação que valida expressões matemáticas.

## ⬆️ Possíveis Melhorias

* Adicionar suporte para validar expressões com operadores e números.
* Implementar uma interface gráfica para entrada e validação de expressões.
* Permitir o uso de diferentes tipos de delimitadores para outras linguagens ou aplicações específicas.
