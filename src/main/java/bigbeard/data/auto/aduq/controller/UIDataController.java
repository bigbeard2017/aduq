package bigbeard.data.auto.aduq.controller;

import bigbeard.data.auto.aduq.pojo.EntryInfo;
import bigbeard.data.auto.aduq.service.NetDeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by bigbeard on 2018/3/26.
 */
@RequestMapping("/ui")
@RestController
public class UIDataController {

    @Autowired
    NetDeal netDeal;

    @Autowired
    EntryInfo entryInfo;

    @RequestMapping(value = "/uidata", method = RequestMethod.GET)
    public String getUIData(String key) {
        return new Date().toString() + key;
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        return "OK";
    }
}
