package com.jinyi.ihome.module.user.mapper;

import com.jinyi.ihome.module.user.PersonTo;
import com.jinyi.ihome.module.user.domain.Person;

/**
 * Created by warrior on 14/9/30.
 */
public class PersonMapper {
    public static PersonTo toTo(Person person) {
        PersonTo to = new PersonTo();
        to.setLastName(person.getLastName());
        to.setFirstName(person.getFirstName());
        to.setId(person.getId());
        return to;
    }
}
