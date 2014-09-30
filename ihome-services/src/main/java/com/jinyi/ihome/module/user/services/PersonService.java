package com.jinyi.ihome.module.user.services;

import com.jinyi.ihome.module.user.PersonTo;

/**
 * Created by warrior on 14/9/29.
 */
public interface PersonService {
    PersonTo findById(long key);
}
