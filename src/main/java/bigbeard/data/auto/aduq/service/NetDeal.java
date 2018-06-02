package bigbeard.data.auto.aduq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by bigbeard on 2018/5/1.
 */
@Service
public class NetDeal {

    @Autowired
    public NetDeal() {
        System.out.println("NetDeal 构造函数");
    }

    @PostConstruct
    public void init() {
        System.out.println("NetDeal 初始化函数");
    }

    @PreDestroy
    public void destory() {
        System.out.println("NetDeal 销毁函数");
    }

}
