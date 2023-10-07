package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ImplDAO implements IDAO{
    @Override
    public <T> List<T> getAll(String namedQuery, Class clazz) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            TypedQuery<T> query = em.createNamedQuery(namedQuery, clazz);
            return query.getResultList();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        finally {
            em.close();
        }
    }
}
