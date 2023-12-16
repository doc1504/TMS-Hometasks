package org.example.service;
import org.example.config.HibernateConfig;
import org.example.domain.PersonEntity;
import org.example.dto.PersonSearchDto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import java.util.List;
import java.util.Objects;
public class PersonServiceImpl implements PersonService {
    @Override
    public void save(PersonEntity person) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }
    @Override
    public void update(PersonEntity person) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();
        session.close();
    }
    @Override
    public List<PersonEntity> findPersonByBirthday(PersonSearchDto personSearch) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(PersonEntity.class);
        List result;
        if (personSearch == null) {
            result = criteria.list();
        } else {
            if (personSearch.getStartBirthday() != null && personSearch.getEndBirthday() != null) {
                criteria.add(Restrictions.between("birthday", personSearch.getStartBirthday(),
                        personSearch.getEndBirthday()));
            }
            result = criteria.list();
        }
        transaction.commit();
        session.close();
        return result;
    }
    @Override
    public List<PersonEntity> findPersonByRole(PersonSearchDto personSearch) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(PersonEntity.class);
        List result;
        if (personSearch == null) {
            result = criteria.list();
        } else {
            if (Objects.nonNull(personSearch.getRole())) {
                criteria.add(Restrictions.eq("role", personSearch.getRole()));
            }
            result = criteria.list();
        }
        transaction.commit();
        session.close();
        return result;
    }

    @Override
    public List<PersonEntity> findPersonByTaskStatus(PersonSearchDto personSearch) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(PersonEntity.class, "pe");
        Criteria taskCriteria = criteria.createCriteria("pe.tasks", "pt");
        List result;
        if (personSearch == null) {
            result = taskCriteria.list();
        } else {
            taskCriteria.add(Restrictions.eq("pt.status", personSearch.getTaskStatus()));
            result = taskCriteria.list();
        }
        transaction.commit();
        session.close();
        return result;
    }

}
