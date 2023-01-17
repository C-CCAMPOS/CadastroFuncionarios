package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarDados(Funcionario funcionario) throws Exception {
		
		PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario.txt");
		
		printWriter.write("\nID: " + funcionario.getIdFuncionario());
		printWriter.write("\nNome: " + funcionario.getNome());
		printWriter.write("\nCpf: " + funcionario.getCpf());
		printWriter.write("\nMatricula: " + funcionario.getMatricula());
		printWriter.write("\nSalário: " + funcionario.getSalario());
		
		printWriter.flush();
		printWriter.close();
	}
	
}
