package curso.springboot.enumerador;

public enum Perfil {
	
	PROFESSOR("Professor"), ALUNO("Aluno");
	
	public String descricao;
	
	Perfil(String valor){
		descricao = valor;
	}

	public String getPerfil() {
		return descricao;
	}	
}
