import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOne=new ArrayList<String>();
		List<String> listTwo=new ArrayList<String>();
		listOne.add("AK1");
		listOne.add("Ak2");
		listOne.add("AK3");
		listOne.add("Ak4");
		listOne.add("Ak5");
		listOne.add("Ak6");
		listOne.add("Ak7");
		System.out.println(listOne);
		listTwo = listOne.stream().limit(listOne.size()/2).collect(Collectors.toList());
		System.out.println(listTwo);
	}

}
