import java.util.Random;

public class DivGame implements iGame{
	
	private Random ran;
	private int num1;
	private int num2;

	@Override
	public void makeRandom() {
		ran = new Random();
		num1 = ran.nextInt(9)+1;
		num2 = ran.nextInt(9)+1;
		while(true) {
			if(num1>num2&&num1%num2==0) {
				break;
			}else {
				num1 = ran.nextInt(9)+1;
				num2 = ran.nextInt(9)+1;
			}
		}
	}

	@Override
	public String getQuizMsg() {
		
		return num1 + "/" + num2 + "=";
	}

	@Override
	public boolean checkAnswer(int answer) {
		
		return (answer == (num1 / num2))? true : false;
	}

}
