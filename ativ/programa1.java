package ativ;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programa1 {
    public static void main(String args[]) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Particular\\Desktop\\input\\input.txt");
        InputStreamReader readinp = new InputStreamReader(file);
        BufferedReader bfr = new BufferedReader(readinp);
        String lin = bfr.readLine();
        String[] inp = new String[3];
        int i = -1;
        while (lin != null) {
            i = i + 1;
            inp[i] = lin;
            lin = bfr.readLine();
        }
        String[] ft = inp[2].split(" ");
        int m = 0;
        int maxsize = 0;
        for (int k = 0; k < ft.length; k++) {
            m += Integer.parseInt(ft[k]);
        }
        m = m / Integer.parseInt(inp[0]);

        while (m > 0) {
            for (int k = 0; k < ft.length; k++) {
                maxsize += Integer.parseInt(ft[k]) / m;
            }
            if (maxsize == Integer.parseInt(inp[0])) {
                System.out.println(m);
                break;
            } else {
                m = m - 1;
                maxsize = 0;
            }
        }
    }
}