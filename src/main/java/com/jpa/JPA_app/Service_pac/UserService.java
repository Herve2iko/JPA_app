package com.jpa.JPA_app.Service_pac;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jpa.JPA_app.Entity_pac.User;

@Repository
@Transactional
public class UserService extends r {
    @PersistenceContext
    private EntityManager entityManager;

    public Long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}
