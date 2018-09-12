
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
public class BinarySearch {

    public static void binarySearch(JTable jTable1, JTextField jTextField1, JTextField jTextField2) {

        try {
            int a[], l, p, s, n, x, i;


            //liczba elementów tablicy, wylicza ilosc wierszy
            n = jTable1.getRowCount();
            a = new int[n];

            //pobiera wartosci z danego wiersza w pierwszej kolumnie
            for ( i = 0; i < n; i++) {

                a[i] = Integer.parseInt((String) jTable1.getValueAt(i, 0));

            }


            //element do wyszukania
            x = Integer.parseInt(jTextField1.getText());

            //szukaj elementu x
            l = 0;
            p = n - 1;
            while (l <= p) {
                s = (l + p) / 2;

                if (a[s] == x) {

                    
                    StringBuilder sb = new StringBuilder();
                    sb.append(x);
                    String str = sb.toString();
                    jTextField2.setText(str+jTable1.getValueAt(s, 1)+jTable1.getValueAt(s, 2));
                    //zakoncz program
                    return;
                }

                if (a[s] < x) {
                    l = s + 1;
                } else {
                    p = s - 1;
                }
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
