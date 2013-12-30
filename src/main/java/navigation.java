
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

public class navigation {
    
    private boolean ab;
    private boolean bc;
    private boolean cd;
    private boolean de;

    public void sr(boolean a ,boolean b,boolean c,boolean d)
    {
     ab=a;
     bc=b;
     cd=c;
     de=d;
    }
    public boolean getAb() {
        return ab;
    }

    public void setAb(boolean ab) {
        this.ab = ab;
    }
    public boolean getBc() {
        return bc;
    }

    public void setBc(boolean bc) {
        this.bc = ab;
    }
    
    public boolean getcd() {
        return cd;
    }

    public void setCd(boolean cd) {
        this.cd = cd;
    }
    public boolean getDe() {
        return de;
    }

    public void setDe(boolean de) {
        this.de = de;
    }
}
