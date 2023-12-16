package org.example;

import org.example.domain.PersonEntity;
import org.example.domain.Role;
import org.example.domain.Status;
import org.example.domain.TaskEntity;
import org.example.service.PersonDao;
import org.example.service.PersonDaoImpl;
import org.example.service.TaskDao;
import org.example.service.TaskDaoImpl;

public class Main {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDaoImpl();
        TaskDao taskDao = new TaskDaoImpl();
        PersonEntity person1 = PersonEntity.builder()
                .name("Person1")
                .role(Role.USER)
                .birthday("10-01-1990")
                .isMan(true)
                .build();
        PersonEntity person2 = PersonEntity.builder()
                .name("Person2")
                .role(Role.SUPPORT)
                .birthday("01-02-1980")
                .isMan(true)
                .build();
        personDao.save(person1);
        personDao.save(person2);
        TaskEntity task1 = TaskEntity.builder()
                .task("CALL")
                .definition("To call users")
                .status(Status.NEW)
                .build();
        TaskEntity task2 = TaskEntity.builder()
                .task("EMAIL")
                .definition("To send emails")
                .status(Status.DONE)
                .build();
        TaskEntity task3 = TaskEntity.builder()
                .task("CHECK")
                .definition("To check emails")
                .status(Status.IN_PROGRESS)
                .build();
        TaskEntity task4 = TaskEntity.builder()
                .task("MEETING")
                .definition("To meet with users")
                .status(Status.NEW)
                .build();
        taskDao.save(task1);
        taskDao.save(task2);
        taskDao.save(task3);
        taskDao.save(task4);
        person1.addTask(task1);
        taskDao.update(task1);
        person1.addTask(task2);
        taskDao.update(task2);
        person2.addTask(task3);
        taskDao.update(task3);
        person2.addTask(task4);
        taskDao.update(task4);
        task1.setStatus(Status.IN_PROGRESS);
        taskDao.update(task1);
        task4.setStatus(Status.DONE);
        taskDao.update(task4);

        taskDao.getTaskByPerson("Person2");
        personDao.findPersonWithActiveTask();

        personDao.deletePersonById(1);
        personDao.deletePersonById(2);





    }
}