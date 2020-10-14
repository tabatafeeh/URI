public class Main {
	public static void main(String[] args) {
		int i = 1, j = 60;
		for(i = 1, j = 60; j >= 0; i += 3, j -= 5){
		    System.out.printf("I=%d J=%d\n", i, j);
		}
	}
}