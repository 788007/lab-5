
/**
 * @Laurel Woods
 * @ lab 5 9/9/16
 */
public class LoopTwoRunner
{
   
    public static void main(String[] args){
        int n = 20;
        LoopTwo loop = new LoopTwo(n);
        loop.loadRandom();
        loop.sortArray();
        System.out.println(loop.printArray());
        System.out.println("The Average is " + loop.findAverage());
        
    }
}
