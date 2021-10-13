import java.util.Random;

public class PlusGame implements iGame {

	private Random rd;
	private int num1;
	private int num2;

	
	@Override
	public void makeRandom() {
		rd = new Random();
		num1=rd.nextInt(9)+1;
		num2=rd.nextInt(9)+1;
		
	}

	@Override
	public String getQuizMsg() {
		
		 return num1+"+"+num2+"=";
	}

	@Override
	public boolean checkAnswer(int answer) {
		
		return(answer==(num1+num2))  ? true:false;
	}
	
	
}
