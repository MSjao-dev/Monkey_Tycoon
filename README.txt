# 📘 Monkey Tycoon – Documentação Geral do Projeto

Este documento contém uma explicação clara sobre a função de **cada pasta** e **cada arquivo principal** dentro do projeto **Monkey Tycoon**.
Use este README para navegar no código, entender responsabilidades e manter o projeto organizado.

---

# 📂 **Pasta: Eventos**

Contém todos os eventos que podem ocorrer no parque e afetar os macacos ou os recursos.

### **Objetivo**

* Gerenciar acontecimentos aleatórios ou acionados pelo jogador.
* Afetar estado do parque, macacos ou itens.
* Isolar a lógica de “eventos” sem misturar com o core do jogo.

### **O que costuma ter aqui**

* Classes de eventos específicos (ex: *ChuvaDeBananas*, *MacacoFugiu*, etc).
* Métodos como `executarEvento(Parque parque)`.

---

# 📂 **Pasta: Itens**

Define os itens do jogo e sua relação com os macacos.

### **Objetivo**

* Armazenar a classe base `Item`.
* Definir itens que aumentam atributos, dão buffs, ou afetam ações.
* Permitir herança para novos itens personalizados.

### **O que costuma ter aqui**

* `Item.java` — classe mãe.
* Diferentes itens que herdam de `Item`.

---

# 📂 **Pasta: Minigames**

Contém todos os minigames do Monkey Tycoon, como a **Roleta Russa de Bananas**, Corrida dos Macacos, etc.

### **Objetivo**

* Separar a lógica de minigames do resto do jogo.
* Cada minigame deve ter sua própria classe.
* Todos devem receber o `Parque` ou seus componentes como dependência.

### **O que costuma ter aqui**

* `RoletaRussa.java`
* Outros minigames futuros.

---

# 📂 **Pasta: Utils**

Funções auxiliares reutilizáveis.

### **Objetivo**

* Evitar repetição de código.
* Facilitar uso de métodos comuns como:

  * Gerar números aleatórios.
  * Formatar texto.
  * Funções matemáticas.

### **O que costuma ter aqui**

* `Input.java`
* `RandomUtils.java`
* Validações.

---

# 📄 **Arquivo: Func.java**

Provavelmente um *handler* de funções gerais do jogo.

### **Responsabilidade**

* Funções de controle do menu.
* Ações que não pertencem diretamente a classes específicas.
* Conectar menus aos métodos corretos no jogo.

---

# 📄 **Arquivo: Jogo.java**

O **core** que controla o fluxo do jogo.

### **Responsabilidade**

* Rodar o loop principal.
* Carregar menus.
* Controlar interações do jogador.
* Criar e manter a instância `Parque parque`.

---

# 📄 **Arquivo: Macacos.java**

Define o modelo de um **macaco individual**.

### **Responsabilidade**

* Atributos do macaco (fome, força, habilidades, etc).
* Métodos de ação (`comer`, `treinar`, `infoMacaco()`, etc).
* A classe é usada amplamente por todos os sistemas.

---

# 📄 **Arquivo: Parque.java**

Gerencia todos os macacos e recursos do parque.

### **Responsabilidade**

* Guardar `ArrayList<Macacos>`.
* Criar, remover e gerenciar macacos.
* Dar acesso aos macacos para minigames, eventos e itens.
* Expor métodos públicos como:

  * `getMacacos()`
  * `listarMacacos()`
  * `getBananas()`
  * `setBananas()`

---
