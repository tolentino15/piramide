/*
Implemente um programa para obter do usuário um número inteiro maior que zero. O
programa deverá gerar e exibir uma pirâmide de números segundo o exemplo abaixo.
 */
package piramide;
import java.util.Scanner;
public class Piramide {

    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int num,valor,linha;
 
        System.out.println("Informe o número que deseja fazer a piramide:");
        num = input.nextInt();
        
        //forçar positivo
        while (num <= 0){
            System.out.println("Número inválido. Informe um número positivo");
            num = input.nextInt();
        } // fim
        
   for(linha = 1; linha <= num ; linha++) {
        for (valor = 1; valor <= linha ; valor++){
            System.out.print(valor + " ");
        }
        System.out.println();
   }
  for (linha = num - 1; linha >= 1; linha--){      
         for (valor = 1; valor <= linha ; valor++){
            System.out.print(valor + " ");
        
        }
         System.out.println();
  }
 
    }
    }
    

