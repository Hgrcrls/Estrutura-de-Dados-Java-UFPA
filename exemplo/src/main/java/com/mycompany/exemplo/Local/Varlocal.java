/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
