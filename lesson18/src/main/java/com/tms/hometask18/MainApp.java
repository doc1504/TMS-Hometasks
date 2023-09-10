package com.tms.hometask18;

import com.tms.hometask18.domain.City;
import com.tms.hometask18.domain.Student;
import com.tms.hometask18.service.CityService;
import com.tms.hometask18.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {

        StudentService service = new StudentService();
        CityService cityService = new CityService();

        City city1 = new City("Moscow");
        City city2 = new City("Gomel");
        Student student1 = new Student("student10", true, "Grodno");
        Student student2 = new Student("student11", false, "Moscow");
//        cityService.save(city1);
//        cityService.save(city2);
//        service.save(student1);
//        service.save(student2);
//        service.deleteById(10);
        cityService.deleteCity();


        List<Student> all = service.findAll();
        System.out.println(all);


    }


}
