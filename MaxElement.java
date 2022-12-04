import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
    
        for(int i=0; i < nums.length ; i++){
            nums[i] = sc.nextInt();
        }
        
        //Logic for max Element
        int maxElement = Integer.MIN_VALUE;
        
        for(int i=0; i < nums.length ; i++){
         
         if( maxElement < nums[i]){
             maxElement = nums[i];
         }
         
        }
        
        System.out.println("The Max element from given array " + maxElement);
	}
}
