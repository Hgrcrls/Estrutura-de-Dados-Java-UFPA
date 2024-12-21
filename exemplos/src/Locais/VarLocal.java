package Locais;
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