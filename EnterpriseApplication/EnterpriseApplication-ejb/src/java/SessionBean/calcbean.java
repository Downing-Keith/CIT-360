
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author Keith Downing
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }

    
}
