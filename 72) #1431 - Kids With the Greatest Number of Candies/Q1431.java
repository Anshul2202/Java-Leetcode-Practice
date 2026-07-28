import java.util.*;

class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int greatestCandies = 0;
        List<Boolean> list = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            if(candies[i] > greatestCandies) greatestCandies = candies[i];
        }

        for(int i = 0; i < candies.length; i++){

            if(candies[i] + extraCandies >= greatestCandies) list.add(true);
            else list.add(false);

        }

        return list;
    }
}