package Medium;

public class HouseRobber_198 {

    public static void main(String[] args){
        int[] arr={2,1,1,2};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        int prev1=0;
        int prev2=0;
        int curr=0;
        for(int num:nums){
            int pick=num+prev2;
            int notPick=prev1;

            curr=Math.max(pick,notPick);

            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
}
