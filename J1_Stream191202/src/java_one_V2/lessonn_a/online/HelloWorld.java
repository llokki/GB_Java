package java_one_V2.lessonn_a.online;

public class HelloWorld {

    private static void helloUser(String name) {
        System.out.println("РџСЂРёРІРµС‚, " + name);
    }

    private static int math(int arg1, int arg2) {
        int result;
        result = arg1 * arg2 / 5;
        return result;
    }

    public static void main(String[] args) {
        helloUser("Ivan");
        helloUser("Petr");
        System.out.println(math(10, 65));
    }

    private static void termOperators() {
        int x = 0;
        int y = 0;
        int fieldX = 2;
        int fieldY = 2;

        // < > <= >= == !=
        // a&&b a||b a^b !a

        if (x < 0 && x > fieldX && y < 0 && y > fieldY) {
            System.out.println("User missed");
            // more actions
        } else {
            System.out.println("Missed again");
        }
    }

    private static void arithmetic() {

        int i = 10;
        i++;
        i += 10; // i  = i + 10;
        System.out.println(i / 3f);
    }

    private static void variables() {
        byte b = 120;           // 1b
        short s = 32767;        // 2b signed
        int i =  2147000000;    // 4b
        long l = 121470000000L; // 8b

        float f = 10.1f;        // 4b
        double d = 10.1;        // 8b

        boolean boo = true;     // unknown

        char c;                 // 2b unsigned
        char c0 = 32000;        // 2b unsigned
        c = 'B';
        System.out.println(c0);

        String str = "Hello";
        System.out.println(str);
    }
}