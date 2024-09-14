import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}