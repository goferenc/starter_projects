import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MySessionScopedBeanInWAR extends MyCounter implements Serializable {

	private static final long serialVersionUID = 1L;

}
