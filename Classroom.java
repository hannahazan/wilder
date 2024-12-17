import wilderPackage.*;

public class Classroom{
    public static void main(String[] args) {
        
        Wilder paco = new Wilder("Paco", false);
        Wilder benoit = new Wilder("Benoit", false);
        Wilder sandrine = new Wilder("Sandrine", true);
        Wilder mohana = new Wilder("Mohana", true);

        System.out.println(paco.getAware());
        benoit.setFirstname("Patrick");

        System.out.println(paco.whoAmI());
        System.out.println(benoit.whoAmI());
        System.out.println(sandrine.whoAmI());
        System.out.println(mohana.whoAmI());
    }
}