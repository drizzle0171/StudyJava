import java.util.Scanner;
import java.util.Arrays;
public class BOJ_1546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] score = new int[N];
		
		for (int i=0; i<N; i++) {
			score[i] = input.nextInt();
		}
		//�ִ� ���ϱ�
		Arrays.sort(score);
		int M = score[N-1];
		//���� �ٽ� ����ϱ�
		
		double[] new_score = new double[N];

		for (int i=0; i<N; i++) {
			new_score[i] = (double)score[i]/M*100;
		}
		//��� ���ϱ�
		double result = Arrays.stream(new_score).sum()/N;

		System.out.println(result);
		
	}

}
