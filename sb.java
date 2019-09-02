
import java.util.Scanner;
public class sb {

	public static void main(String[] args) {
int age;
double weight;
Scanner scanner=new Scanner(System.in);

System.out.print("请问你的年龄");
age=scanner.nextInt();
System.out.print("请问你的体重");
weight=scanner.nextDouble();



System.out.println("你的年龄是"+age+"岁，你的体重是"+weight+"公斤");
	}

}
