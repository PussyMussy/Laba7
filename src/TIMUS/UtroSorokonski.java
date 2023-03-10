package TIMUS;



import java.io.*;
        import java.util.Locale;

public class UtroSorokonski {

    static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(System.out);

    static final int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int a = nextInt() << 1;
        int b = nextInt() << 1;

        out.println(Math.max(a + 39, b + 40));
        out.flush();
    }
}