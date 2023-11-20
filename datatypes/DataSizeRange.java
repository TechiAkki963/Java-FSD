import java.lang.*;

public class DataSizeRange{
    public static void main(String args[]){
        //**In Java for every datatype there is a built-in class 
        //todo: to check the range value of a datatype , in cmd / terminal : javap java.lang.Integer

        System.out.println("Int Min :" + Integer.MIN_VALUE);    //**Output:-2147483648 */
        System.out.println("Int Max :" + Integer.MAX_VALUE);    //**Output:2147483647  */
        System.out.println("Int Bytes :" + Integer.BYTES);      //**Output: 4 bytes */


    }
}