import java.lang.*;

public class Variable{
    public static void main(String a[]){


        byte b = 6;
        System.out.println(b);  //**Output : 6 */

        b = 25;
        System.out.println(b); //**Output: 25 */

        // b=128;
        // System.out.println(b);
        //!.\Variable.java:13: error: incompatible types: possible lossy conversion from int to byte
        //! b=128;
        //!   ^
        //**error is because the range of Byte Datatype is -128 to 127 */
        
        b=127;
        System.out.println(b); /**Output: 127 */

        float x = 0.35f;
        System.out.println(x); //**Output: 0.35 */


        char c = 'A';
        System.out.println(c);  //**Output: A*/
    }
}