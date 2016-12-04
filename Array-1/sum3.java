/*
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
*/

public int sum3(int[] nums) {
  int len = nums.length;
  int sum=0;
  while(len>0) {
    sum = sum+nums[len-1];
    len = len-1;
  }
  return sum;
}
