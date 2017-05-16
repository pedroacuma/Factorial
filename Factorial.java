
public class Factorial {
	public static int calcular(int input){
		if(input == 0){
			return 1;
		} else{
			return input*calcular(input-1);
		}
	}
}
