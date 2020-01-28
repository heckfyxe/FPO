import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskA {

    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("startup.in");
        PrintWriter out = new PrintWriter(new FileWriter("startup.out"));

        int funny = 0;
        int sad = 0;
        int angry = 0;
        int deep = 0;

        int c = in.read();
        while (c != -1) {
            if ((char)c == ')') funny++;
            if (c == '(') sad++;
            if (c == '!') angry++;
            if (c == '.') deep++;

            c = in.read();
        }

        int[] array = new int[] { funny, sad, angry, deep };
        Arrays.sort(array);
        if (array[3] == array[2]) {
            out.println("Cleared");
        } else if (array[3] == funny) {
            out.println("Funny");
        } else if (array[3] == sad) {
            out.println("Sad");
        } else if (array[3] == angry) {
            out.println("Angry");
        } else {
            out.println("Deep");
        }

        in.close();
        out.close();
    }
}
