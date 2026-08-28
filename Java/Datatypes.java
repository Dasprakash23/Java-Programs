//Data Type	Description
//byte	Stores whole numbers from -128 to 127
//short	Stores whole numbers from -32,768 to 32,767
//int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
//boolean	Stores true or false values
//char	Stores a single character/letter or ASCII values

public class variable {
    public static void main(String[] args) {
        // byte
        byte myByte = 100;
        System.out.println("Byte value: " + myByte);

        // short
        short myShort = 30000;
        System.out.println("Short value: " + myShort);

        // int
        int myInt = 2000000000;
        System.out.println("Int value: " + myInt);

        // long
        long myLong = 9000000000000000000L;
        System.out.println("Long value: " + myLong);

        // float
        float myFloat = 5.75f;
        System.out.println("Float value: " + myFloat);

        // double
        double myDouble = 19.99d;
        System.out.println("Double value: " + myDouble);

        // boolean
        boolean myBoolean = true;
        System.out.println("Boolean value: " + myBoolean);

        // char
        char myChar = 'A';
        System.out.println("Char value: " + myChar);
    }
}
