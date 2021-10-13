import java.util.Random;

public class MinusGame implements iGame{
	
	private Random rd;
	private int num1;
	private int num2;
	private int num3;
	
	@Override
	public void makeRandom() {
		rd = new Random();
		num1 = rd.nextInt(9)+1;
		num2 = rd.nextInt(9)+1;
		num3 = 0;
		if (num1<num2) {
			num3=num1;
			num1=num2;
			num2=num3;
		}
	}

	@Override
	public String getQuizMsg() {
		return num1+" - "+num2+" = ";
	}

	@Override
	public boolean checkAnswer(int answer) {
		
		return (answer == (num1-num2)) ? true : false;
	}
	
	

}
