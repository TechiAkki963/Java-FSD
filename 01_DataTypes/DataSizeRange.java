import java.lang.*;

public class DataSizeRange{
    public static void main(String args[]){
        //**In Java for every datatype there is a built-in class 


        //todo: to check the range value of a datatype (Integer) , in cmd / terminal : javap java.lang.Integer

        System.out.println("Int Min :" + Integer.MIN_VALUE);    //**Output:-2147483648 */
        System.out.println("Int Max :" + Integer.MAX_VALUE);    //**Output:2147483647  */
        System.out.println("Int Bytes :" + Integer.BYTES);      //**Output: 4 bytes */


         //todo: to check the range value of a datatype (Float), in cmd / terminal : javap java.lang.Float 

        System.out.println("Float Min :" + Float.MIN_VALUE);    //**Output: 1.4E-45 */
        System.out.println("Float Max :" + Float.MAX_VALUE);    //**Output: 3.4028235E38 */
        System.out.println("Float Bytes :" + Float.BYTES);      //**Output: 4 bytes */


        //todo: to check the range value of a datatype (Byte), in cmd / terminal : javap java.lang.Byte

        System.out.println("Byte Min :" + Byte.MIN_VALUE);  //**Output: -128 */
        System.out.println("Byte Max :" + Byte.MAX_VALUE);  //**Output: 127 */
        System.out.println("Byte Bytes :" + Byte.BYTES);    //**Output: 1 */

    }
}