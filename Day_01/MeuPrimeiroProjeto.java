/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meuprimeiroprojeto;

public class MeuPrimeiroProjeto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
     Pincel p = new Pincel();
     p.cor = "Verde";
     p.espessura = "2.0";
     p.formato = "redondo";
     p.tipo = "Lousa";
     
     p.escrever();
     p.desenhar();
     p.marcar();
     p.pintar();
     
     Pincel p1= new Pincel ();
     p1.cor = "verde";
     p1.espessura = "1,5";
     p1.formato = "redondo";
     p1.tipo = "Lousa";
     
     p1.escrever();
     p1.desenhar();
     p1.marcar();
     p1.pintar();
     
    }
    
}
