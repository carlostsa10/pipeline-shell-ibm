package com.testePipeline.aprendendoPipeline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AprendendoPipelineApplicationTests {

	@Test
	void testandoCPFValido() {
		var valido = ValidadorCPF.validar("954.260.760-14");

		assertEquals(true, valido);
	}

	@Test
	void testandoCPFInvalido() {
		var valido = ValidadorCPF.validar("954.260.760-32");

		assertEquals(false, valido);
	}

}
