/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idadecase;
import java.util.Scanner;
/**impo
 *
 * @author CAMARGO
 */
public class Idadecase {

    public static void main(String[] args) {
        
    try (Scanner scanner = new 
    Scanner(System.in)) {
        
        
            System.out.print("Escreva sua idade: ");
            int idade = scanner.nextInt();
            int verifidade = (idade >= 18) ? 1 : 0;
            switch (verifidade) {
                
                case 1 :
                System.out.println("Permitido");
                break;
                case 0 :
                System.out.println("Negado");
                break;
                default :
                System.out.println("Idade inválida");
            }
        }
        System.exit(0);
    }
}
