import java.util.Scanner;

public class arreglos {
    public static void main(String[]args){
        int totalArreglo;                              //Aca declara el total del arreglo.
        System.out.print("Que tan grande queres que sea el mazo? ");
        Scanner entrada=new Scanner(System.in);
        totalArreglo=entrada.nextInt();               //Aca pide que ingreses cunto mide el arreglo.
        System.out.println();
        int [] mazoDeCartas=new int[totalArreglo];
        System.out.println("Inserte las cartas de su mazo");
        for(int i=0;i<totalArreglo;i++){              //Un bucle for para ingresar todos los valores del arreglo.
            System.out.print("Digite la carta " + (i+1) + ", ");
            mazoDeCartas[i]=entrada.nextInt();       //Aca ingresa el valor de cada carta segun la posicion del arreglo.
        }
        for(int j=0;j<totalArreglo;j++){
            System.out.println(mazoDeCartas[j] + " ");
        }
        entrada.close();
    }
    
}
