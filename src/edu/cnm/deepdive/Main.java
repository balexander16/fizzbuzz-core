package edu.cnm.deepdive;

/**
 * Exercises the method of the {@link FizzBuzz} class.
 *
 * @author Brian Alexander &amp; Deep Dive Coding Java+Android Cohort 7.
 * @version 1.0.0
 */
public class Main {

  private Main(){} //This is a constructor! Work around until we understand better.
  /**
   * Computes and displays fizz buzz values corresponding to the input values 1&ndash;100.
   *
   * @param args Command line arguments(ignored).
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++){
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }

}
