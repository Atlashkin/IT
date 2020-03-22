import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


public class CrunchifyJSONFileWrite {
    private static FileWriter file;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {


        JSONObject obj = new JSONObject();
        obj.put("Name", "Crunchify.com");
        obj.put("Author", "App Shah");

        JSONArray company = new JSONArray();
        company.add("Company: Facebook");
        company.add("Company: PayPal");
        company.add("Company: Google");
        obj.put("Company List", company);
        try {


            file =  new FileWriter("/Users/Shared/crunchify.txt");
            file.write( obj.toJSONString());
            CrunchifyLog("Successfully Copied JSON Object to File...");
            CrunchifyLog("\nJSON Object: " +  obj);

        } catch (IOException e) {
            e.printStackTrace();

        }  finally {

            try {
                file.flush( );
                file.close( );
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

    static public void CrunchifyLog(String str) {
        System.out.println("str");
    }

}