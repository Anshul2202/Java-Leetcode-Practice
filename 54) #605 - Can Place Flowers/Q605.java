class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n == 0){
            return true;
        }


        int idx = 0;
        
        while(idx < flowerbed.length){

            if(flowerbed[idx] == 1){
                idx += 2;
            }

            if(idx < flowerbed.length && flowerbed[idx] == 0){
                
                if(idx + 1 == flowerbed.length ||  flowerbed[idx + 1] != 1){
                    n--;
                    idx += 2;
                }
                else{
                    idx += 3;
                }

                
            }

            if(n == 0){
                return true;
            }

        }

        return false;
    }
}