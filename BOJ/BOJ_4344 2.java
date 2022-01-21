import java.util.Scanner;

public class BOJ_4344 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] score; //뒤에 자잘구질한 거 안 붙여줘도 
        int test = in.nextInt();
        
        for (int i = 0; i<test;i++) {
        	int student = in.nextInt();
        	score = new int[student]; //배열 크기 지정(학생)
        	
        	double sum = 0; //성적 누적 합 변
        	
        	for (int j=0; j<student;j++) {
        		int val = in.nextInt();//성적 입력
        		score[j] = val;
        		sum += val; //성적 누적
        	}
        	
        	double mean = (sum/student) ;
        	double count = 0;
        	
        	for (int j = 0; j<student; j++) {
        		if(score[j] > mean) {
        			count ++;
        		}
        	}
        	
        	System.out.printf("%.3f%%\n", (count/student)*100);
        }
        in.close();
	}

}
