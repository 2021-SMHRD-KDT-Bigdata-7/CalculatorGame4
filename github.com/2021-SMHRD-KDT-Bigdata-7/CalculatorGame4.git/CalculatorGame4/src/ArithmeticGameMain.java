import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {
		PlusGame pg;
		MinusGame mg;
		MulGame mug;
		DivGame dg;

		System.out.println("======== ������ ���α׷� ========");
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int num = 1;
		while (num == 1 || num == 2 || num == 3 || num == 4) {
			System.out.print("[1]���ϱ� [2]���� [3]���ϱ� [4]������ [5]����>>>");
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
						System.out.println("�� ������!");
						count++;
						pg.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("�ٽ� ������ �����?");
						} else if (i == 1) {
							System.out.println("�� �� ��..!");
						} else {
							System.out.println("�׳� ���� ������ �Ѿ�Կ�..");
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
						System.out.println("�� ������!");
						count++;
						mg.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("�ٽ� ������ �����?");
						} else if (i == 1) {
							System.out.println("�� �� ��..!");
						} else {
							System.out.println("�׳� ���� ������ �Ѿ�Կ�..");
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
						System.out.println("�� ������!");
						count++;
						mug.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("�ٽ� ������ �����?");
						} else if (i == 1) {
							System.out.println("�� �� ��..!");
						} else {
							System.out.println("�׳� ���� ������ �Ѿ�Կ�..");
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
						System.out.println("�� ������!");
						count++;
						dg.makeRandom();
				
					} else {
						if (i == 0) {
							System.out.println("�ٽ� ������ �����?");
						} else if (i == 1) {
							System.out.println("�� �� ��..!");
						} else {
							System.out.println("�׳� ���� ������ �Ѿ�Կ�..");
						}
					}

				}
				break;
			case 5:
				System.out.println("���� ���� : " + count);
				System.out.println("���α׷��� �����մϴ�!");
				break;
			default:
				System.out.println("�߸��� ��ȣ�� �����ϼ̱���! ��������˴ϴ�!");
			}

		}

	}

}
