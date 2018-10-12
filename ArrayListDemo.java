import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> technologiesList= new ArrayList<String>();
		technologiesList.add("Java");
		technologiesList.add("C");
		technologiesList.add("C++");
		technologiesList.add("C");
		System.out.println("Technologies list "+ technologiesList);
		for(String technology:technologiesList){
			System.out.println(technology);
		}
		technologiesList.remove(1);
		for(String technology:technologiesList){
			System.out.println(technology);
		}
		Collections.sort(technologiesList);
		for(String technology:technologiesList){
			System.out.println(technology);
		}
	}

}
