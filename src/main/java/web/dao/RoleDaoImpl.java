package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao{
    @Autowired
    private EntityManagerFactory emf;

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void createRole(Role role) {
        em.persist(role);
    }

    @Transactional
    @Override
    public Role readRole(int id) {
        Role r=em.find(Role.class,id);
        return r;
    }

    @Transactional
    @Override
    public void updateRole(Long id, String role)  {
        Role r=em.find(Role.class,id);
        r.setId(id);
        r.setRole(role);
    }

    @Transactional
    @Override
    public void removeRole(int id) {
        em.remove(em.find(Role.class,id));
    }

    @Override
    public List<Role> getRoles() {
        return em.createQuery("select r from Role r",Role.class).getResultList();
    }

    @Override
    public Role getRoleByName(String name) {
        return em.createQuery("select r from Role r where r.name=:role", Role.class).setParameter("role",name).getSingleResult();
    }
}
