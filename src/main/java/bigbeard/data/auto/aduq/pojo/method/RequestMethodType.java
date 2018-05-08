package bigbeard.data.auto.aduq.pojo.method;

/**
 * Created by bigbeard on 2018/5/6.
 */
public abstract class RequestMethodType {
    private String url;

    public String getUrl() {
        return url;
    }

    public RequestMethodType setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 获取请求方式
     *
     * @return
     */
    public abstract String getMethodType();

}
