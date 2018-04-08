package site.pers.kl.bean.message;

import java.util.HashMap;
import java.util.Map;

public class Message {
    private boolean code = false;
    private Map<String, Object> extend = new HashMap<>();

    public boolean isCode() {
        return code;
    }

    public void setCode(boolean code) {
        this.code = code;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    //添加数据
    public Message add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }
}
