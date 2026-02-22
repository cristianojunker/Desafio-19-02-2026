# Projeto – Exercícios de Aquecimento (Java)

Projeto em Java desenvolvido no **Eclipse 2022-06**, utilizando **Java 1.8**, contendo um menu no console para executar diferentes exercícios, como:

* Impressão de triângulo e retângulo (com diagonal)
* Verificação de equilíbrio de delimitadores em expressão
* Tokenização simples de uma instrução
* Operações com conjuntos (união e interseção)
* Trava lógica (simulação de fechadura eletrônica por estados)

---

## Requisitos

* **Java JDK 1.8** (obrigatório para compilar/executar os exercícios)
* **Eclipse IDE 2022-06** (ou compatível)
* Sistema operacional: Windows / Linux / macOS

> Observação: Algumas versões do Eclipse podem exigir Java 11+ para rodar a IDE, mas o projeto deve estar configurado para **compilar em Java 8 (1.8)**.

---

## Estrutura do projeto

Pacotes principais (exemplo):

* `main`

  * `Main.java` (menu principal e chamadas)
* `main.aquecimento`

  * `Desafio.java` (implementações dos exercícios)

---

## Como importar e configurar no Eclipse (Eclipse 2022-06 + Java 8)

### 1) Instalar/Configurar o Java 8 (JDK 1.8)

Garanta que você possui o **JDK 1.8** instalado (não apenas JRE).

Para confirmar no terminal/prompt:

* `java -version`
* `javac -version`

Deve aparecer algo como `1.8.x`.

### 2) Importar o projeto no Eclipse

Se o projeto já está em uma pasta no seu computador:

1. Abra o Eclipse
2. **File → Import...**
3. Selecione:

   * **General → Existing Projects into Workspace**
4. Em **Select root directory**, escolha a pasta do projeto
5. Marque o projeto encontrado e clique em **Finish**

### 3) Configurar o JDK 8 dentro do Eclipse

1. **Window → Preferences**
2. **Java → Installed JREs**
3. Clique em **Add... → Standard VM**
4. Em **JRE home**, selecione a pasta do seu **JDK 1.8**
5. Marque o JDK 8 como **Default** e clique em **Apply and Close**

### 4) Configurar o nível de compilação para Java 8

1. Clique com o botão direito no projeto → **Properties**
2. **Java Compiler**
3. Marque **Enable project specific settings**
4. Em **Compiler compliance level**, selecione **1.8**
5. **Apply and Close**

---

## Como executar o projeto

### Executar pelo Eclipse

1. Abra `src/main/Main.java`
2. Clique com o botão direito no arquivo → **Run As → Java Application**
3. O console exibirá um menu, por exemplo:

   * 1 - Imprimir triângulo
   * 2 - Imprimir retângulo
   * 3 - Verificar equilíbrio de equação
   * 4 - Tokenização
   * (outros exercícios, se adicionados)
   * 0 - Sair

### Uso no console

Digite o número da opção e pressione Enter.

Exemplos de entrada (dependendo do exercício):

* Triângulo: altura `5`
* Retângulo: altura `4` e largura `6`
* Equilíbrio: `(a + [b*c] - {d/e})`
* Tokenização: `soma = 10 + 20;`
* Trava lógica: `1-2-3`

---

## Observações importantes (entrada via Scanner)

* Para ler expressões com espaços (ex.: `soma = 10 + 20;`), o ideal é usar `scanner.nextLine()` ao invés de `scanner.next()`.
* Para evitar erros como `InputMismatchException` no menu, recomenda-se ler a entrada como texto e converter com `Integer.parseInt()` (tratando erros de conversão).

---

## Exercícios implementados (resumo)

### 1) Impressão de triângulo

Imprime um triângulo de `*` com base na altura informada.

### 2) Impressão de retângulo e diagonal superior direita

Imprime um retângulo de `*` e em seguida uma diagonal superior direita.

### 3) Verificador de equilíbrio em expressão

Verifica se delimitadores `()`, `[]`, `{}` estão balanceados e fechando na ordem correta usando pilha (Stack).

### 4) Tokenização

Quebra uma expressão em tokens (por espaço) e classifica:

* Identificador
* Atribuição (=)
* Número
* Operador (+, -, *, /)
* Fim de instrução (;)

### 5) Conjuntos (União e Interseção)

Dado A e B (ArrayList), retorna:

* União (sem duplicados)
* Interseção (sem duplicados)

### 6) Trava lógica (fechadura por estados)

Simula uma fechadura que concede acesso apenas se a sequência `1-2-3` for reconhecida ao final (estado 3).

---

## Solução de problemas

### Eclipse não abre / pede Java 11+

* Instale um Java 11 ou 17 apenas para rodar o Eclipse e mantenha o Java 8 para o projeto.
* No Eclipse, configure o **Java Compiler = 1.8** e o **Installed JREs** com o JDK 8.

### Erro: `InputMismatchException` (Scanner)

* Ocorre quando `nextInt()` tenta ler algo que não é número.
* Solução: ler com `nextLine()` e converter com `Integer.parseInt()` tratando erro.

### Projeto não compila (versão incompatível)

* Verifique:

  * **Project → Properties → Java Compiler → 1.8**
  * **Window → Preferences → Java → Installed JREs → JDK 8 Default**

---

## Tecnologias

* Java 1.8
* Eclipse 2022-06
* Console/Scanner (entrada via terminal do Eclipse)

---

## Autor

* (Cristiano Junker)

---
