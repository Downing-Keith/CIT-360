package mvcexample;

/*
 * @author Keith Downing
 */
import View.View;
//
import javax.swing.SwingUtilities;

public class MVCExample {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        new View();
    }

}
