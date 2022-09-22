public class Ex3Cap3 {
    public static void main(String[] args){
        System.out.println("Todos os multiplos de 3 ate 100");
        
        for(int i = 3; i <100; i++){
            if(i % 3 ==0){
                System.out.print(i + " | ");
            }
        }
    }
}
