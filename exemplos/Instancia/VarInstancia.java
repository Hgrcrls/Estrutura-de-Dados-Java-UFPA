package com.mycompany.exemplo.Instancia;

class VarInstancia {
    int i = 0; //variavel de instancia
 void imprimeVar1(){
     System.out.println(i);
     i += 2;       
}
 void imprimeVar2(){
     System.out.println(i);
     i+= 3;
 }
    public static void main(String[] args) {
        VarInstancia v = new VarInstancia();
        v.imprimeVar1();
        v.imprimeVar2();
        System.out.println(v.i); //variavel i sendo manipulada por um objeto da sua classe      
    }
}
