package bigbeard.data.auto.aduq.controller;

import bigbeard.data.auto.aduq.pojo.EntryInfo;
import bigbeard.data.auto.aduq.service.NetDeal;
import bigbeard.data.auto.aduq.service.UIDataService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by bigbeard on 2018/3/26.
 */
@RequestMapping("/ui")
@RestController
public class UIDataController {

    @Autowired
    private NetDeal netDeal;

    @Autowired
    private EntryInfo entryInfo;

    @Resource
    private UIDataService uiDataService;

    @RequestMapping(value = "/uidata", method = RequestMethod.GET)
    public String getUIData(String key) {
        return new Date().toString() + key;
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        return "OK";
    }

    @RequestMapping("/getJson")
    public String getUIConfig() {
        EntryInfo entryInfo = uiDataService.getEntryInfo();
        String jsonString = JSONObject.toJSONString(entryInfo);
        System.out.println(jsonString);
        return jsonString;
    }
}
