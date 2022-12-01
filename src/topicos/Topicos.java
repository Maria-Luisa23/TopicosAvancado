package topicos;

import java.util.Scanner;

public class Topicos {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int segundo,hora, minuto;
        
        System.out.println("Informe o segundo");
        segundo = input.nextInt();
        
        hora = (segundo /3600);
        minuto = (segundo % 3600)/60;
        segundo = (segundo % 3600)%60;
        
        
        System.out.println(hora + " : " + minuto + " : " + segundo);

    }
}

 
