package telran.io;

import org.json.JSONObject;

public interface JSONable {
    String getJSON();

    default void setObject(String json) {
        JSONObject jsonObject = new JSONObject(json);
        fillEmployee(jsonObject);
    }

    void fillEmployee(JSONObject jsonObject);
}
