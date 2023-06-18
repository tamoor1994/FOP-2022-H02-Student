package h02;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
  public static final byte NUMBER_OF_STEPS_BETWEEN_REDUCTIONS = 10;

  public static int getRandomWorldSize() {
    return 4 + ThreadLocalRandom.current().nextInt(6);
  }

  // ---------------- DO NOT CHANGE ANYTHING ABOVE THIS LINE ---------------

  public static void main(String[] args) {
    int cols = getRandomWorldSize();
    int rows = getRandomWorldSize();
    World.setSize(cols, rows);
    World.setDelay(10);
    World.setVisible(true);
    System.out.println("Size of world: " + cols + "x" + rows);
    Robot[] allRobots = initializeRobots(cols, rows);
  }

  /**
   * Initializes allRobots array for given World size.
   *
   * @param cols number of columns in World
   * @param rows number of rows in World
   * @return correctly initialized allRobots array (i.e. correct size, correct positions, correct directions)
   */
  public static Robot[] initializeRobots(int cols, int rows) {
    int minimum = Math.min(cols, rows);
    int numberOfRobts = (minimum % 2 == 0) ? minimum : minimum - 1;
    Robot[] allRobots = new Robot[numberOfRobts];

    for (int i = 0; i < numberOfRobts; i++) {
        allRobots[i] = new Robot(i, i, (i < numberOfRobts / 2) ? Direction.RIGHT : Direction.LEFT, 1000);
    }
    return allRobots;
  }

  /**
   * Initializes paces array for given allRobots array.
   * <p>
   * Assumes allRobots array was initialized correctly.
   * </p>
   *
   * @param allRobots previously initialized allRobots array
   * @return correctly initialized paces array (i.e. correct size, filled w/ random integers from [1...5])
   */
  public static int[] initializePaces(Robot[] allRobots) {
    int arraySize = allRobots.length;
    int[] paces = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      paces[i] = ThreadLocalRandom.current().nextInt(1, 6);
    }
    return paces;
  }

  /**
   * Moves all robots from allRobots array corresponding to the number of steps to take for each robot (from paces).
   *
   * @param allRobots allRobots array from _main, contains all robots which should be moved by moveForward
   * @param paces     corresponding paces array to allRobots
   */
  public static void moveForward(Robot[] allRobots, int[] paces) {
  }

  /**
   * Generates three distinct integers from index set of allRobots.
   *
   * @param allRobots allRobots array from main method
   * @return array containing three distinct integers as described above
   */
  public static int[] generateThreeDistinctInts(Robot[] allRobots) {
    return null;
  }

  /**
   * Returns an integer array of size 3, in which i1, i2 and i3 are sorted in ascending order.
   * <p>
   * Assumes that i1, i2 and i3 are distinct.
   * </p>
   *
   * @param i1 first number
   * @param i2 second number
   * @param i3 third number
   * @return sorted array of i1, i2, i3 in ascending order
   */
  public static int[] orderThreeInts(int i1, int i2, int i3) {
    return null;
  }

  /**
   * Swaps entries from paces array as described in exercise sheet.
   * <p>
   * Assumes i1, i2 and i3 are three distinct indices from the index set of paces array.
   * Note that i1, i2 and i3 are not ordered.
   * </p>
   *
   * @param paces current paces array
   * @param i1    first index
   * @param i2    second index
   * @param i3    third index
   * @return paces array with identical entries as before, but in order as described in exercise sheet
   */
  public static int[] swapPaces(int[] paces, int i1, int i2, int i3) {
    return null;
  }

  /**
   * Reduces returns new array of robots which contains the same elements as allRobots, without the
   * robot at deleteIndex.
   * <p>
   * The new array's length is smaller by one compared to allRobots
   * </p>
   *
   * @param allRobots   allRobots array from _main
   * @param deleteIndex index at which the robot should be removed
   * @return reduced array (as described above)
   */
  public static Robot[] reduceRobots(Robot[] allRobots, int deleteIndex) {
    return null;
  }

  /**
   * Reduces returns new array of paces which contains the same elements as given paces array, without the
   * paces entry at deleteIndex.
   * <p>
   * The new array's length is smaller by one compared to given paces array
   * </p>
   *
   * @param paces       paces array from _main
   * @param deleteIndex index at which the paces entry should be removed
   * @return reduced array (as described above)
   */
  public static int[] reducePaces(int[] paces, int deleteIndex) {
    return null;
  }
}
