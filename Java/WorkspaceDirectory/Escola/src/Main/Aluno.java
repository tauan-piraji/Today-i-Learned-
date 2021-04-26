package Main;
public class Aluno {
	int bim1;
	int bim2;
	int bim3;
	int bim4;
	
	public int Media() {
		int total = 0;
		total += bim1;
		total += bim2;
		total += bim3;
		total += bim4;
		return total/4;
	}
	
	public boolean AprovaAluno() {
		if(Media()>69)
			return true;
		return false;
	}
}