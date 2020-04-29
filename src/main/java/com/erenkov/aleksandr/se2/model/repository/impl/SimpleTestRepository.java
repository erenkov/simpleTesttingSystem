package main.java.com.erenkov.aleksandr.se2.model.repository.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.Test;
import main.java.com.erenkov.aleksandr.se2.model.repository.TestRepository;
import main.java.com.erenkov.aleksandr.se2.utils.Generator;

import java.util.HashSet;

public class SimpleTestRepository implements TestRepository {

    private HashSet<Test> tests = Generator.generateTests();


    @Override
    public Test findTestById(Long id) {
        return tests.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(new Test());
    }

    @Override
    public Test findTestByName(String name) {
        return tests.stream()
                .filter(t -> t.getName().equals(name))
                .findFirst()
                .orElse(new Test());
    }

    @Override
    public boolean saveAndFlushTest(Test test) {
        return tests.add(test);
    }

    @Override
    public boolean deleteTest(Test test) {
        return tests.remove(test);
    }
}
