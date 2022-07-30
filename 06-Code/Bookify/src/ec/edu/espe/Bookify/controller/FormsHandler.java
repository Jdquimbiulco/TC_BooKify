package ec.edu.espe.Bookify.controller;

import ec.edu.espe.Bookify.view.FrmBookifyMainMenu;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormsHandler {

    public static void goToMainScreen(JFrame jFrameToClose) {
        FrmBookifyMainMenu frmBookifyMainMenu = new FrmBookifyMainMenu();
        jFrameToClose.setVisible(false);
        frmBookifyMainMenu.setVisible(true);
    }

    public DefaultTableModel SetDatatoTables(String[] columHeaders, ArrayList rowData) {

        DefaultTableModel model;
        ArrayList<String> addData;
        String[] getData;
        String[] splitData;
        Object[][] setData;
        int numberOfAtributes;

        addData = new ArrayList<>();

        getData = rowData.get(0).toString().split(",");
        numberOfAtributes = getData.length;
        getData = new String[rowData.size()];

        for (int i = 0; i < rowData.size(); i++) {
            getData[i] = rowData.get(i).toString();

        }

        for (String ar : getData) {
            splitData = ar.split(",");
            for (String dat : splitData) {
                addData.add(dat);
            }
        }

        setData = new String[rowData.size()][numberOfAtributes];
        int counter = 0;

        for (int i = 0; i < rowData.size(); i++) {

            for (int j = 0; j < numberOfAtributes; j++) {
                setData[i][j] = addData.get(j + counter);
            }
            counter = +numberOfAtributes;

        }

        model = new DefaultTableModel(setData, columHeaders);
        return model;

    }

}
