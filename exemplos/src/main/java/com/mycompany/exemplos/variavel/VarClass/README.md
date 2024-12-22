# Explicando o código...
```java 19
public class VarClass {
    static int i = 0; //variável de classe não precisa de um objeto para ser manipulada 
   public static void main(String[] args){
 System.out.println(VarClass.i);
}
}
```
## 1. Definição da Classe
```java 19
public class VarClass {
```
- public: Modificador de acesso, indica que a classe é pública e pode ser acessada de qualquer outro lugar no programa.
- class: Palavra-chave usada para declarar uma classe.
- VarClass: Nome da classe.

## 2. Declaração da Variável de Classe
```java 19
static int i = 0; // variável de classe
```
- static:
  - Declara a variável i como uma variável de classe.
  - Uma variável estática pertence à classe, e não aos objetos criados a partir da classe.
  - Pode ser acessada diretamente pelo nome da classe, sem a necessidade de instanciar um objeto.
- int i = 0;:
  - Declara a variável i do tipo int (número inteiro) e inicializa com o valor 0.

## 3. Método main
```java 19
public static void main(String[] args) {
```
- public: O método pode ser chamado de qualquer lugar.
- static: O método pertence à classe, e não a uma instância da classe.
- void: Não retorna nenhum valor.
- main: Método principal, executado ao iniciar o programa.
- String[] args: Argumentos passados pela linha de comando (não são usados neste exemplo).

## 4. Imprimindo a Variável de Classe
```java 19
System.out.println(VarClass.i);
```
- System.out.println: Método usado para imprimir valores no console
- VarClass.i:
    - Acessa a variável de classe i diretamente pelo nome da classe VarClass.
    - Não é necessário criar um objeto da classe para acessar essa variável, pois ela é estática.
- O valor de i é 0, pois foi inicializado com esse valor

## Fluxo Completo de Execução
- 1 - O programa começa no método main.
- 2 - O valor da variável de classe i (0) é acessado diretamente pela classe VarClass.
- 3 - Esse valor é impresso no console.

## Saída no Console
```java 19
0
```
## Saída no Console
- 1 - A variável i é uma variável de classe por causa da palavra-chave static.
- 2 - Como é estática, pode ser acessada diretamente pelo nome da classe, sem a necessidade de criar um objeto.
- 3 - O programa simplesmente imprime o valor inicial de i, que é 0.


