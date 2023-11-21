import java.lang.*;


public class  dataTypeDetail{
    public static void main(String args[]){

        int x = 5;
        System.out.println(Integer.toBinaryString(x));  //**Output: 101 */
        //? as per 8bits , the value for 5 is 0 0 0 0 0 1 0 1
        //?                                   2 2 2 2 2 2 2 2 power of 2


        int a = -5;
        System.out.println(Integer.toBinaryString(a));  //**Output: 11111111111111111111111111111011 */
        //? as per 8bits , the value for -5 is 1 0 1 1
        //? here we take 2's compliment        
    }
}

//? toBinaryString() is only available for INTEGER 
//? we can use it for SHORT and BYTE by converting them into INTEGER
//? But for Float and DOUBLE this method toBinaryString() is not available
