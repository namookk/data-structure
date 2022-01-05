package Array;

public class Array_Study {
    public static void main(String[] args) {
        int[] nums = new int[4];  // 비어 있는 배열 선언 ( 기본값으로 초기화 )
        int[] nums2 = new int[]{1,2,3,4}; // 선언과 동시에 초기화
        int[] nums3 = {1,2,3,4}; //선언과 동시에 초기화2

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        System.out.println(nums.length); //4

        int[] numsClone = nums.clone();
        for(int i = 0; i < numsClone.length; i++){
            System.out.print(numsClone[i] + " ");
        }

    }
}
