package org.example.service;

import org.example.domain.Phone;

import java.util.List;

public interface PhoneService {

    List<Phone> getPhones();

    void save (Phone phone);
}
