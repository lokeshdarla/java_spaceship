package org.lokeshdarla.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private final Map<String, Student> map= new HashMap<>();
    void registerStudent(String key,Student student) {
        map.put(key, student);
    }
    Student getStudent(String key) {
        if(map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }
}
