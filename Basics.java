//In programming we are addressing Real world problems in Virtual world
//Read line by line to learn java here
//Java by Sun microsystems. Oracle bought Sun microsystems.
//Java is strongly typed language

//JDK contains JRE. JRE contains JVM
//Try to draw compilation flow diagram
//Java is Platform Independent because of JVM. 
//But JVM itself is platform dependent
//JVM needs to be told what is the first file so follow signature public static void main
//JVM will only understand the byte code -.class files
//JRE is runtime environment (Kitchen tools) - Libraries and Resources
//To run only JRE required. No need of JDK. So WORA.
//Compiler is part of JDK.



//Naming conventions:
// 1. Camel casing; A class and Interface should start with Capital
// 2. Variables and Methods starts with small
// 3. Constants: All Capitals


//How to check Java version? Currently I am using Java 17.
import java.util.Scanner;
class Basics{
    public static void main(String[] args) {

        //Varibales in Java - If you dont Initialise them you will get error
        int a = 5;
        int arr[] = {1,2,3,4};
        int arr1[] = new int[4];
        //Default values of array numbers are 0

        //Data types: Primitive and Non Primitive or Objects
        //Primitive: Integer; Double; Float; Char; Boolean
        //Primitive start with small.
        
        //Integer: Byte (1); Short(2); Int (4); Long(8)
        byte by = 3; //Caluclate its range both negative and positive
        short st = 10; //range?
        long ln = 50; // Convention is to mention 'l' at last
        System.out.println(ln);
        int bn = 0b101; //Its value is 5
        

        //Double (8); Float (4)
        //Default are doubles
        float ft = 5.6f;
        double lnum = 12e10; //Exponential - Check why 12e10 is only returning double
    
        //Char (2) - In C++ only 1 byte. Unicode vs ASCI value
        //UNICODE for all languages
        //Use only single quotes. Double quotes not allowed
        char ch = 'r'; 
 
        //Boolean - Only true and false not 1 and 0

        //Enhanced for loop vs for loop
        for (int i: arr1){
            //Do whatever you want
        }

        //Jagged Arrays - No need to have same size for all Arrays
        int jarr[][] = new int[3][];
        //But you should later assign sizes
        jarr[1] = new int[5];
        jarr[0] = new int[1];
        jarr[2] = new int[2];
        //Can I give array a size of 0?


        //Strings in Java - Immutable; It is a class
        String str = new String("Ajay");
        String str1 = "Ajay";
        //.charAt() function
        str1 += str; //works but it does not change the previous string but creates a new string object and assings that
        //For muttable strings you have to use StringBuilder or String Buffer
        //By default string values are null.
        //String objects are constants. String constant pool


        //Easy way to take input
        //Can also be done using InputStreamReader and Bufferreader but a bit complex
        Scanner sc = new Scanner(System.in);
        int next = sc.nextInt();


        //Output
        //Println is Method of PrintStream class
        //Out is Static and final object of the print stream. It is created in system class.


        //No need to write case infront of Default
        //What will happen if you do not write break?
        //2 cases should not match else error.
        switch(a){
            case 1: {
                System.out.println("Hello World" + 1);
                break;
            }
            case 5:{
                System.out.println("Hello World" + 5);
                break;
            }
            default:{
                System.out.println("Hello World" + "Default");
                break;
            }
        }


        //See the difference between && and &. || vs |
        //& <-- verifies both operands
        //&& <-- stops evaluating if the first operand evaluates to false since the result will be false
        //Second might throw an exception na in & case.
        //& is not safe sometimes. && is safe.


        //Conversion and Casting
        byte b = (byte)a; // Modulo range of byte will be assigned
        // directly writing b = a does not work
        //Assigning a byte to int is coversion - which is implicit.


    }

    //Exception
    //Types: Compilte time, Runtime, Logical 
    //Critical statements needs to be handled
    //An exception will stop execution - Which is a problem
    //You can create custom exceptions by extending the exception class.
    // Throw new ArithematicException();
    //What is Throwable - Not an Interface. It is a class of Exception
    //Always try to make parent exceptions at the bottom of all exceptions. Otherwise gives red marks.
    public int newDivision(){

        int a = 5, b = 0;
        try{
            int c = a/b;
        }
        catch (Exception ex){

        }
        finally{

        }


        return 0;
    }

    //Throws exception
    public int division () throws Exception{
        //It means that there is a possibility that this function can throw excpetion
        //You have to handle it in the higher level function
        return 0;
    }
}