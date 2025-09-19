package HW;

public class DeclareVariables {
    public static void main(String[] args) {
        byte age = 21;
        short salary = 21202;
        int number = 213228694;
        long longNumber = 21322899496L;
        float decimalNumber = 5124.4326F;
        double biggerDecimalNumber = 733.3123124;
        char A= 'A';
        boolean isTrue = false;
        System.out.println(age);
        System.out.println(salary);
        System.out.println(number);
        System.out.println(longNumber);
        System.out.println(decimalNumber);
        System.out.println(biggerDecimalNumber);
        System.out.println(A);
        System.out.println(isTrue);


//        age = 213;
//        salary = 762213;
//        number = 4564545444;
//        longNumber = 45645623445634534762L;
//        decimalNumber = 5134456273842903844562042304992243572143.4326F;
//        A= 'A2';
//        isTrue = 2;

        // LOOKS LIKE COMPUTER DOESNT SAY ITS TOO MUCH FOR DOUBLE
        biggerDecimalNumber = 7367345629186398120764891726409126403209745983275982374902368794230978427863947092346982387564827936040983247612312312453464576578567546745546586568678345345783457686898756778678235456334512312353463.312318769678634534241298379128741274598712403798127846978128649812409712089421786312;
        // BUT IT DOESNT SHOW FULL NUMBER THAT I PUT IN DOUBLE VARIABLE
        System.out.println(biggerDecimalNumber);

    }
}
