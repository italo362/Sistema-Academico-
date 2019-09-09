package edu.ifal.academico.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ifal.academico.modelo.Endereco;
import edu.ifal.academico.modelo.Estudante;

public class ControleNotasTest {

	private Estudante estudante;
	private Estudante estudante1;
	private Estudante estudante2;
	
	private  Estudante ControleNotas;
	private CriadorDeEstudante criadorDeEstudante;
 Endereco endereco;
	
	@Before
	public void incializacao() {
		 
		estudante1 = new Estudante();
		estudante2 = new Estudante();
		estudante = new Estudante();
		
		ControleNotas ControleNotas;

		CriadorDeEstudante criadorDeEstudante;
		 Endereco endereco;

	}
	
	@Test
	public void TestDeveFuncionarSeANotaForMaiorQue6() {
		
	
		ControleNotas.getMedia();
	
		double valoresperado = 5;
		double valorObtido = 6;
		
		assertEquals(valorObtido, valoresperado,0.001);

	}
	
	@Test
	public void TestNaoDeveFuncionarSeANotaFor6() {
		ControleNotas.getMedia();
		
		double valoresperado = 7;
		double valorObtido = 6;
		
		assertEquals(valorObtido, valoresperado,0.001);

	}
	
	@Test
	public void TestDeveFuncionarSeANotaForMenorQue6() {
		ControleNotas.getMedia();
		
		double valoresperado = 7;
		double valorObtido = 5;
		
		assertEquals(valorObtido, valoresperado,0.001);

	}
}
