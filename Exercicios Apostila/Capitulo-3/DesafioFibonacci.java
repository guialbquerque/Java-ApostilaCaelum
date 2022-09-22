public class DesafioFibonacci {
    public static void main(String[] args){
        System.out.println("Realizar sequencia de Fibonnaci utilizando apenas duas variaveis");

        
        int x2 = 1;
        int x1 = 0;
        while (x2 < 100){
            System.out.print(x1 + " | " + x2 + " | ");
            
            x1 = x1 + x2;
            
            x2 = x2 + x1;
        }
        }
    }

