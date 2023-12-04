package org.example.service;

import org.example.config.HibernateConfig;
import org.example.domain.PersonEntity;
import org.example.domain.TaskEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class TaskDaoImpl implements TaskDao {
    private List<TaskEntity> tasks;
    @Override
    public void saveTask(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.save(task);
        transaction.commit();
        session.close();
    }
    public void addTask (TaskEntity task, PersonEntity person) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        if (tasks == null) {
            tasks = new ArrayList<>();
        }
        tasks.add(task);
        task.setPerson(person);
        updateTask(task);
        transaction.commit();
        session.close();
    }
    @Override
    public void updateTask(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.update(task);
        transaction.commit();
        session.close();
    }
    @Override
    public TaskEntity getTaskById(Integer id) {
        TaskEntity task = null;
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        task = session.get(TaskEntity.class, id);
        transaction.commit();
        session.close();
        return task;
    }

    @Override
    public void getTaskByPerson(String name) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        String hqlQuery = "from TaskEntity where person.name = ?1";
        Query<TaskEntity> query = session.createQuery(hqlQuery, TaskEntity.class);
        query.setParameter(1, name);
        query.list().forEach(System.out::println);
        transaction.commit();
        session.close();
    }
}
