package gf.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.Transaction;

import gf.util.SessionUtil;

public abstract class Dao<T, Id extends Serializable> {
	
	private Session currentSession;
    
    private Transaction currentTransaction;
	
	public abstract void persist(T entity);
    
    public abstract void update(T entity);
     
    public abstract T findById(Id id);
     
    public abstract void delete(T entity);
     
    public abstract List<T> findAll();
     
    public abstract void deleteAll();

	public Session openCurrentSession() {
        currentSession = SessionUtil.getSession();
        return currentSession;
    }
 
    public Session openCurrentSessionwithTransaction() {
        currentSession = SessionUtil.getSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }
     
    public void closeCurrentSession() {
        currentSession.close();
    }
     
    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }
 
    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }
 
    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }
 
    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

}
