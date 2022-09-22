import java.util.Scanner; 
public class Ex7Cap3 {
    public static void main(String[] args){
        System.out.println("Lendo um numero e realizando uma sequencia de operacoes");
        try (/*Se o numero lido for par: n = n /2
                 * Se o numero lido for impar: n 3*n +  1
                 * Imprimir n. O programa deve parar quando n tiver valor igual a 1.
                 */
        Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o número: ");
            int n = leitor.nextInt();
            System.out.println("numero digitado: "+ n);

            while(n != 1){
                if(n % 2 == 0){
                    n /= 2;
                    System.out.print(n + " | ");
                }else{
                    n = 3*n + 1;
                    System.out.print(n + " | ");
                }
            }
        }
    
    }
}
