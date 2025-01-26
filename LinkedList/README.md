# ☕ Linked List Implementation

Este projeto apresenta a implementação de uma **Lista Ligada (Linked List)**. Além da estrutura de dados em si, o projeto inclui uma aplicação de exemplo que simula um sistema de agenda telefônica.

## 📕 Conceitos Básicos

A **Lista Ligada** é uma estrutura de dados linear composta por nós. Cada nó contém:

* Um valor ou dado armazenado.
* Um ponteiro para o próximo nó na sequência (em listas ligadas simples).

### 🔍 Características

* **Inserção e remoção dinâmica:** A lista cresce ou encolhe conforme necessário, sem a necessidade de redimensionamento.
* **Operações de inserção/remover:** Estas são eficientes se realizadas nas extremidades, mas podem ser custosas para localização de elementos devido à navegação sequencial.

## 🔧 Funcionalidades da Implementação

A implementação da `LinkedList` neste projeto oferece:

* **Adicionação:**
  * No início (cabeça).
  * Em uma posição específica.
  * No final (cauda).
* **Remoção:**
  * De um índice específico.
  * Do último elemento (pop).
* **Consulta:** Recupera o elemento em um índice específico.
* **Outras operações:**
  * Limpar a lista.
  * Verificar se a lista está vazia.
  * Obter o tamanho da lista.

## ☎️ Exemplo Prático: Sistema de Agenda Telefônica

A aplicação de exemplo usa a lista ligada para gerenciar contatos de uma agenda telefônica. Cada contato é representado pela classe `Contact`, que possui os atributos:

* `name`: Nome do contato.
* `phoneNumber`: Número de telefone.

### 📒 Funcionalidades da Agenda

    1.**Adicionar um contato:** Insere um contato ao final da lista.
    2. **Remover um contato:** Remove um contato pelo nome, solicitando confirmação do usuário.
    3. **Procurar um contato:** Busca contatos pelo nome e exibe os resultados.
    4. **Exibir todos os contatos:** Lista todos os contatos armazenados.
    5. **Sair:** Finaliza a aplicação.

## 📁 Estrutura do Projeto

* **LinkedList:** Implementação da estrutura de dados Lista Ligada.
* **Contact:** Classe que representa os contatos na agenda.
* **App:** Interface principal que interage com o usuário e utiliza a `LinkedList` para armazenar os contatos.

## ⬆️ Possíveis Melhorias

* Adicionar persistência dos contatos em arquivo.
* Implementar busca por prefixo do nome para facilitar a pesquisa.
* Introduzir uma interface gráfica para substituir a interação via terminal.
