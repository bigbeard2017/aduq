package bigbeard.data.auto.aduq.pojo.editField;

import org.springframework.stereotype.Component;

/**
 * Created by bigbeard on 2018/5/5.
 */
@Component
public class RadioBoxField extends SelectField {
    public RadioBoxField() {
        this.setFieldType(FieldType.RADIO);
    }
}
