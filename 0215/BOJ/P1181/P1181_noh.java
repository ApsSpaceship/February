import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<String> ts = new TreeSet<String>(new Comp());
		for (int i = 0; i < n; ++i)
			ts.add(sc.next());
		for (String str : ts)
			System.out.printf("%s\n", str);
	}
}

class Comp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() == o2.length())
			return o1.compareTo(o2);

		if (o1.length() > o2.length())
			return 1;
		else
			return -1;
	}
}
