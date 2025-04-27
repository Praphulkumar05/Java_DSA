import java.util.*;

public class Subset {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    void createSubset(int idx, int arr[]) {
        ans.add(new ArrayList<>(curr));
        for (int i = idx; i < arr.length; i++) {
            // curr.add(arr[i]);
            // createSubset(i + 1, arr);
            // curr.remove(curr.size() - 1);
            if(i==idx||arr[i-1]!=arr[i]){      ///this logic is for handleing the duplicate elements.....
                curr.add(arr[i]);
                createSubset(i+1, arr);
                curr.remove(curr.size()-1);
            }
        }

    }

    public List<List<Integer>> subset(int arr[]) {
        Arrays.sort(arr);   //for handleing the duplicate 
        createSubset(0, arr);
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        Subset obj = new Subset();
        List<List<Integer>> result = obj.subset(arr);

        
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

    }

}
