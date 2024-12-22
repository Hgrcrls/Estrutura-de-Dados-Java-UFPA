### Java 19
```java 19
package com.mycompany.exemplo.Local;

class Varlocal {
    void imprimeVar(){
        int i = 1; //variavel local
        String s = "Bom dia"; //variavel local
        System.out.println(s);
        System.out.println(i);
}

    public static void main(String[] args) {
        Varlocal v = new Varlocal();
        v.imprimeVar();
    }
}
```
# 1. Definição da Classe
```java 19
public class Varlocal {

```
- public: Modificador de acesso que indica que essa classe é pública, ou seja, pode ser acessada por qualquer outra classe do programa.
- class: Palavra-chave usada para declarar uma classe.
- Varlocal: Nome da classe. Segue a convenção de começar com uma letra maiúscula.

# 2. Método imprimeVar
```java 19
void imprimeVar(){
```
- void: Tipo de retorno do método. Significa que esse método não retorna nenhum valor.
- imprimeVar: Nome do método. Representa a ação que ele realizará (imprimir variáveis locais).
- (): Indica que esse método não recebe parâmetros.

# 3. Declaração de Variáveis Locais
```java 19
int i = 1; // variavel local
String s = "Bom dia"; // variavel local
```
- int i = 1;:
  - Declara uma variável local i do tipo int (número inteiro).
  - A variável é inicializada com o valor 1.
  - É chamada local porque foi declarada dentro do método imprimeVar, e só pode ser usada nesse método.
- String s = "Bom dia";:
  - Declara uma variável local s do tipo String (sequência de caracteres).
  - É inicializada com o valor "Bom dia".

# 4. Impressão das Variáveis
```java 19
System.out.println(s);
System.out.println(i);
```
- System.out.println(s);:
  - Imprime o valor da variável s ("Bom dia") no console.

- System.out.println(i);:
  - Imprime o valor da variável i (1) no console.

# 5. Método main
```java 19
public static void main(String[] args) {
```
- public: O método pode ser chamado de qualquer lugar.
- static: O método pertence à classe e não a um objeto específico.
- void: Não retorna nenhum valor.
- main: Método principal que é executado quando o programa inicia.
- String[] args: Argumentos que podem ser passados para o programa pela linha de comando (não são usados neste exemplo).

# 6. Instanciação e Chamada do Método
```java 19
Varlocal v = new Varlocal();
```
- Varlocal v: Declara uma variável v do tipo Varlocal (a classe definida no início).
- new Varlocal(): Cria uma nova instância (objeto) da classe Varlocal.

```java 19
v.imprimeVar();
```
- v.imprimeVar();: Chama o método imprimeVar do objeto v.

# Fluxo Completo de Execução
- 1 - O programa começa no método main.
- 2 - Um objeto da classe Varlocal é criado e armazenado na variável v.
- 3 - O método imprimeVar é chamado.
- 4 - No método imprimeVar:
  - A variável s é inicializada com "Bom dia".
  - A variável i é inicializada com 1.
  - Os valores de s e i são exibidos no console.
- 5 - O programa termina.
