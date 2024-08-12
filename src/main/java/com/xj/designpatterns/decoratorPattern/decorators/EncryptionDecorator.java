package com.xj.designpatterns.decoratorPattern.decorators;

import java.util.Base64;

/**
 * EncryptionDecorator 是 DataSourceDecorator 的一个具体实现，它为数据源添加了加密和解密的功能。
 * @author : xiongjun
 * @date : 2024/8/12 15:10
 */
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        //写入数据之前对数据进行编码（简单的加密操作）。
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        //读取数据后对其进行解码
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data){
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }


}
