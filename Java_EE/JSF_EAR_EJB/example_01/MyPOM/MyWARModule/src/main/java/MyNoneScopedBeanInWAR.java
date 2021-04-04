import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

@ManagedBean
@NoneScoped
public class MyNoneScopedBeanInWAR extends MyCounter implements Serializable {
	
	private static final long serialVersionUID = 1L;

}
