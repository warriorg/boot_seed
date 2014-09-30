package com.jinyi.ihome.module.user.repository;

import com.jinyi.ihome.module.user.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by warrior on 14/9/29.
 */

public interface PersonRepository extends JpaRepository<Person, Long> {

}
