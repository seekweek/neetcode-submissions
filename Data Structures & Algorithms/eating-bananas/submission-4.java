class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int Max=getMax(piles);

        for(int koko=1;koko<=Max;koko++){

            // Step to find the total hours of Koko to eat all banana in piles

            int totalH=getTotalH(piles,koko);

            if(totalH<=h){
                return koko;
            }

        }
        return Max;
        
    }
    public static int getMax(int p[]){
        int max=p[0];

        for(int e:p){
            if(e>max){
                max=e;
            }
        }
        return max;
    }

    public static int getTotalH(int p[],int speed){
        int total=0;

        for(int e:p){
            total+=Math.ceil((double)e/speed);
        }
        return total;
    }
}
