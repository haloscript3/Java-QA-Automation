package HW;

public class Odds1to50 {
    public static void main(String[] args) {
//        3. Print numbers from 1 to 50 except those that are divisible by 3.
        int i = 0;
        while(i<50)
        {
            if (!(i % 3 == 0)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
