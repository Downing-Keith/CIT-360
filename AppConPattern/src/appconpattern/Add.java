package appconpattern;

/**
 *
 * @author Keith Downing
 */
public class Add implements HandMath {
    
    public void execute(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        System.out.println(sum);
    }
}
