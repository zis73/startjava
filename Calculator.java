public class MyFirstApp{
	public static void main(String[] args) {
		boolean a= 1+1==2;
		boolean b= 30-5==25;
		boolean c= 30*4==120;
		boolean d= 50/25==2;
		boolean f= 10%3==1;
		boolean e= 185+145==330;
		boolean	g= 48-15==33;
		boolean h= 12*2==24;
		boolean	k= 72/8==9;
		boolean l= 20%9==2;
		boolean m= square(5)==25;
		boolean o=square1(7)==49;

		if (a) {
			System.out.println("1+1=2");
		} if (b) {
			System.out.println("30-5=25");
		}
		if (c) {
			System.out.println("30*4=120");
		}
		if (d) {
			System.out.println("50/25=2");
		}
		if (f) {
			System.out.println("10%3=1");
		}
		if (e) {
			System.out.println("185+145=330");
		} if (g) {
			System.out.println("48-15=33");
		}
		if (h) {
			System.out.println("12*2=24;");
		}
		if (k) {
			System.out.println("72/8=9");
		}
		if (l) {
			System.out.println("20%9=2");
		}
		if (m) {
			System.out.println("5^2==25");
		}
		if (o) {
			System.out.println("7^2==49");
		}
	}
	static int square(int m){
        int result1 = m*m;
       
        return result1;
       
    }  
    static int square1(int o){
        
        int result2 = o*o;
       
        return result2;
    }     
}