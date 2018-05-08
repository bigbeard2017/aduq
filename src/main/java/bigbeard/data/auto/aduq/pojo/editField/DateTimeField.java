package bigbeard.data.auto.aduq.pojo.editField;


import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by bigbeard on 2018/5/5.
 */
@Component
public class DateTimeField extends Field {
    /**
     * 默认时间
     */
    private Date defaultValue;

    public DateTimeField() {
        this.setFieldType(FieldType.DATE);
        Date date = new Date();
//        String formatStr="yyyy-MM-dd HH:mm:ss";
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(formatStr);
//        simpleDateFormat.format(date);
        this.setDefaultValue(date);
    }

    public Date getDefaultValue() {
        return defaultValue;
    }

    public DateTimeField setDefaultValue(Date defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
}
