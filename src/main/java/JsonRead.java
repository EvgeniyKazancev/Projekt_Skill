import net.sf.saxon.functions.Serialize;

import java.io.*;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonRead {
    private static final Logger logger = Logger.getLogger(JsonRead.class.getName());

    public void jsonReader(ExportStructure exportStructure) {
        try {
            new File("src/main/jsonReqs").mkdir();
            FileOutputStream outputStream = new FileOutputStream("src/main/jsonReqs/req" + LocalDate.now() + ".json");
            ObjectOutputStream os = new ObjectOutputStream(outputStream);
            os.writeObject(JsonUtil.serializeExportStructure(exportStructure));

            logger.log(Level.INFO, "Файл успешно создан");
            os.close();

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Ошибка сериализации:" + e);
        }

    }
}
