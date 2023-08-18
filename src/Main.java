import java.util.Scanner;

public class Main {
	static int desen(int n) {
		if (n<=0) {
			return n;
		}
		System.out.print(n+" ");
		return desen(n-5);
		}
	static int desen(int n, int i){
        if (n > i){
            return n;
        }
        System.out.print(n + " ");
        return desen(n+5, i);
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
    	System.out.print("Sayi Giriniz: ");
    	int n = inp.nextInt();
		desen(desen(n),n);
	}

}
