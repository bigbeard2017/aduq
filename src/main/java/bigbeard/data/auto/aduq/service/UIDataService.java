package bigbeard.data.auto.aduq.service;

import bigbeard.data.auto.aduq.pojo.EntryInfo;
import bigbeard.data.auto.aduq.pojo.editField.CheckBoxField;
import bigbeard.data.auto.aduq.pojo.editField.DateTimeField;
import bigbeard.data.auto.aduq.pojo.editField.DigitField;
import bigbeard.data.auto.aduq.pojo.listField.ListFieldInfo;
import bigbeard.data.auto.aduq.pojo.listField.QueryField;
import bigbeard.data.auto.aduq.pojo.method.GetRequestTypeMethod;
import bigbeard.data.auto.aduq.pojo.method.PostRequesTypetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by bigbeard on 2018/5/6.
 */
@Service
public class UIDataService {

    @Autowired
    private EntryInfo entryInfo;

    @Autowired
    private NetDeal netDeal;

    public EntryInfo getEntryInfo() {
        entryInfo.setCaption("标题");
        entryInfo.setName("com.data.autojo.EntryInfo");
        entryInfo.setAddRequestMethod(new PostRequesTypetMethod()
                .setUrl("/ui/uidata"));
        entryInfo.setDeleteRequestMethod(new PostRequesTypetMethod().setUrl("/ui/delete"));
        entryInfo.setEditRequestMethod(new PostRequesTypetMethod()
                .setUrl("/ui/uidata"));
        QueryField queryField = new QueryField();

        queryField.addQueryField(new CheckBoxField()
                .setName("userName").setTitle("姓名"));
        queryField.addQueryField(new DateTimeField()
                .setName("startDate").setTitle("开始时间")
                .setFaultMsg("日前格式不对").setMustInput(false)
                .setKey(false).setNullable(true).setRegular(""));
        queryField.setRequestMethod(new GetRequestTypeMethod()
                .addParameterKeys("userName")
                .addParameterKeys("startDate")
                .setUrl("/ui/q"));
        entryInfo.setQueryField(queryField);
        entryInfo.addListFieldsInfos(new ListFieldInfo()
                .setHide(true).setKey(true)
                .setName("ID").setTitle("").setUrl(""))
                .addListFieldsInfos(new ListFieldInfo().setUrl("/ui/q")
                        .setTitle("姓名").setName("userName").setKey(false)
                        .setHide(false).setUrl("").setAllowTextWrap(false));
        entryInfo.addListFieldsInfos(new ListFieldInfo().setAllowTextWrap(false)
                .setUrl("").setHide(false).setKey(false)
                .setTitle("开始时间")
                .setName("startDate")
                .setWidth(120)
                .setFormat("yyyy-MM-dd HH:mm:ss"));

        entryInfo.addFields(new CheckBoxField()
                .setTitle("爱好")
                .setFaultMsg("请选择爱好")
                .setKey(false)
                .setMustInput(true)
                .setName("love")
                .setNullable(false)
                .setRegular("")
                .setHeight(30)
                .setHeight(20));
        entryInfo.addFields(new DateTimeField()
                .setDefaultValue(new Date())
                .setTitle("birthday")
                .setHeight(15)
                .setRegular("")
                .setNullable(true)
                .setName("birthday")
                .setMustInput(false)
                .setKey(false)
                .setWidth(120));
        entryInfo.addFields(new DigitField()
                .setDecimal(0)
                .setMax(Integer.MAX_VALUE)
                .setMin(Integer.MIN_VALUE)
                .setTitle("数字")
                .setKey(false)
                .setMustInput(false)
                .setName("count")
                .setNullable(true)
                .setRegular("")
                .setHeight(15)
                .setFaultMsg("fff")
                .setWidth(120));
        return entryInfo;
    }

}
