import java.util.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class Debug {
        private static final PrintWriter debugWriter;
 
        static {
            try {
                debugWriter = new PrintWriter(new FileWriter("error.txt"));
            } catch (IOException e) {
                throw new RuntimeException("Failed to open error.txt for writing", e);
            }
        }
 
        public static void debug(String varName, Object value) {
            debugWriter.println(varName + " = " + value);
            debugWriter.flush(); // Ensure the data is written to the file immediately
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        
        out.flush();
    }
}
