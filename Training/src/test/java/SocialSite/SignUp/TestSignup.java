package SocialSite.SignUp;

public class TestSignup{
	public static void main(String[] args) {
		Signup up=new Signup();
		String a=up.UserName("John");

		String b=up.SurName("Smith");
		String c=up.DOB("2022/10/10");
		long d=up.PhNumber(9988888888l);
		if (a.equals("John")) {
			System.out.println(" test case passed");
		} else {
			System.out.println("test case failed");
		}
		if (b.equals("Smith")) {
			System.out.println(" test case passed");
		} else {
			System.out.println("test case failed");
		}
		if (c.equals("2022/10/10")) {
			System.out.println(" test case passed");
		} else {
			System.out.println("test case failed");
		}
		if (d==9988888888l) {
			System.out.println(" test case passed");
		} else {
			System.out.println("test case failed");
		}
	}

}
