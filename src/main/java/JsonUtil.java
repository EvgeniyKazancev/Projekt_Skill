import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonUtil {
    private JsonUtil() {
    }
    public static <T> String modelListToJson(List<T> modelList){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return
                gson.toJson(modelList);
    }
    public static String serializeStudent(Student student) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return
                gson.toJson(student);
    }

    public static String serializeUniversity(University university) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return
                gson.toJson(university);
    }

    public static Student deserializeStudent(String json) {
        Gson gson = new GsonBuilder().create();
        return
                gson.fromJson(json, Student.class);

    }

    public static University deserializeUniversity(String json) {
        Gson gson = new GsonBuilder().create();
        return
                gson.fromJson(json, University.class);
    }

    public static List<Student> deserializeStudentList(String json) {
        Gson gson = new GsonBuilder().create();
        Type type = new TypeToken<List<Student>>() {
        }.getType();
        return
                gson.fromJson(json, type);

    }

    public static List<University> deserializeUniversityList(String json) {
        Gson gson = new GsonBuilder().create();
        Type type = new TypeToken<List<University>>() {
        }.getType();
        return
                gson.fromJson(json, type);

    }

    public static String serializeExportStructure(ExportStructure exportStructure) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return
                gson.toJson(exportStructure);
    }
}
