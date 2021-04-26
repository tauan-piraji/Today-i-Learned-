package Main;

public class Principal {

	public static void main(String[] args) {
		Aluno guerra = new Aluno();
		guerra.bim1= 60;
		guerra.bim2= 55;
		guerra.bim3= 80;
		guerra.bim4= 85;
		
		System.out.println(guerra.Media());
		System.out.println(guerra.AprovaAluno());
	}
}
