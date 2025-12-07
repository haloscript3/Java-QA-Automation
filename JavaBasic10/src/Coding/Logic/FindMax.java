package Coding.Logic;

public class FindMax {
    public static void main(String[] args) {
        int[] num = {2, 1, 3, 0, 44, 6,1231,1232,1230,9999,43,3};
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] > max) {
                max2=max;
                max = num[i];
            }
            if (num[i]> max2 && num[i] < max)
                max2=num[i];
        }
            

        System.out.println(max + " " + max2);
    }
}
