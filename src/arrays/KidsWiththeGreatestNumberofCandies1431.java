package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int max = 0;

        for(int c : candies){
            if (c > max) {
                max = c;
            }
        }

        for(int c : candies){
            list.add(c + extraCandies >= max);
        }

        return list;
    }

}
