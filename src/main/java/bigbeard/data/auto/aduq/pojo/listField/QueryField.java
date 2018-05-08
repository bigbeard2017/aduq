package bigbeard.data.auto.aduq.pojo.listField;

import bigbeard.data.auto.aduq.pojo.editField.Field;
import bigbeard.data.auto.aduq.pojo.method.RequestMethodType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bigbeard on 2018/5/6.
 * 查询信息
 */
@Component
public class QueryField {
    /**
     * 查询字段
     */
    List<Field> queryField = new ArrayList<>();
    /**
     * 查询方法
     */
    private RequestMethodType requestMethod;

    public List<Field> getQueryField() {
        return queryField;
    }

    public QueryField addQueryField(Field field) {
        queryField.add(field);
        return this;
    }

    public RequestMethodType getRequestMethod() {
        return requestMethod;
    }

    public QueryField setRequestMethod(RequestMethodType requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
}
