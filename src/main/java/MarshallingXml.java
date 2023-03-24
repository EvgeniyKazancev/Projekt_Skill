import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarshallingXml {
    private static final Logger logger = Logger.getLogger(MarshallingXml.class.getName());

    public void marshalling(List<Statistics> statisticsList) throws IOException, JAXBException {
        try {


            JAXBContext jaxbContext = JAXBContext.newInstance(MarshallingXml.class);
            Marshaller mars = jaxbContext.createMarshaller();
            mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            OutputStream out = new FileOutputStream("src/main/xmlReqs/req.xml");

            mars.marshal(statisticsList, out);

            out.close();
        } catch (JAXBException e) {
            logger.log(Level.SEVERE, "Ошибкака маршаллинга", e);
        }
    }

}
