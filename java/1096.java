public class Main {
	public static void main(String[] args) {
		int i = 1, j = 8;
		for(i = 1, j = 8; i <= 9; i += 2){
		    System.out.printf("I=%d ", i);
		    if(j > 5){
		        j = j - 1;
		        System.out.printf("J=%d\n", j);
		        if(j == 5){
		            j = 8;
		        }
		    }
		    System.out.printf("I=%d ", i);
		    if(j > 5){
		        j = j - 1;
		        System.out.printf("J=%d\n", j);
		        if(j == 5){
		            j = 8;
		        }
		    }
		    System.out.printf("I=%d ", i);
		    if(j > 5){
		        j = j - 1;
		        System.out.printf("J=%d\n", j);
		        if(j == 5){
		            j = 8;
		        }
		    }
		}
	}
}