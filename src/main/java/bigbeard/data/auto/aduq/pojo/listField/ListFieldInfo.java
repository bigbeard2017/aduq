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
    private boolean key = false;
    /**
     * 标题
     */
    private String title = "";
    /**
     * 字段名称
     */
    private String name = "";
    /**
     * 连接到外部的url
     */
    private String url = "";
    /**
     * 是否显示
     */
    private boolean hide = false;
    /**
     * 列宽度
     */
    private int width = 50;

    /**
     * 显示格式
     */
    private String format = "";

    /**
     * 信息过长的时候是否允许换行
     */
    private boolean allowTextWrap = false;


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

    public int getWidth() {
        return width;
    }

    public ListFieldInfo setWidth(int width) {
        this.width = width;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public ListFieldInfo setFormat(String format) {
        this.format = format;
        return this;
    }

    public boolean isAllowTextWrap() {
        return allowTextWrap;
    }

    public ListFieldInfo setAllowTextWrap(boolean allowTextWrap) {
        this.allowTextWrap = allowTextWrap;
        return this;
    }
}
