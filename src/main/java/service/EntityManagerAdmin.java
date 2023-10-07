package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.xml.stream.events.EntityReference;

public class EntityManagerAdmin {
    private static EntityManager instance;
    private static final String UNIDAD = "DEMOJPA";
    public static EntityManager getInstance() {
        if (instance == null) {
            EntityManagerFactory emf = Persistence
                    .createEntityManagerFactory(UNIDAD);
            return emf.createEntityManager();
        }
        return instance;
    }

    private EntityManagerAdmin(){}
}
