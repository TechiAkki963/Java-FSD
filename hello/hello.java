import java.lang.*; //**lang is package: Language package and mandatory package

public class hello //**Every Java program is inside a class, ClassName should be the same as FileName
    {
    public static void main(String a[])
    //**main(): main is method here
	//**main() should not return anything, so it should always be 'void'
	//**public: if we want anything to be visible /output outside the class it should always be 'public'.While running the code in JVM 
	//JVM will call the main() and main() is inside the 'class First' here. JvM should be able to see the main method that is why it has to be 'public'
	//static: when we create a class we always need an object to call it. to call a class without an object we use 'static'.So just by using the class name, it will call the function. here First.main().
	// String arg[] : Mandatory
    
    {
        System.out.println("Hello World");
        //**println() is a method
	    //**here the method 'println()' is inside the Object: 'out' which is inside the class: "System"
    }
}

//**to compile in cmd: javac fileName.java
//**in this case C:> javac First.java

//for running a program in JVM- Java Virtual Machine
//C:> Java First