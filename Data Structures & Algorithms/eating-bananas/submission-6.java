class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxEatingHours=Max(piles);


        for(int i=1;i<=maxEatingHours;i++){

            int Timetaken=Hours(piles,i);

            if(Timetaken<=h){
                return i;
            }
        }
        return maxEatingHours;
    }


    public static  int  Max(int arr[]){
        int maxE=Integer.MIN_VALUE;

        for(int e:arr){
            maxE=Math.max(maxE,e);
        }

        return maxE;
    }

    public static  int Hours(int arr[],int per){

        int ratio=0;

        for(int e:arr){
            ratio+=Math.ceil((double)e/per);
        }

        return ratio;
    }
}
