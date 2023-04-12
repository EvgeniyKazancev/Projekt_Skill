import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarshallingXml  {
    private static final Logger logger = Logger.getLogger(MarshallingXml.class.getName());

    public void marshalling(ExportStructure exportStructure) throws IOException, JAXBException {
        try(Writer writer = new FileWriter("src/main/xmlReqs/req" + LocalDate.now() + ".xml")) {
            JAXBContext jaxbContext = JAXBContext.newInstance(ExportStructure.class);
            Marshaller mars = jaxbContext.createMarshaller();
            mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            new File("src/main/xmlReqs").mkdirs();
            mars.marshal(exportStructure, writer);

            logger.log(Level.INFO, "Xml файл успешно сгенерирован");
        } catch (JAXBException e) {
            logger.log(Level.SEVERE, "Ошибкака маршаллинга :", e);
        }

    }

}
