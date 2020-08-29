package com.iiht.java9.basiccomposition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.iiht.java9.basiccomposition.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaBasicCompositionTest {

    @DisplayName("Test Assignment2Test")
    @Test
    void testGet() {

    	Person person = new Person();
        long salary = person.getSalary();
		
		 assertEquals(salary, 1000L);
		
		
       
    }

}