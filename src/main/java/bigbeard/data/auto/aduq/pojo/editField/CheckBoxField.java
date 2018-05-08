package bigbeard.data.auto.aduq.pojo.editField;

import org.springframework.stereotype.Component;

/**
 * Created by bigbeard on 2018/5/5.
 */
@Component
public class CheckBoxField extends SelectField {

    public CheckBoxField() {
        this.setFieldType(FieldType.CHECKBOX);
    }

}
