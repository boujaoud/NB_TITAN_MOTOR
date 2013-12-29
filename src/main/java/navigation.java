
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamal
 */
@ManagedBean
@SessionScoped
public class navigation {
    
    private boolean ab=false;

    public void sr()
    {
     ab=true;
    }
    public boolean getAb() {
        return ab;
    }

    public void setAb(boolean ab) {
        this.ab = ab;
    }
    
    
}
