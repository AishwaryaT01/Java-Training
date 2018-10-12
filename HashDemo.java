import java.util.HashSet;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> technologySet= new HashSet<String>();
		technologySet.add("Java");
		technologySet.add("C");
		technologySet.add("C++");
		System.out.println("Technologies list"+ technologySet);
		for(String technology: technologySet){
			System.out.println(technology);
		}
		

	}

}
