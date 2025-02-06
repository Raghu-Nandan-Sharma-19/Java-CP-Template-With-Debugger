import java.io.*;
import java.util.*;

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

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    // Debugging utility
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

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        // to take input use (.nextInt() and every method is same as scanner methods)
        int n = in.nextInt();

        // to print output
        out.println(n); // or out.print(n);

        // to debug --> the debug goes into error.txt
        Debug.debug("n", n);

        out.close();
    }
}


