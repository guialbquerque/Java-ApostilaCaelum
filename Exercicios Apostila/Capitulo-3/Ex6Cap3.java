public class Ex6Cap3 {
    public static void main(String[] args){
        System.out.println("Sequencia de Fibonacci ate passar de 100");

        int x1 = 0;
        int x2 = 1;
        for (int x3 = 0; x3 < 100; x3 = x1+x2){
            System.out.print(x3 + " | ");
            x1 = x2;
            x2 = x3;
        }
    }
}
