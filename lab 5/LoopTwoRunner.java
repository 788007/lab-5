
/**
 * @Laurel Woods
 * @ lab 5 9/9/16
 */
public class LoopTwoRunner
{
    public static void main(String[] args){
        int n = 30;
        LoopTwo loop = new LoopTwo(n);
        loop.loadRandom();
		System.out.println(loop.printArray());
        loop.sortArray();
        System.out.println("\n" + loop.printArray());
        System.out.println("\n" + "The average is " + loop.findAverage());
        
    }
}
