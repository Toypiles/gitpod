import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 가로길이
		int m = scanner.nextInt(); // 세로길이
		int mul = n*m;
		if(mul%3==0){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
        scanner.close();
	}
	
}