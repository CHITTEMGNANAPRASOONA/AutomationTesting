package Capgemini.Training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    /*@Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);*/
	public static void main(String[] args) {
		App app=new App();
		String regex="^(.+)@(.+)$";
		String email=app.userEmail("abcgmail.com");
		Pattern pattern=Pattern.compile(regex);
		
		Matcher match=pattern.matcher(email);
		System.out.println(email);
		System.out.println("Is it match::"+match.matches());
		
	    String pwd=app.userPassword("87676");
		
		//app.Login()
		
        String reg = "^\\d+$";
        Pattern pat = Pattern.compile(reg);
        Matcher matche = pat.matcher(pwd);
        System.out.println(pwd);
		System.out.println("Is it match::"+matche.matches());
		
		 
    }
	
	
}
