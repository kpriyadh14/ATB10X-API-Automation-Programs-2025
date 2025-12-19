package priya.API.testing;

public class Ex02_RA_Basics {
    public void step1(){
        System.out.println("Step 1");
    }
    public void step2(){
        System.out.println("Step 2");
    }
    public void step3( String param1){
        System.out.println("Step 3 "+ param1);
    }

    public static void main(String[] args) {
        Ex02_RA_Basics np = new Ex02_RA_Basics();
        np.step1();
        np.step2();
        np.step3("Priya");
    }
}
