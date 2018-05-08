package bigbeard.data.auto.aduq.pojo.editField;

import org.springframework.stereotype.Component;

/**
 * Created by bigbeard on 2018/5/5.
 */
@Component
public class DropListField extends SelectField {
    public DropListField() {
        this.setFieldType(FieldType.DROP_LIST);
    }
}
