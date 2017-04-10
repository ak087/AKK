import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TaskThree {

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
		listOne.stream().forEach(iteratorOne->{if(listOne.indexOf(iteratorOne) % 2 != 0)	{
			listTwo.add(iteratorOne);
			}			});
		System.out.println(listTwo);
	}

}
