import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class MyApplicationScopedBeanInWAR extends MyCounter implements Serializable {
	
	private static final long serialVersionUID = 1L;

}
