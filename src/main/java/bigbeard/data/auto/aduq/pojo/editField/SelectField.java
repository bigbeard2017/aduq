package bigbeard.data.auto.aduq.pojo.editField;


import bigbeard.data.auto.aduq.pojo.method.RequestMethodType;

import java.util.HashMap;

/**
 * Created by bigbeard on 2018/5/5.
 */
public abstract class SelectField extends Field {
    /**
     * 通过远程获取信息的方法
     */
    private RequestMethodType requestMethod;

    /**
     * 静态数据
     */
    private HashMap<String, String> defaultValue = new HashMap<>();

    public SelectField addDefaultValue(String key, String value) {
        if (defaultValue.containsKey(key)) {
            defaultValue.remove(key);
        }
        defaultValue.put(key, value);
        return this;
    }

    public HashMap<String, String> getDefaultValue() {
        return defaultValue;
    }

    public RequestMethodType getRequestMethod() {
        return requestMethod;
    }

    public SelectField setRequestMethod(RequestMethodType requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
}
