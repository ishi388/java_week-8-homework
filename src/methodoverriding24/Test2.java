package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        Icici i=new Icici();
        AXIS a=new AXIS();
        System.out.println("Sbi Rate of Interest: "+sbi.getRateOfInterest());
        System.out.println("Icici Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
