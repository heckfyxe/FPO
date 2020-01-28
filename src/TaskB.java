import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("lights.in"));
        PrintWriter out = new PrintWriter(new FileWriter("lights.out"));
        int g = in.nextInt();
        int gb = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();
        int ry = in.nextInt();
        int t = in.nextInt();

        int s = g + gb + y + r + ry;
        int ts = t / s;

        float gs = (g + gb / 2f) * ts;
        float ys = (y + ry) * ts;
        float rs = (r + ry) * ts;

        int to = t % s;
        if (to > g) {
            to -= g;
            gs += g;
        } else {
            gs += to;
            to = 0;
        }
        if (to > gb) {
            to -= gb;
            gs += gb / 2f;
        } else {
            gs += to;
            to = 0;
        }
        if (to > y) {
            to -= y;
            ys += y;
        } else {
            ys += to;
            to = 0;
        }
        if (to > r) {
            to -= r;
            rs += r;
        } else {
            rs += to;
            to = 0;
        }
        if (to > ry) {
            rs += ry;
            ys += ry;
        } else {
            rs += to;
            ys += to;
        }

        out.println(String.format(Locale.US, "%.1f %.1f %.1f", rs, ys, gs));

        in.close();
        out.close();
    }
}
