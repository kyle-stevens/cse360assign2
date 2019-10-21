/**
 * <p>AddingMachine is a public class that creates an AddingMachine object which stores one private integer variable.
 * AddingMachine contains 6 functions to apply to an AddingMachine object including</p>
 * <ul>
 *     <li>a constructor named AddingMachine()</li>
 *     <li>a function to get the value of the stored integer which returns an integer</li>
 *     <li>a function to add to the value stored in the class object integer</li>
 *     <li>a function to subtract from the value stored in the class object integer</li>
 *     <li>a function which returns a string value of the value stored in the objects private integer variable</li>
 *     <li>a function which resets the value of the private integer in the AddingMachine class</li>
 * </ul>
 *
 *
 * @author Kyle Stevens
 * @author 1214241534
 * @filename AddingMachine.java
 */

package cse360assign2;

public class AddingMachine {

    protected int total;
    protected String record;

    /**
     * <p>The constructor AddingMachine() creates an object of type AddingMachine and initializes the value of the
     * private integer to 0</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     */
    public AddingMachine ()
    {
        total = 0;  // not needed - included for clarity
        record = "0 ";
    }


    /**
     * <p>Returns the total value of the private integer of an object of type AddingMachine class</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     */
    public int getTotal () {
        return this.total;
    }


    /**
     * <p>Adds an integer value to the value stored in the private integer of an AddingMachine type object.
     * Updates record string store in AddingMachine class object</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     *
     * @param value - determines the value which is added to the private integer stored in an AddingMachine object
     */
    public void add (int value) {
        this.total = this.total + value;
        record = record + "+ "+value+" ";
    }


    /**
     * <p>Subtracts an integer value from the value stored in the private integer of an AddingMachine type object.
     * Updates record string store in AddingMachine class object</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     *
     * @param value - determines the value which is subtracted from the stored private integer
     */
    public void subtract (int value) {
        this.total = this.total - value;
        record = record + "- "+value+" ";
    }


    /**
     * <p>Returns the protected string value that records all operations performed on the
     * AddingMachine object</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     */
    public String toString ()
    {
        return this.record;
    }


    /**
     * <p>Clears the integer value stored in an AddingMachine class and sets it to 0</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     */
    public void clear() {

    }
}
