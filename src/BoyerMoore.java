
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adria
 */
public class BoyerMoore {

    private final int R;     // the radix
    private int[] right;     // the bad-character skip array
    private String pat;      // or as a string

    // pattern provided as a string
    public BoyerMoore(String pat) {
        this.R = 256;
        this.pat = pat;

        // position of rightmost occurrence of c in the pattern
        right = new int[R];
        for (int c = 0; c < R; c++) {
            right[c] = -1;
        }
        for (int j = 0; j < pat.length(); j++) {
            right[pat.charAt(j)] = j;
        }
    }

    // return offset of first match; N if no match
    public ArrayList<Integer> search(String txt, JTextField jTextField4) {
        int M = pat.length();
        int N = txt.length();

        ArrayList<Integer> newArrayInt = new ArrayList<Integer>();
        int skip;
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = Math.max(1, j - right[txt.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) {
                newArrayInt.add(i);    // found
                System.out.println(txt);
                jTextField4.setText(txt);
                skip++;
            }
        }
//         System.out.println(txt);
        return newArrayInt;     // not found
    }

}

