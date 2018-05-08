package bigbeard.data.auto.aduq.pojo;


import bigbeard.data.auto.aduq.pojo.editField.Field;
import bigbeard.data.auto.aduq.pojo.listField.ListFieldInfo;
import bigbeard.data.auto.aduq.pojo.listField.QueryField;
import bigbeard.data.auto.aduq.pojo.method.RequestMethodType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bigbeard on 2018/3/28.
 */
@Component
public class EntryInfo {

    private String caption = "";
    private String name = "";

    private List<Field> fields = new ArrayList<>();
    private List<ListFieldInfo> listFieldInfos = new ArrayList<>();
    private QueryField queryField;
    private RequestMethodType editRequestMethod;
    private RequestMethodType addRequestMethod;
    private RequestMethodType deleteRequestMethod;


    public EntryInfo addFields(Field fieldInfo) {
        if (null != fieldInfo) {
            this.fields.add(fieldInfo);
        }
        return this;
    }

    public List<Field> getFields() {
        return this.fields;
    }

    public EntryInfo addListFieldsInfos(ListFieldInfo listFieldInfo) {
        if (null != listFieldInfo) {
            this.listFieldInfos.add(listFieldInfo);
        }
        return this;
    }

    public List<ListFieldInfo> getListFieldInfos() {
        return this.listFieldInfos;
    }

    public String getCaption() {
        return this.caption;
    }

    public EntryInfo setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public RequestMethodType getEditRequestMethod() {
        return editRequestMethod;
    }

    public EntryInfo setEditRequestMethod(RequestMethodType editRequestMethod) {
        this.editRequestMethod = editRequestMethod;
        return this;
    }

    public RequestMethodType getAddRequestMethod() {
        return addRequestMethod;
    }

    public EntryInfo setAddRequestMethod(RequestMethodType addRequestMethod) {
        this.addRequestMethod = addRequestMethod;
        return this;
    }

    public RequestMethodType getDeleteRequestMethod() {
        return deleteRequestMethod;
    }

    public EntryInfo setDeleteRequestMethod(RequestMethodType deleteRequestMethod) {
        this.deleteRequestMethod = deleteRequestMethod;
        return this;
    }

    public QueryField getQueryField() {
        return queryField;
    }

    public EntryInfo setQueryField(QueryField queryField) {
        this.queryField = queryField;
        return this;
    }

    public String getName() {
        return name;
    }

    public EntryInfo setName(String name) {
        this.name = name;
        return this;
    }
}
