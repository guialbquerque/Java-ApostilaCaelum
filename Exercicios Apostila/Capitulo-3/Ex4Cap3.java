public class Ex4Cap3 {
    public static void main(String[] args){
        System.out.println("Imprimir os fatoriais de 1 ate 10");

        int fat = 1;
        for(int i = 0; i<= 10; i++){
            if(i == 0){
                fat = 1;
                System.out.println("Fatorial de: "+ i + " --> " + fat);
                i++;
            }
            fat *= i;
            System.out.println("Fatorial de: "+ i + " --> " + fat);
        }
    }
}
