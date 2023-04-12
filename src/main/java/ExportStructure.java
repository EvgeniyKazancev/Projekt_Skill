import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExportStructure implements Serializable {
    @SerializedName("University")
    @XmlElementWrapper(name = "universitiesInfo")
    @XmlElement (name ="universityEntry")
    List<University> universityList ;
    @SerializedName("Student")
    @XmlElementWrapper(name = "studentsInfo")
    @XmlElement (name ="studentEntry")
    List<Student>  studentList;
    @SerializedName("Statistics")
    @XmlElementWrapper(name = "statisticalInfo")
    @XmlElement (name ="statisticsEntry")
    List<Statistics> statisticsList;

    public ExportStructure(List<University> universityList, List<Student> studentList, List<Statistics> statisticsList) {
        this.universityList = universityList;
        this.studentList = studentList;
        this.statisticsList = statisticsList;
    }

    public ExportStructure() {
    }
}
