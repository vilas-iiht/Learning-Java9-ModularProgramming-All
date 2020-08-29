package com.iiht.java9.javainheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.iiht.java9.javainheritance.Actress;
import com.iiht.java9.javainheritance.Person;
import com.iiht.java9.javainheritance.Waitress;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
class JavaInheritanceTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void givenWaitressInstance_whenCheckedType_thenIsInstanceOfPerson() {
	    assertThat(new Waitress("Mary", "mary@domain.com", 22))
	      .isInstanceOf(Person.class);
	}
	    
	@Test
	public void givenActressInstance_whenCheckedType_thenIsInstanceOfPerson() {
	    assertThat(new Actress("Susan", "susan@domain.com", 30))
	      .isInstanceOf(Person.class);
	}

}
