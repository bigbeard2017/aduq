package bigbeard.data.auto.aduq.service;

import bigbeard.data.auto.aduq.pojo.EntryInfo;
import bigbeard.data.auto.aduq.pojo.editField.CheckBoxField;
import bigbeard.data.auto.aduq.pojo.listField.QueryField;
import bigbeard.data.auto.aduq.pojo.method.PostRequesTypetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bigbeard on 2018/5/6.
 */
@Service
public class UIDataService {

    @Autowired
    EntryInfo entryInfo;

    public EntryInfo getEntryInfo() {
        entryInfo.setCaption("标题");
        entryInfo.setName("com.data.autojo.EntryInfo");
        entryInfo.setAddRequestMethod(new PostRequesTypetMethod()
                .setUrl("/ui/uidata"));
        entryInfo.setDeleteRequestMethod(new PostRequesTypetMethod().setUrl("/ui/delete"));
        entryInfo.setEditRequestMethod(new PostRequesTypetMethod()
                .setUrl("/ui/uidata"));
        QueryField queryField = new QueryField();

        queryField.addQueryField(new CheckBoxField().setName("userName").setTitle("姓名"));
        entryInfo.setQueryField(queryField);

        return entryInfo;
    }

}
