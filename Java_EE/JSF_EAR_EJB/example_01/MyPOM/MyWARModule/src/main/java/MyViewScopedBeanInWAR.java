import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MyViewScopedBeanInWAR extends MyCounter implements Serializable {
	
	private static final long serialVersionUID = 1L;

}
