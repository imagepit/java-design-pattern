package structure.facade.example.pagemaker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {    // newでインスタンス生成させないためにprivate宣言
    }
    public static Properties getProperties(String dbname) { // データベース名からPropertiesを得る
        String filename = new File("src/structure/facade/example").getAbsolutePath() + File.separator + dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}