package priya.API.testing;

public class Ex04_build_design_Pattern {
    public Ex04_build_design_Pattern step1(){
        System.out.println("Step 1");
        return this;
    }
    public Ex04_build_design_Pattern step2(){
        System.out.println("Step 2");
        return this;
    }
    public Ex04_build_design_Pattern step3( String param){
        System.out.println("Step 3" + param);
        return this;
    }

    public static void main(String[] args) {
        Ex04_build_design_Pattern bp= new Ex04_build_design_Pattern();
        bp.step1().step2().step3("Priya");
    }
}
