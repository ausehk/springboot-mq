package com.kgcx.common.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**布尔类型转换器
 *
 * @author
 * @version 0.1
 * @time 2017/3/9 9:37
 * @since 0.1
 */
public class BooleanSerializer extends JsonSerializer<Boolean> {

    @Override
    public void serialize(Boolean value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        if (Boolean.FALSE.equals(value)) {
            gen.writeNumber(0);
        } else {
            gen.writeNumber(1);
        }
    }

}
