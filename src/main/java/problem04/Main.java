package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		 int Num[] = new int [3];
	        int Chk[] = new int [3];
	        int Answer , i , j, Strike , Ball , Cnt;
	        Random r = new Random();
	        Scanner scanner = new Scanner(System.in);
	         
	        while(true) {
	            do {
	                Answer = r.nextInt(1000);
	                Num[0] = Answer / 100;
	                Num[1] = (Answer / 10) % 10;
	                Num[2] = Answer % 10;
	                if (Num[0]!=Num[1] && Num[1]!=Num[2] && Num[0]!=Num[2]) break;
	            }while(true);
	         
	            System.out.println("수를 결정하였습니다. 맞추어 보세요");
	            Cnt = 0;
	            while(true) {
	                Cnt = Cnt + 1;
	                System.out.println("세자리 숫자를 맞춰주세요");
	                System.out.print(Cnt+1+">>");
	                String  str;
	                int n=0;
	                try {
	                    str = scanner.nextLine();
	                    n = Integer.parseInt(str);
	                    if (str.length()!=3) {
	                        System.out.println("3자리 정수로 입력하셔야 합니다!!");
	                        continue;  
	                    }
	                    Chk[0] = n / 100;
	                    Chk[1] = (n / 10) % 10;
	                    Chk[2] = n % 10;
	                }
	                catch(NumberFormatException e) {
	                    System.out.println("정수만 입력하셔야 합니다!!");
	                    continue;
	                }
	                 
	                 
	                Strike = Ball = 0;
	                for(i=0;i<3;i++) {
	                    if (Num[i]==Chk[i]) Strike++;
	                }
	                for(i=0;i<3;i++) {
	                    for(j=0;j<3;j++) {
	                        if (i!=j && Num[i]==Chk[j]) Ball++;
	                    }
	                }
	                System.out.printf("S = %d , B = %d\n", Strike , Ball);
	                if (Strike==3) break;
	            }
	            System.out.print("다시하시겠습니까(y/n)>>");
	            if(scanner.next().equals("n"))
	                break;
	        }      
	         
	    }
	}
