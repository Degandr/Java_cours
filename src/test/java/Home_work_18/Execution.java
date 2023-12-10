package Home_work_18;

import Home_work_18.Models.FinalModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Execution {
    public static void serializeObjectFromJsonFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Reader reader = new FileReader("src/test/resources/test.json")) {
            FinalModel json = gson.fromJson(reader, FinalModel.class);
            System.out.println(json.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        serializeObjectFromJsonFile();
    }
}
