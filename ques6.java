public class ques6{
    public static void main(String[] args){
        System.out.println("prime nuMBers betweeN 2 and 100:");
        for (int num=2;num<=100;num++){
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }
    }
}