package com.kgcx.common.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 数字千分位转换器
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/3/9 9:38
 * @since 0.1
 */
public class ThousandSerializer extends JsonSerializer<Integer> {

    private NumberFormat formatter = new DecimalFormat("###,###");

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeString(formatter.format(value));
    }

}
