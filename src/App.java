import com.biziol.Inputer;

public class App {
    public static void main(String[] args) throws Exception {
        Inputer in = new Inputer();

        Integer numInt = in.readInteger("insert an Integer: ");
        System.out.println("The inserted integer is: " + numInt);

        numInt = in.readInteger("insert a double number to verify gestion of the error: ");
        System.out.println("The inserted integer is: " + numInt);

        Double numDouble = in.readDouble("insert a Double number: ");
        System.out.println("The inserted Double is: " + numDouble);

        String string = in.readLine("string test");
        System.out.println("The inserted Double is: " + string);
    }
}
