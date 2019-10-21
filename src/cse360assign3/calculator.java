package cse360assign3;

public class calculator extends AddingMachine {

    /**
     * <p>The constructor AddingMachine() creates an object of type calculator that inherits from AddingMachine and initializes the value of the
     * private integer to 0</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename calculator.java
     */
    public calculator(){
        total = 0;
        record = "0 ";
    }

    /**
     * <p>Multiplies an integer value by the value stored in the private integer of a calculator type object.
     * Updates record string store in calculator class object</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     *
     * @param value - determines the value which is subtracted from the stored private integer
     */
    public void mult(int value){
        total = total * value;
        record = record + "* " + value + " ";

    }

    /**
     * <p>Divides an integer value into the value stored in the private integer of a calculator type object.
     * Updates record string store in calculator class object</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     *
     * @param value - determines the value which is subtracted from the stored private integer
     */
    public void div(int value){
        total = total / value;
        record = record + "/ " + value + " ";
    }

    /**
     * <p>Raises the value store in a calculator type object by the parameter value</p>
     * <p>Updates record string store in calculator class object</p>
     *
     * @author Kyle Stevens
     * @author 1214241534
     * @filename AddingMachine.java
     *
     * @param value - determines the value which is subtracted from the stored private integer
     */
    public void power(int value){
        total = total ^ value;
        record = record + "^ " + value + " ";
    }

}
