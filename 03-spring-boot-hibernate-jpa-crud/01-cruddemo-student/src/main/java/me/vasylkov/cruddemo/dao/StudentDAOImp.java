package me.vasylkov.cruddemo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.vasylkov.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImp implements StudentDAO
{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImp(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student)
    {
        entityManager.persist(student);
    }
}
