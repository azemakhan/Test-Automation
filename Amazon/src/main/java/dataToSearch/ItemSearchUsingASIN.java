package dataToSearch;

import methods.CommonMethods;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by Khan on 2/11/2017.
 */
public class ItemSearchUsingASIN extends CommonMethods {
    public String[] getASIN() throws IOException {
        DataReader dataReader = new DataReader();
        String path = System.getProperty("user.dir")+"/data/Items.xls";
        return dataReader.colReader(path,1);
    }
    public String[] getProductTitle() throws IOException {
        DataReader dataReader = new DataReader();
        String path = System.getProperty("user.dir")+"/data/Items.xls";
        return dataReader.colReader(path,2);
    }
    public String[] getProductCategory() throws IOException {
        DataReader dataReader = new DataReader();
        String path = System.getProperty("user.dir")+"/data/Items.xls";
        return dataReader.colReader(path,3);
    }
}
