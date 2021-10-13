import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {
		PlusGame pg;
		MinusGame mg;
		MulGame mug;
		DivGame dg;

		System.out.println("======== 계산게임 프로그램 ========");
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int num = 1;
		while (num == 1 || num == 2 || num == 3 || num == 4) {
			System.out.print("[1]더하기 [2]빼기 [3]곱하기 [4]나누기 [5]종료>>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				pg = new PlusGame();
				pg.makeRandom();
				for (int i = 0; i < 3; i++) {
					String quiz = pg.getQuizMsg();
					System.out.print(quiz);
					int answer = sc.nextInt();

					if (pg.checkAnswer(answer)) {
						System.out.println("잘 맞췄어요!");
						count++;
						pg.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("다시 생각해 볼까요?");
						} else if (i == 1) {
							System.out.println("한 번 더..!");
						} else {
							System.out.println("그냥 다음 문제로 넘어갈게요..");
						}
					}

				}
				break;
			case 2:
				mg = new MinusGame();
				mg.makeRandom();
				for (int i = 0; i < 3; i++) {
					String quiz = mg.getQuizMsg();
					System.out.print(quiz);
					int answer = sc.nextInt();

					if (mg.checkAnswer(answer)) {
						System.out.println("잘 맞췄어요!");
						count++;
						mg.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("다시 생각해 볼까요?");
						} else if (i == 1) {
							System.out.println("한 번 더..!");
						} else {
							System.out.println("그냥 다음 문제로 넘어갈게요..");
						}
					}

				}
				break;
			case 3:
				mug = new MulGame();
				mug.makeRandom();
				for (int i = 0; i < 3; i++) {
					String quiz = mug.getQuizMsg();
					System.out.print(quiz);
					int answer = sc.nextInt();

					if (mug.checkAnswer(answer)) {
						System.out.println("잘 맞췄어요!");
						count++;
						mug.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("다시 생각해 볼까요?");
						} else if (i == 1) {
							System.out.println("한 번 더..!");
						} else {
							System.out.println("그냥 다음 문제로 넘어갈게요..");
						}
					}

				}
				break;
			case 4:
				dg = new DivGame();
				dg.makeRandom();
				for (int i = 0; i < 3; i++) {
					String quiz = dg.getQuizMsg();
					System.out.print(quiz);
					int answer = sc.nextInt();

					if (dg.checkAnswer(answer)) {
						System.out.println("잘 맞췄어요!");
						count++;
						dg.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("다시 생각해 볼까요?");
						} else if (i == 1) {
							System.out.println("한 번 더..!");
						} else {
							System.out.println("그냥 다음 문제로 넘어갈게요..");
						}
					}

				}
				break;
			case 5:
				System.out.println("맞춘 문제 : " + count);
				System.out.println("프로그램을 종료합니다!");
				break;
			default:
				System.out.println("잘못된 번호를 선택하셨군요! 강제종료됩니다!");
			}

		}

	}

}
