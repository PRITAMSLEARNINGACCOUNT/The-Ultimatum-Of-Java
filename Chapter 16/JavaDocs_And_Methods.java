/**
 * This Is A Description Of The Class
 *
 * @author PRITAMSTECH
 * @version 1.0
 * @see <a href="https://docs.oracle.com/en/java/javase/22/docs/api/jdk.javadoc/module-summary.html">See More About JavaDocs</a>
 * @since 2024
 */

public class JavaDocs_And_Methods {
    /**
     * This Is A Description Of The Method
     *
     * @param Value This Is A Description Of The Parameter
     * @return This Is A Description Of The Return Value
     * @throws Exception This Is A Description Of The Exception
     * @deprecated This Method Is Currently Deprecated
     */
    public static int CustomMethod(String Value) throws Exception {

        System.out.println(Value);
        return 0;
    }

    public static void main(String[] args) {
        try {
            CustomMethod("Hello World");
        } catch (Exception e) {

        }
    }
}
