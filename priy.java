public class VerificaPrimo {
    public static void main(String[] args) {
       int num = 29; // número a ser verificado se é primo ou não
       boolean flag = false;
       
       if (num <= 1) { // se o número for menor ou igual a 1, ele não é primo
          System.out.println(num + " não é um número primo.");
          return;
       }
       
       for (int i = 2; i <= Math.sqrt(num); i++) {
          // condição para o número não ser primo
          if (num % i == 0) {
             flag = true;
             break;
          }
       }
 
       if (!flag)
          System.out.println(num + " é um número primo.");
       else
          System.out.println(num + " não é um número primo.");
    }
 }