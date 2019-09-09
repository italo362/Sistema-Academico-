package edu.ifal.academico.controle;

import edu.ifal.academico.modelo.Disciplina;
import edu.ifal.academico.modelo.Estudante;

public class CriadorDeDisciplina {

	private Disciplina disciplina;

	public CriadorDeDisciplina() {
		super();
	}
	
	public CriadorDeDisciplina nome (Disciplina disciplina) {
		this.disciplina = new Disciplina("GQSO");
		return this;
	}
	public CriadorDeDisciplina matricula (Estudante estudante) {
		this.disciplina.addEstudante(estudante);
		return this;	
	}
	public Disciplina Constroi () {
		return this.disciplina;
	}
}
