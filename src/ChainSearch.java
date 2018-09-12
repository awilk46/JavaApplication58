
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
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
public class ChainSearch {

    public static ArrayList<Meal> types(JTable jTable, JTextField jTextField,
            JTextField jTextField2) {

        ArrayList<Meal> types = new ArrayList<Meal>();

        String txt = jTextField.getText();
        String a[], b[], c[];
        int n = jTable.getRowCount();
        a = new String[n];
        b = new String[n];
        c = new String[n];

        for (int i = 0; i < n; i++) {

            a[i] = (String) jTable.getValueAt(i, 0);
            b[i] = (String) jTable.getValueAt(i, 1);
            c[i] = (String) jTable.getValueAt(i, 2);

            if (txt.contains("obiad") && c[i].contains("obiad")) {

                types.add(new Meal(a[i], b[i], c[i]));
                String listString = types.stream().map(Object::toString)
                        .collect(Collectors.joining(", "));
                jTextField2.setText(listString);

            }

            if (txt.contains("sniadanie") && c[i].contains("sniadanie")) {

                types.add(new Meal(a[i], b[i], c[i]));
                String listString = types.stream().map(Object::toString)
                        .collect(Collectors.joining(", "));
                jTextField2.setText(listString);

            }
            if (txt.contains("deser") && c[i].contains("deser")) {

                types.add(new Meal(a[i], b[i], c[i]));
                String listString = types.stream().map(Object::toString)
                        .collect(Collectors.joining(", "));
                jTextField2.setText(listString);

            }

        }

        System.out.println(types);

        return types;
    }
}
