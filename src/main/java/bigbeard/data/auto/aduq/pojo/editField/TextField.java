package bigbeard.data.auto.aduq.pojo.editField;

import org.springframework.stereotype.Component;

/**
 * Created by bigbeard on 2018/5/5.
 */
@Component
public class TextField extends Field {
    /**
     * 最大长度
     */
    private int length = 32767;
    /**
     * 默认值
     */
    private String defaultValue = "";

    public TextField() {
        this.setFieldType(FieldType.TEXT);
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public TextField setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public int getLength() {
        return length;
    }

    public TextField setLength(int length) {
        this.length = length;
        return this;
    }
}
