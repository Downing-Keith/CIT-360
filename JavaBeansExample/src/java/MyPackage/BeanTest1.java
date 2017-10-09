package MyPackage;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author Keith Downing
 */
public class BeanTest1 implements Serializable{
    private int roll;
    private String snm;
    private String city;
    
    public BeanTest1() {
        
    }
    public void setRoll(int r) {
        this.roll=r;
    }
    public void setSnm(String nm){
        this.snm=nm;
    }
    public void setCity(String c) {
        this.city=c;
    }
    public int getRoll() {
        return roll;
    }
    public String getSnm() {
        return snm;
    }
    public String getCity() {
        return city;
    }
}
