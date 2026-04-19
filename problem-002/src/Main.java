//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] nums1 = {3,2, 2, 3};
    int m = 3;
    System.out.println(removeElement(nums1, m));
}
public int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i =0; i < nums.length; i++) {
        if (val != nums[i]) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}
