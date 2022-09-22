public class Ex5Cap3 {
    public static void main(String[] args){
        System.out.println("Imprimir os fatoriais de 1 ate 10");

        long fat = 1;
        for(long i = 0; i<= 30; i++){
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
/*A partir de 21 fatorial numeros errados comecam a surgir, isso se da porque o limite de bytes e numeros suportados pela
variavel primitiva foi ultrapassado*/