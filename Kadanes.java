import java.util.*;

public class Kadanes {
    
    public static void KadanesAlg(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max subArray sum is : "+ ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        KadanesAlg(numbers);
    } 
}
