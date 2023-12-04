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
        personDao.savePerson(person1);
        personDao.savePerson(person2);
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
        taskDao.saveTask(task1);
        taskDao.saveTask(task2);
        taskDao.saveTask(task3);
        taskDao.saveTask(task4);
        taskDao.addTask(task1, person1);
        taskDao.addTask(task2, person2);
        taskDao.addTask(task3, person1);
        taskDao.addTask(task4, person2);
        task1.setStatus(Status.IN_PROGRESS);
        taskDao.updateTask(task1);
        task4.setStatus(Status.DONE);
        taskDao.updateTask(task4);

        taskDao.getTaskByPerson("Person2");
        personDao.getPersonByTask();

        personDao.deletePersonById(1);
        personDao.deletePersonById(2);





    }
}