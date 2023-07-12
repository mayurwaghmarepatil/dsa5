import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution56 {

    public List<Integer> findDuplicatesLinearSpace(int[] nums) {

        List<Integer> resultSet = new ArrayList<>();


        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {


            if (uniqueSet.contains(num))
                resultSet.add(num);


            uniqueSet.add(num);
        }

        return resultSet;
    }

    public static void main(String[] args) {
        solution56 s56=new solution56();
        System.out.println(s56.findDuplicatesLinearSpace(new int[]{4,3,2,7,8,2,3,1}));

    }
}
