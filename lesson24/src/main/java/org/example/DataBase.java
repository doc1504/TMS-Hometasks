package org.example;

import org.example.domain.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class DataBase {

   private static List<Phone> phones = new ArrayList<>();

    public void create (Phone phone) {
        phone.setId(UUID.randomUUID());
        phones.add(phone);
    }

    public List<Phone> getByModel (String model) {
        if (model == null || model.isBlank()){

            return phones;
        }
        return phones.stream()
                .filter(phone -> model.equals(phone.getModel()))
                .collect(Collectors.toList());
    }

    public void delete (UUID id) {
        Optional<Phone> first = phones.stream()
                .filter(phone -> phone.getId().equals(id))
                .findFirst();
        first.ifPresent(phone -> phones.remove(phone));
    }
}
