package Coding.Arrays_2;

public class Compute {
    public static void main(String[] args) {
        int k, total = 0;k = 1;

        while (k<=50)
        {
            total += k *k;
            k++;
        }
        System.out.println(total);
    }
}
