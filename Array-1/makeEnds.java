/*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
*/

public int[] makeEnds(int[] nums) {
  int[] a;
  int len = nums.length;
  if (len>=1){
    a = new int[2];
    a[0] = nums[0];
    a[1] = nums[len-1];
  } else {
    a = new int[1];
    a[0] = nums[0];
  }
  return a;
}
