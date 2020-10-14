public class Main
{
	public static void main(String[] args) {
		double i = 0.0;
		double j = 0;
		for(i = 0; i <= 1.8; i = i){
		    if(i == 0 || i == 1){
		        System.out.printf("I=%.0f ", i);
        	    System.out.printf("J=%.0f\n", j + 1);
        	    System.out.printf("I=%.0f ", i);
        	    System.out.printf("J=%.0f\n", j + 2);
        	    System.out.printf("I=%.0f ", i);
        	    System.out.printf("J=%.0f\n", j + 3);
		    }
		    if(i <= 0.10 && i > 0){
		        i++;
		    }
		    if(i <= 2 && j < 3){
		        j = i;
		        if(j >= 3){
		           j = 1.0;
		           j = j + i;
		        }
		    }
		    if(i != 0 && i != 1 && i != 2){
    		    System.out.printf("I=%.1f ", i);
    		    System.out.printf("J=%.1f\n", j + 1);
    		    System.out.printf("I=%.1f ", i);
    		    System.out.printf("J=%.1f\n", j + 2);
    		    System.out.printf("I=%.1f ", i);
    		    System.out.printf("J=%.1f\n", j + 3);
		    }
		    i = i + 0.2;
		    if(i < 10 && i >= 8){
		        i = 1;
		        j = i + j;
		    }
		}
		System.out.printf("I=%.0f ", i + 0.2);
	    System.out.printf("J=%.0f\n", j + 0.2 + 1);
	    System.out.printf("I=%.0f ", i + 0.2);
	    System.out.printf("J=%.0f\n", j + 0.2 + 2);
	    System.out.printf("I=%.0f ", i + 0.2);
	    System.out.printf("J=%.0f\n", j + 0.2 + 3);
	}
}