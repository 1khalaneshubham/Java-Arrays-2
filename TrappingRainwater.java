import java.util.*;

public class TrappingRainwater {

    public static int Trapped(int height[]){
        int n = height.length;
        //calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        } 

        //calculate right max boundary
        int rightmax [] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int TrappedW = 0;
        // loop
        for(int i=0; i<n; i++){
            // waterLevel = min(leftmax bound,rightmax bound)

            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            
            // Trapped water = waterLevel - height[i]
            TrappedW += waterLevel - height[i];
        }
        return TrappedW;
    }

    public static void main(String args[]){
        int hight[] = {4,2,0,6,3,2,5};
        
        System.out.println("Trapped water is: " +Trapped(hight));

    }    
}
