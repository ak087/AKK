import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TaskFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOne=new ArrayList<String>();
		List<String> listTwo=new ArrayList<String>();
		listOne.add("AK1");
		listOne.add("Ak2");
		listOne.add("AK1");
		listOne.add("Ak2");
		listOne.add("Ak3");
		listOne.add("Ak4");
		listOne.add("Ak1");
		listOne.add("Ak2");
		System.out.println(listOne);
		listOne.stream().collect(Collectors.groupingBy());
	}

}
