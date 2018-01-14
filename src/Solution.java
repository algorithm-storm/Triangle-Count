import java.util.Arrays;

public class Solution {
    /*
     * @param S: A list of integers
     * @return: An integer
     */
    public int triangleCount(int[] S) {

        if(S.length == 0 || S == null){
            return 0;
        }

        int left;
        int right;
        int target;
        int count = 0;

        Arrays.sort(S);
        for(int i = S.length - 1 ; i >= 2 ; i--){

            left = 0;
            right = i - 1;
            target = S[i];

            while(left < right){

                if(S[left] + S[right] > target){
                    count += right - left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;

    }
}