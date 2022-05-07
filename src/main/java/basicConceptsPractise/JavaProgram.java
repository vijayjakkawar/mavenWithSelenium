package basicConceptsPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProgram {

	public static void main(String[] args) {
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */
		
		// 1 2 3 6 12 24
		int n=1, n1=2,sum=0 , sum1=0;
		System.out.print(n+"  "+n1);
		for(int i=2; i<=10; i++)
		{
			sum=sum+i;
			System.out.print(" "+sum+" ");
			
		}
		n=n1;
		n1=sum;

	}

}
