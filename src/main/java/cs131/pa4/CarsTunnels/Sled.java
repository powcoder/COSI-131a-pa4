https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package cs131.pa4.CarsTunnels;

import cs131.pa4.Abstract.Direction;
import cs131.pa4.Abstract.Vehicle;

/**
 * A Sled is a slow Vehicle.
 * @author cs131a
 * 
 */
public class Sled extends Vehicle {

	/**
	 * Creates a new instance of the class Sled with the given name and direction
	 * @param name the name of the sled to create
	 * @param direction the direction of the sled to create
	 */
    public Sled(String name, Direction direction) {
        super(name, direction);
    }

    @Override
    protected int getDefaultSpeed() {
        return 4;
    }
    
    @Override
    public String toString() {
        return String.format("%s SLED %s", super.getDirection(), super.getName());
    }
}