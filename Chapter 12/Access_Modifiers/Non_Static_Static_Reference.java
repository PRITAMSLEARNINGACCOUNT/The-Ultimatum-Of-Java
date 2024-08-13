
public class Non_Static_Static_Reference {
    public String PublicVarriable = "Public Varriable";
    protected String ProtectedVarriable = "Protected Varriable";
    private String PrivateVarriable = "Private Varriable";
    String DefaultVarriable = "Default Varriable";

    public static void main(String[] args) {
        // System.out.println(ProtectedVarriable);
        // System.out.println(PrivateVarriable);
        // System.out.println(DefaultVarriable);
        // System.out.println(PublicVarriable);
        // The above code will not work because the main method is static and the variables are non-static
    }
}
