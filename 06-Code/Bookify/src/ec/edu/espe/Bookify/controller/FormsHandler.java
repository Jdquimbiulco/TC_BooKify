package ec.edu.espe.Bookify.controller;

import com.google.gson.Gson;
import ec.edu.espe.Bookify.model.User;
import ec.edu.espe.Bookify.view.FrmBookifyMainMenu;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

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
        Object[][] setData;
        int[] tableSize;

        tableSize = getTableSize(rowData);
        getData = createArrayWithData(rowData);
        addData = rowToArrayList(getData);
        setData = ConvertDataTosetIntable(addData, tableSize);

        model = new DefaultTableModel(setData, columHeaders);
        return model;

    }

    public String[] createArrayWithData(ArrayList rowData) {

        String[] getData;

        getData = new String[rowData.size()];
        for (int i = 0; i < rowData.size(); i++) {
            getData[i] = rowData.get(i).toString();

        }

        return getData;
    }

    public int[] getTableSize(ArrayList rowData) {

        int[] tableSize = new int[2];
        String[] getNumberOfColumns;
        int rows;
        int columns;

        getNumberOfColumns = rowData.get(0).toString().split(",");
        columns = getNumberOfColumns.length;
        rows = rowData.size();

        tableSize[0] = rows;
        tableSize[1] = columns;

        return tableSize;
    }

    public ArrayList rowToArrayList(String[] getData) {
        ArrayList<String> addData;
        String[] splitData;
        addData = new ArrayList<>();

        for (String ar : getData) {
            splitData = ar.split(",");
            addData.addAll(Arrays.asList(splitData));
        }

        return addData;
    }

    public Object[][] ConvertDataTosetIntable(ArrayList addData, int[] tableSize) {

        int columns;
        int rows;
        Object[][] setData;

        rows = tableSize[0];
        columns = tableSize[1];
        setData = new String[rows][columns];
        int counter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                setData[i][j] = addData.get(j + counter);
            }
            counter += columns;
        }

        return setData;
    }

    public Object findBookifyObject(Object bookifyObject, String collection, String atributeToFind, Object tofind) {

        MongoDBManager db;
        Object bookifyfound = null;
        Gson gson;
        Document found;

        db = new MongoDBManager();
        gson = new Gson();
        found = db.findDocument(atributeToFind, tofind, collection);
 
        if (found != null) {
            bookifyfound = gson.fromJson(found.toJson(), bookifyObject.getClass());
        } else {
            System.out.println("Not found");
        }

        return bookifyfound;

    }
    
    
    

}
