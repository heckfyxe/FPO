import java.io.*;

public class TaskC {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("pancakes.in"));
        PrintWriter out = new PrintWriter(new FileWriter("pancakes.out"));

        int n = Integer.parseInt(in.readLine());
        char prev = in.readLine().charAt(0);
        int count = 1;
        for (int i = 1; i < n; i++) {
            char c = in.readLine().charAt(0);
            if (prev == c) continue;
            prev = c;
            count++;
        }
        if (prev == 'W') count--;
        out.println(count);

        in.close();
        out.close();
    }
}
