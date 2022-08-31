package com.teste.testeUnidade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testePipeline.aprendendoPipeline.ValidadorCpf;

@SpringBootApplication
public class AprendendoPipelineApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite o CPF");

		BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        String cpf = reader.readLine();

		System.out.println("O CPF digitado é: " + 
			( ValidadorCpf.validar(cpf) ? "Válido" : "Inválido" )
		);
	}

}
