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

    public GetRequestTypeMethod addParameterKeys(String key) {
        if (null == key || "".equals(key)) {
            return this;
        }
        boolean flg = false;
        for (int i = 0; i < parameterKeys.size(); i++) {
            if (key.equals(parameterKeys.get(i))) {
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
     * @return
     */
    public List<String> getParameterKeys() {
        return parameterKeys;
    }

    @Override
    public String getMethodType() {
        return "GET";
    }
}
