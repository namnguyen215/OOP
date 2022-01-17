/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NamNguyen
 */
public class DocFile {

    public static boolean isDoiXung(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isChan(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "src/bai2/in.txt";
        String output = "src/bai2/out.txt";
        String[] result = new String[1000];
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            String line = "";
            while ((line = br.readLine()) != null) {
                if (isDoiXung(line) && isChan(line)) {
                    result[i] = "Dep";
                    i++;
                } else {
                    result[i] = "Khong Dep";
                    i++;
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            PrintWriter p = new PrintWriter(output);
            int j = 0;
            while (j < i) {
                p.println(result[j]);
                j++;
            }
            p.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
