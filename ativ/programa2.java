package ativ;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programa2 {
    public static void main(String args[]) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Particular\\Desktop\\inp\\inp.txt");
        InputStreamReader readinp = new InputStreamReader(file);
        BufferedReader bfr = new BufferedReader(readinp);
        String lin = bfr.readLine();
        String inp1 = lin;
        lin = bfr.readLine();
        String[] inps1 = inp1.split(" ");
        String[] inp = new String[Integer.parseInt(inps1[1])];
        int i = -1;
        while (lin != null) {
            i = i + 1;
            inp[i] = lin;
            lin = bfr.readLine();
        }
        int[] vend = new int[Integer.parseInt(inps1[0])];
        int[] des = new int[Integer.parseInt(inps1[0])];
        int f = 1;
        for (int j = 0; j < vend.length; j++) {
            try {
                vend[j] = Integer.parseInt(inp[j]);
                inp[j] = "0";
            } catch (Exception v) {
                System.out.println("faltam ligações para que o número de vendedores seja totalmente suprido.");
            }
        }
        while (f == 1) {
            f = 0;
            for (int j = 0; j < vend.length; j++) {
                vend[j] = vend[j] - 1;
                if (vend[j] == 0) {
                    des[j] = des[j] + 1;
                }
            }
            for (int j = 0; j < vend.length; j++) {
                for (int k = 0; k < inp.length; k++) {
                    if (vend[j] == 0 && Integer.parseInt(inp[k]) != 0) {
                        try {
                            vend[j] = Integer.parseInt(inp[k]);
                            inp[k] = "0";
                        } catch (Exception v) {
                            System.out.println("faltam ligações para que o número de vendedores seja totalmente suprido.");
                        }
                    }
                }
            }
            for (int j = 0; j < vend.length; j++) {
                if (vend[j] > 0) {
                    f = 1;
                }
            }
        }
        for (int j = 0; j < vend.length; j++) {
            System.out.println(j + 1 + " " + des[j]);
        }
    }
}