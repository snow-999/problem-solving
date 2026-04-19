//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  int[] nums1 = {3,2, 2, 3};
  int m = 3;
  System.out.println(removeElement(nums1, m));
}
public int removeElement(int[] nums, int val) {
  for (int i =0; i < nums.length; i++) {
    if (nums[i] == val) {
      for (int j = i; j < nums.length - 1; j++) {
        nums[j] = nums[j + 1];
      }
      i--;
    }
  }
  return 0;
}


