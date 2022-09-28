
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int i = 1; i < strArray.length; i++) {
            strArray[i] = strArray[i] + strArray[i-1];
            System.out.println(strArray[i]);
        }
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i] + strArray[i+1];
        }
        if (i > 0) {
        System.println("-" + strArray[i]);
    }
}
