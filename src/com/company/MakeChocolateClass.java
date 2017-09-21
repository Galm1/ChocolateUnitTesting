package com.company;

public class MakeChocolateClass {

    public static int makeChocolate (int small, int large, int goal) {


        double numLargeBarsReq= Math.floor(goal/5);

        if (large >= numLargeBarsReq){
            //we have enough large bars
            int smallBarsNeeded = goal%5;
            if(small >= smallBarsNeeded){
                return smallBarsNeeded;
            } else {
                return -1;
            }
        } else {
           if (goal - large * 5 <= small){
               return goal - large * 5;
           } else{
               return -1;
           }
        }
    }
}
