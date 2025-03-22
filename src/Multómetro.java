import java.util.Scanner;

public class Multómetro {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    
     
     for (int j = 0; j < 5; j++) {
         
         System.out.println("ingrese su nombre: ");
         String nombre = input.nextLine();
          
         System.out.println("ingrese su velocidad: ");
         int velocidad = input.nextInt();
    
         if  (velocidad <=60) {
            System.out.println("¡felicidades! no has excedido los limites de seguridad");
         }
            int multa =  (velocidad -60)*(2); 
            System.out.println("usted ha excedido los limites de velocidad, su multa es de: " +"$" +multa);
            input.nextLine();
         
       }
      input.close();
    }
}
