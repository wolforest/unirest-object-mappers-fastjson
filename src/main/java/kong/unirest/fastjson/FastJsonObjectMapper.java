package kong.unirest.fastjson;

import com.alibaba.fastjson.JSON;
import kong.unirest.GenericType;
import kong.unirest.ObjectMapper;

public class FastJsonObjectMapper implements ObjectMapper {
    public FastJsonObjectMapper() {
    }

    @Override
    public <T> T readValue(String s, Class<T> aClass) {
        return JSON.parseObject(s, aClass);
    }

    @Override
    public <T> T readValue(String value, GenericType<T> genericType) {
        return ObjectMapper.super.readValue(value, genericType);
    }

    @Override
    public String writeValue(Object o) {
        return JSON.toJSONString(o);
    }
}
