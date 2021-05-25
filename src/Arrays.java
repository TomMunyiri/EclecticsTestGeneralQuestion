import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Arrays {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        int[] input = {3, 5, -4, 8,11,1,-1,6};
        int targetSum = 10;
        System.out.println(arrays.twoNumSum(input, targetSum));
    }

    public List<Integer> twoNumSum(int[] array, int targetSum) {

        List<Integer> ans = new ArrayList<>();

        IntStream.range(0,array.length).forEachOrdered(n->{
            int firstNum=array[n];
            IntStream.range(n+1,array.length).forEachOrdered(j->{
                int secondNum=array[j];
                int sum=(firstNum+secondNum);
                if(sum==targetSum){
                    ans.add(firstNum);
                    ans.add(secondNum);
                }
            });
        });

        return ans;
    }
}
