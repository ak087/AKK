import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;


public class TaskOne {

	public static void main(String[] args) {
		List<Integer> listOne=new ArrayList<Integer>();
		listOne.add(1);
		listOne.add(2);
		listOne.add(3);
		listOne.add(4);
		listOne.add(5);
		long sum = listOne.stream().mapToInt((value) -> value).summaryStatistics().getSum();
		System.out.println(sum);
		//2..
		//IntSummaryStatistics stats = listOne.stream().mapToInt((x) -> x).summaryStatistics();
		//System.out.println(stats.getSum());
	}
}
