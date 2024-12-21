package com.mycompany.exemplo.Instancia;

class VarInstancia {
    void imprimeVar(){
        int i = 1; //variavel local
        String s = "Bom dia"; //variavel local
        System.out.println(s);
        System.out.println(i);
}

    public static void main(String[] args) {
        VarInstancia v = new VarInstancia();
        v.imprimeVar();
    }
}
