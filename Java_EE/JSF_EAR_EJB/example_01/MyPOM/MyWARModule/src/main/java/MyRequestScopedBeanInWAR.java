import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MyRequestScopedBeanInWAR extends MyCounter implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EJB
	private MyStatefulEJB myStatefulEJB;
	
	@EJB
	private MyStatelessEJB myStatelessEJB;
	
	@EJB
	private MySingletonEJB mySingletonEJB;
	
	/*
	@Request/View/Flow/Session/ApplicationScoped
	@CustomScoped/NoneScoped/Dependent
	Example: Session scoped can not have Request scoped ManagedProperty
	 */
	
	@ManagedProperty(value = "#{myApplicationScopedBeanInWAR}")
	private MyApplicationScopedBeanInWAR myApplicationScopedBeanInWAR;
	
	@ManagedProperty(value = "#{myNoneScopedBeanInWAR}")
	private MyNoneScopedBeanInWAR myNoneScopedBeanInWAR;

	@ManagedProperty(value = "#{mySessionScopedBeanInWAR}")
	private MySessionScopedBeanInWAR mySessionScopedBeanInWAR;

	@ManagedProperty(value = "#{myViewScopedBeanInWAR}")
	private MyViewScopedBeanInWAR myViewScopedBeanInWAR;
	
	public MyApplicationScopedBeanInWAR getMyApplicationScopedBeanInWAR() {
		return myApplicationScopedBeanInWAR;
	}

	public void setMyApplicationScopedBeanInWAR(MyApplicationScopedBeanInWAR myApplicationScopedBeanInWAR) {
		this.myApplicationScopedBeanInWAR = myApplicationScopedBeanInWAR;
	}

	public MyNoneScopedBeanInWAR getMyNoneScopedBeanInWAR() {
		return myNoneScopedBeanInWAR;
	}

	public void setMyNoneScopedBeanInWAR(MyNoneScopedBeanInWAR myNoneScopedBeanInWAR) {
		this.myNoneScopedBeanInWAR = myNoneScopedBeanInWAR;
	}

	public MySessionScopedBeanInWAR getMySessionScopedBeanInWAR() {
		return mySessionScopedBeanInWAR;
	}

	public void setMySessionScopedBeanInWAR(MySessionScopedBeanInWAR mySessionScopedBeanInWAR) {
		this.mySessionScopedBeanInWAR = mySessionScopedBeanInWAR;
	}

	public MyViewScopedBeanInWAR getMyViewScopedBeanInWAR() {
		return myViewScopedBeanInWAR;
	}

	public void setMyViewScopedBeanInWAR(MyViewScopedBeanInWAR myViewScopedBeanInWAR) {
		this.myViewScopedBeanInWAR = myViewScopedBeanInWAR;
	}

	/*
	@Request/View/Flow/Session/ApplicationScoped
	@CustomScoped/NoneScoped/Dependent
	 */
	public String getAllCount() {
		increase();
		myStatelessEJB.increase();
		myStatefulEJB.increase();
		mySingletonEJB.increase();
		myNoneScopedBeanInWAR.increase();
		myApplicationScopedBeanInWAR.increase();
		mySessionScopedBeanInWAR.increase();
		myViewScopedBeanInWAR.increase();
		return "mySingletonEJB : " + mySingletonEJB.getCount() + 
				", myStatelessEJB : " + myStatelessEJB.getCount() + 
				", myStatefulEJB : " + myStatefulEJB.getCount() + 
				", MyRequestScopedBeanInWAR : " + getCount() +
				", MyViewScopedBeanInWAR : " + myViewScopedBeanInWAR.getCount() +
				", MySessionScopedBeanInWAR : " + mySessionScopedBeanInWAR.getCount() +
				", MyApplicationScopedBeanInWAR : " + myApplicationScopedBeanInWAR.getCount() +
				", MyNoneScopedBeanInWAR : " + myNoneScopedBeanInWAR.getCount()
				;
	}
}
