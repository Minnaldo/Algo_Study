package ����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baek_1026_����{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //�� �迭�� ���� ������ �ּҰ� �ǵ��� �ϴ¹���
        //list_A�� ������������ ����
        //list_B�� ������������ ����
        ArrayList<Integer> list_A = new ArrayList<>();
        ArrayList<Integer> list_B = new ArrayList<>();
        //Input
        for (int i = 0; i < N; i++) {			
        	list_A.add(sc.nextInt());
		}
        for (int i = 0; i < N; i++) {			
        	list_B.add(sc.nextInt());
		}
        //list_A �������� ����
        Collections.sort(list_A);
        //list_A�� ��������
        Collections.reverse(list_A);
        //list_B �������� ����
        Collections.sort(list_B);
        
        int sum =0;
        //�ּҰ� ����
        for (int i = 0; i < N; i++) {
			sum += list_A.get(i) *list_B.get(i);
		}
        //Output
        System.out.println(sum);
    }

}