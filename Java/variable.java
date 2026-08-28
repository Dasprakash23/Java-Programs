// String - Store text, such as "Hello".String Values are surrounded by double quotes. For example, "Hello" is a string value.
//int - Store whole numbers, such as 123 or -123. Integer values are written without quotes. For example, 123 is an integer value.
//float - Store fractional numbers, such as 19.99 or -19.99.
//char - Store single characters, such as 'a' or 'B'. Char values are surrounded by single quotes. For example, 'a' is a char value.
//boolean - Store values with two states: true or false. Boolean values are written without quotes. For example, true is a boolean value.

public class variable {
    public static void main(String[] args) {
        // String variable
        String greeting = "Hello, World!";
        System.out.println(greeting);

        // int variable
        int age = 25;
        System.out.println("Age: " + age);

        // float variable
        float price = 19.99f;
        System.out.println("Price: $" + price);

        // char variable
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // boolean variable
        boolean isJavaFun = true;
        System.out.println("Is Java fun? " + isJavaFun);
    }
}