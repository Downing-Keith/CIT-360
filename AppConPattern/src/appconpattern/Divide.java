/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconpattern;

/**
 *
 * @author Keith Downing
 */
public class Divide implements HandMath {

    public void execute(Integer num1, Integer num2) {
        Integer value = num1 / num2;
        System.out.println(value);
    }
}
