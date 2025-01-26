
# ☕ Queue Implementation

Este projeto apresenta a implementação da estrutura de dados **Fila (Queue)**, incluindo um exemplo prático que resolve o clássico  **Problema de Josephus**.

## 📕 Conceitos Básicos

A **Fila (Queue)** é uma estrutura de dados linear que segue o princípio  **FIFO (First In, First Out)** , onde o primeiro elemento a entrar é o primeiro a sair.

### 🔍 Características

* **Inserção (enqueue):** Adiciona um elemento ao final da fila.
* **Remoção (dequeue):** Remove e retorna o elemento do início da fila.
* **Acesso restrito:** Apenas o primeiro elemento (início da fila) pode ser acessado diretamente.
* **Dinâmica:** Cresce e encolhe conforme necessário.

## 🔧 Funcionalidades da Implementação

A implementação da classe `Queue` neste projeto oferece:

* **Operações básicas:**
  * `enqueue(T value)`: Adiciona um elemento à fila.
  * `dequeue()`: Remove e retorna o elemento no início da fila.
  * `peek()`: Retorna o elemento no início sem removê-lo.
  * `getSize()`: Retorna o número de elementos na fila.
  * `isEmpty()`: Verifica se a fila está vazia.
* **Representação:** A fila pode ser convertida para uma string (`toString()`), exibindo todos os elementos na ordem.

## 🎲 Exemplo Prático: Problema de Josephus

A aplicação de exemplo utiliza a fila para resolver o  **Problema de Josephus** , uma questão clássica em matemática e ciência da computação.

### 📒 Problema de Josephus

* Um grupo de pessoas está organizado em círculo.
* Um número fixo (`step`) é definido, e, a cada iteração, uma pessoa é eliminada.
* O processo continua até que reste apenas uma pessoa, que é considerada a vencedora.

### 🧩 Funcionalidades do Exemplo

1. **Configurar o passo:** O usuário define o valor do passo (`step`).
2. **Processar eliminações:** A fila simula o movimento circular para eliminar os participantes.
3. **Determinar o vencedor:** Após todas as eliminações, o vencedor é exibido.

## 📁 Estrutura do Projeto

* **Queue:** Implementação da estrutura de dados Fila.
* **App:** Aplicação que resolve o Problema de Josephus.

## ⬆️ Possíveis Melhorias

* Adicionar suporte para nomes de participantes dinâmicos, carregados de um arquivo.
* Exibir estatísticas, como o número de eliminações processadas.
* Implementar uma interface gráfica para interagir com o usuário de forma visual.
