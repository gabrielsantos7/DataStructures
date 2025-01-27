## Getting Started

# ☕ Hash Table Implementation

Este projeto apresenta a implementação de uma **Tabela Hash (Hash Table)** baseada em vetores e listas ligadas para tratamento de colisões. O projeto inclui também uma aplicação de exemplo que verifica se duas palavras são  **anagramas**.

## 📕 Conceitos Básicos

A **Tabela Hash** é uma estrutura de dados que utiliza uma função de hash para mapear chaves a valores, permitindo operações rápidas de inserção, busca e remoção.

### 🔍 Características

* **Acesso rápido:** Operações de busca, inserção e remoção têm, em média, complexidade **O**(**1**).
* **Tratamento de colisões:** Utiliza listas ligadas (encadeamento) para lidar com situações em que múltiplas chaves são mapeadas para o mesmo índice.
* **Rehashing:** A tabela redimensiona automaticamente quando a carga (proporção entre elementos e tamanho do array) ultrapassa um limite pré-definido.

## 🔧 Funcionalidades da Implementação

A classe `HashTable` implementa as seguintes operações:

* **Inserção e atualização:**
  * `put(K key, V value)`: Adiciona um par chave-valor ou atualiza o valor se a chave já existir.
* **Busca:**
  * `get(K key)`: Retorna o valor associado à chave fornecida.
* **Remoção:**
  * `remove(K key)`: Remove um par chave-valor.
* **Verificação:**
  * `containsKey(K key)`: Verifica se a chave existe.
  * `containsValue(V value)`: Verifica se o valor existe.
* **Outras operações:**
  * `keySet()`: Retorna um conjunto de todas as chaves.
  * `getSize()`: Retorna o número total de pares chave-valor.
  * `isEmpty()`: Verifica se a tabela está vazia.
  * `toString()`: Retorna uma representação textual da tabela.

## 🧩 Exemplo Prático: Verificador de Anagramas

A aplicação de exemplo utiliza duas tabelas hash para verificar se duas palavras são **anagramas** (se possuem as mesmas letras com a mesma frequência).

### 📒 Funcionamento

1. Cada caractere da palavra é inserido na tabela hash com sua frequência como valor.
2. As tabelas das duas palavras são comparadas para verificar se possuem as mesmas chaves e valores.

## 📁 Estrutura do Projeto

* **HashTable:** Implementação da tabela hash com tratamento de colisões por encadeamento.
* **App:** Aplicação que verifica se duas palavras são anagramas.

## ⬆️ Possíveis Melhorias

* Implementar suporte para valores nulos.
* Adicionar métodos para obter todos os valores armazenados na tabela.
* Criar uma interface gráfica para entrada de palavras e visualização do processo de verificação.
* Adicionar manipulação de arquivos para verificar anagramas em listas de palavras
