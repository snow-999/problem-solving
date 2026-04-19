//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] nums = {1,1,2};
    int m = 3;
    System.out.println(removeDuplicates(nums));
}
public int removeDuplicates(int[] nums) {
    int duplicateCount = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            duplicateCount++;
        } else {
            nums[i - duplicateCount] = nums[i];
        }
    }
    return duplicateCount;
}
