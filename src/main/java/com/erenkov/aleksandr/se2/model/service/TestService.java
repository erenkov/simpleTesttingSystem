package main.java.com.erenkov.aleksandr.se2.model.service;

import main.java.com.erenkov.aleksandr.se2.model.entity.Test;

public interface TestService {

    Test findTestById(Long id);

    Test findTestByName(String name);

    boolean saveAndFlushTest(Test test);

    boolean deleteTest(Test test);

}
