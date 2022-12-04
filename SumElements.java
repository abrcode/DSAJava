import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
    
        System.out.println("Enter Lenghth :" + n);
        
        for(int i=0; i < nums.length ; i++){
            nums[i] = sc.nextInt();
        }
        
        //sum logic
        int sum = 0;
        for(int i=0; i < nums.length ; i++){
         sum += nums[i];   
        }
        
        System.out.println("The sume of all elements " + sum);
	}
}
