
public class Main {
    public static void main(String[] args) {
        //Pasalinti pirmi simboliai


        String nonStart = "Hello" + "There";
        nonStart = nonStart.replace("H", "");
        nonStart = nonStart.replace("T", "");
        System.out.println(nonStart);

        String nonStart1 = "java" + "code";
        nonStart1 = nonStart1.replace("j", "");
        nonStart1 = nonStart1.replace("c", "");
        System.out.println(nonStart1);

        String nonStart2 = "shotl" + "java";
        nonStart2 = nonStart2.replace("s", "");
        nonStart2 = nonStart2.replace("j", "");
        System.out.println(nonStart2);



    }
}