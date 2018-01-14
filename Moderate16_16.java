import java.util.*;


public class Moderate16_16{
    public static void main(String [] args){
        int []  input ={ 2,-8,3,-2,4,-10};
        Moderate16_16 m =new Moderate16_16();
        System.out.println(m.getMax(input));
    }

    public int  getMax(int [] input){
        int sum = input[0], maxSum = Integer.MIN_VALUE;
        for(int i = 1; i< input.length; i++){
            if(input[i] + sum < 0)
                sum = 0;
            else{
                sum = input[i]+sum;
                maxSum = maxSum<sum ? sum : maxSum ;
            }
        }
        return maxSum;
    }
}