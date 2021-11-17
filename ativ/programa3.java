package ativ;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programa3 {
    public static void main(String args[]) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Particular\\Desktop\\inp\\inp.txt");
        InputStreamReader readinp = new InputStreamReader(file);
        BufferedReader bfr = new BufferedReader(readinp);
        String lin = bfr.readLine();
        String[] inp = new String[2];
        int i = -1;
        while (lin != null) {
            i = i + 1;
            inp[i] = lin;
            lin = bfr.readLine();
        }
        String[] inp1 = inp[0].split(" ");
        String[] inp2 = inp[1].split(" ");
        int[] inps1 = new int[inp1.length];
        int[] inps2 = new int[inp2.length];
        for (int j = 0; j < inp1.length; j++) {
            inps1[j] = Integer.parseInt(inp1[j]);
            inps2[j] = Integer.parseInt(inp2[j]);
        }
        if (inps2[0] >= inps1[0] && inps2[0] <= inps1[2] && inps2[1] >= inps1[1]
                && inps2[1] <= inps1[3]) {
            System.out.println("1");
        } else {
            if (inps2[2] >= inps1[0] && inps2[2] <= inps1[2] && inps2[3] >= inps1[1] && inps2[3] <= inps1[3]) 
            {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}