package bigbeard.data.auto.aduq.pojo.listField;

import org.springframework.stereotype.Component;

/**
 * Created by bigbeard on 2018/5/6.
 * 列表信息
 */
@Component
public class ListFieldInfo {
    /**
     * 是否主键
     */
    private boolean key;
    /**
     * 标题
     */
    private String title;
    /**
     * 字段名称
     */
    private String name;
    /**
     * 连接到外部的url
     */
    private String url;
    /**
     * 是否显示
     */
    private boolean hide;

    public boolean isKey() {
        return key;
    }

    public ListFieldInfo setKey(boolean key) {
        this.key = key;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ListFieldInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListFieldInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ListFieldInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public boolean isHide() {
        return hide;
    }

    public ListFieldInfo setHide(boolean hide) {
        this.hide = hide;
        return this;
    }
}
