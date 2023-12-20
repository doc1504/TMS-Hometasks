package org.example.service;
import org.example.config.HibernateConfig;
import org.example.domain.TaskEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TaskServiceImpl implements TaskService {
    @Override
    public void save(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.save(task);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.save(task);
        transaction.commit();
        session.close();
    }
}
