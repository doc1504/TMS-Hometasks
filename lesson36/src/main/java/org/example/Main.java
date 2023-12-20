package org.example;
import org.example.domain.PersonEntity;
import org.example.domain.Role;
import org.example.domain.Status;
import org.example.domain.TaskEntity;
import org.example.dto.PersonSearchDto;
import org.example.service.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();
        TaskService taskService = new TaskServiceImpl();
        PersonEntity person1 = PersonEntity.builder()
                .name("Person1")
                .role(Role.ADMIN)
                .isMan(true)
                .birthday(LocalDate.of(1980, 12, 01))
                .build();
        PersonEntity person2 = PersonEntity.builder()
                .name("Person2")
                .role(Role.SUPPORT)
                .isMan(true)
                .birthday(LocalDate.of(1990, 01, 01))
                .build();
        personService.save(person1);
        personService.save(person2);
        TaskEntity task1 = TaskEntity.builder().task("TO CALL").status(Status.IN_PROGRESS).build();
        TaskEntity task2 = TaskEntity.builder().task("TO CHECK").status(Status.DONE).build();
        TaskEntity task3 = TaskEntity.builder().task("TO ANSWER").status(Status.NEW).build();
        TaskEntity task4 = TaskEntity.builder().task("CALL").status(Status.IN_PROGRESS).build();
        taskService.save(task1);
        taskService.save(task2);
        taskService.save(task3);
        taskService.save(task4);
        person1.addTask(task1);
        person1.addTask(task2);
        person2.addTask(task3);
        person2.addTask(task4);
        taskService.update(task1);
        taskService.update(task2);
        taskService.update(task3);
        taskService.update(task4);
        PersonSearchDto personSearch = PersonSearchDto.builder()
                .startBirthday(LocalDate.of(1985, 01, 01))
                .endBirthday(LocalDate.of(2000, 01, 01))
                .role(Role.ADMIN)
                .taskStatus(Status.NEW)
                .build();
        personService.findPersonByBirthday(personSearch).forEach(System.out::println);
        personService.findPersonByRole(personSearch).forEach(System.out::println);
        personService.findPersonByTaskStatus(personSearch).forEach(System.out::println);
    }
}