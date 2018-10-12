import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> technologySet= new TreeSet<String>();
		technologySet.add("Java");
		technologySet.add("C");
		technologySet.add("C++");
		System.out.println("Technologies list"+ technologySet);
		for(String technology: technologySet){
			System.out.println(technology);
		}
		

	}

}
