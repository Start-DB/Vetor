import java.util.Scanner;

public class Inteiros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int vect[] = new int[n];

        
        for(int i = 0; i<vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
            
        }
        System.out.print("NUMEROS NEGATIVOS:");
        for(int i = 0; i<vect.length; i++){
            if(vect[i]<0){
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
}