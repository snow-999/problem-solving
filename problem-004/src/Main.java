//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] nums = {1,1,1,2,2,3};
    int m = 3;
    System.out.println(removeDuplicates(nums));
}
public int removeDuplicates(int[] nums) {
    int k = 0;

    for (int num : nums) {
        if (k < 2 || num != nums[k - 2]) {
            nums[k] = num;
            k++;
        }
    }

    return k;
}