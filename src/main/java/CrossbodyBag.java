/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */
public class CrossbodyBag extends Bag{
    private final int numberOfStraps;
    /**
     * Creates a new CrossbodyBag with the given color and
     * capacity.
     *
     * @param color color for CrossbodyBag
     * @param capacity capacity for CrossbodyBag
     * @param numberOfStraps number of straps for CrossbodyBag
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        /*
         * This is how we call the parent's constructor
         * The Python equivalent is super().__init__(...)
         */
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    public int getNumberOfStraps() {
        return numberOfStraps;
    }

    /**
     * Return the details of this CrossbodyBag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return String
     */
    @Override
    public String toString() {
        return getColor() + " Crossbody Bag with " + this.numberOfStraps + " straps (" + getNumberOfContents() + " / " +
                getCapacity() + ")";
    }
    /**
     * Increase the capacity of this bag by 1.
     */
    @Override
    public void enhance() {
        /*
         *
         * To call a method defined in a parent, you use super.method_name(...)
         */
        super.increaseCapacity(2);
    }
}