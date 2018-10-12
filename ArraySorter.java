import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[]={69,32,58,48,59};
		for(int score:scores){//for each loop
			System.out.println(score);
		}
		Arrays.sort(scores);
		for(int score:scores){//for each loop
			System.out.print(score+" ");
		}
		
	}

}
