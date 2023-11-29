package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.Phone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class PhoneServiceImpl implements PhoneService {

    List<Phone> phones = new ArrayList<>();
    @Override
    public List<Phone> getPhones() {
        return phones;
    }

    @Override
    public void save(Phone phone) {
        phones.add(phone);

    }
}
