package com.iiht.java9.javacomposition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.iiht.java9.javainheritance.Actress;
import com.iiht.java9.javainheritance.Person;
import com.iiht.java9.javainheritance.Waitress;
import com.iiht.java9.yaksha.TestUtils;

import java.io.IOException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
class JavaCompositionTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void givenComputerInstance_whenExtractedEachField_thenThreeAssertions() {
        Computer computer = new Computer(new StandardProcessor("Intel I3"), new StandardMemory("Kingston", "1TB"));
        computer.setSoundCard(new StandardSoundCard("Generic Sound Card"));
        try {
			TestUtils.yakshaAssert(TestUtils.currentTest(), (computer.getProcessor() instanceof Processor ? "true":"false"), TestUtils.businessTestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        //assertThat(computer.getProcessor()).isInstanceOf(Processor.class);
        //assertThat(computer.getMemory()).isInstanceOf(Memory.class);
        //assertThat(computer.getSoundCard()).isInstanceOf(Optional.class);
    }

}
