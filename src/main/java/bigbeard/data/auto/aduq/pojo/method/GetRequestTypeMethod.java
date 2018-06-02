package bigbeard.data.auto.aduq.pojo.method;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bigbeard on 2018/5/6.
 */
@Component
public class GetRequestTypeMethod extends RequestMethodType {

    private List<String> parameterKeys = new ArrayList<>();

    private static final String GET = "GET";

    public GetRequestTypeMethod addParameterKeys(String key) {
        if (null == key || "".equals(key)) {
            return this;
        }
        boolean flg = false;
        for (String parameterKey : parameterKeys) {
            if (key.equals(parameterKey)) {
                flg = true;
                break;
            }
        }
        if (false == flg) {
            parameterKeys.add(key);
        }
        return this;
    }

    /**
     * 获取get请求的url中的参数名称
     *
     * @return 返回URL中需要的参数名称集合
     */
    public List<String> getParameterKeys() {
        return parameterKeys;
    }

    @Override
    public String getMethodType() {
        return GET;
    }
}
