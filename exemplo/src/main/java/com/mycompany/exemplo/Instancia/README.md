# Explicando o código...

## 1. Declaração da Classe
```java 19
class VarInstancia {
```
- class: Palavra-chave usada para declarar uma classe.
- VarInstancia: Nome da classe. Segue a convenção de iniciar com uma letra maiúscula.

## 2. Variável de Instância
```java 19
int i = 0; //variavel de instancia
```
- int i = 0;:
  - Declara uma variável de instância chamada i do tipo int (número inteiro).
  - É inicializada com o valor 0.
  - Variável de Instância:
    - Pertence a cada instância (objeto) da classe.
    - Não está limitada a métodos específicos.
    - Seu valor é compartilhado entre os métodos da instância e preservado enquanto o objeto existir.

## 3. Método imprimeVar1
```java 19
void imprimeVar1(){
    System.out.println(i);
    i += 2;       
}
```
- void: O método não retorna nenhum valor.
- imprimeVar1: Nome do método.
- System.out.println(i);:
  - Imprime o valor atual da variável de instância i.
- i += 2;:
  - Incrementa o valor da variável de instância i em 2.

## 4. Método imprimeVar2
```java 19
void imprimeVar2(){
    System.out.println(i);
    i += 3;
}
```
- Estrutura semelhante ao método imprimeVar1.
- i += 3;:
  - Incrementa o valor da variável de instância i em 3.

## 5. Método main
```java 19
public static void main(String[] args) {
    VarInstancia v = new VarInstancia();
    v.imprimeVar1();
    v.imprimeVar2();
    System.out.println(v.i); 
}
```
- public static void main(String[] args):
  - Método principal que é executado quando o programa inicia.
- VarInstancia v = new VarInstancia();:
  - Cria um novo objeto da classe VarInstancia e o armazena na variável v.
- v.imprimeVar1();:
  - Chama o método imprimeVar1 do objeto v.
  - Imprime o valor atual de i (0) e incrementa i em 2 (valor de i torna-se 2).
- v.imprimeVar2();:
  - Chama o método imprimeVar2 do objeto v.
  - Imprime o valor atual de i (2) e incrementa i em 3 (valor de i torna-se 5).
- System.out.println(v.i);:
  - Imprime o valor atual da variável de instância i (5), acessada diretamente pelo objeto v.

## Fluxo Completo de Execução
1. O programa começa no método main.
2. Um objeto da classe VarInstancia é criado e armazenado na variável v.
3. O método imprimeVar1 é chamado:
  - O valor inicial de i (0) é impresso.
  - i é incrementado em 2 (valor de i agora é 2).
4. O método imprimeVar2 é chamado:
  - O valor atual de i (2) é impresso.
  - i é incrementado em 3 (valor de i agora é 5).
5. O valor final de i (5) é impresso diretamente.


















