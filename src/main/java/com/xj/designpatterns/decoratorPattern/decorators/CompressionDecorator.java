package com.xj.designpatterns.decoratorPattern.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * CompressionDecorator 是 DataSourceDecorator 的另一个具体实现，它为数据源添加了压缩和解压缩的功能。
 * @author : xiongjun
 * @date : 2024/8/12 15:15
 */
public class CompressionDecorator extends DataSourceDecorator{

    private int compLevel = 6;

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    public int getCompressionLevel() {
        return compLevel;
    }

    public void setCompLevel(int compLevel) {
        this.compLevel = compLevel;
    }

    @Override
    public void writeData(String data) {
        //写入数据之前对数据进行压缩
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        //读取数据后对其进行解压缩。
        return decompress(super.readData());
    }

    private String compress(String dataStr){
        byte[] data = dataStr.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compLevel));
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        }catch (IOException ex){
            return null;
        }
    }


    private String decompress(String dataStr) {
        byte[] data = Base64.getDecoder().decode(dataStr);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1){
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        }catch (Exception e){
            return null;
        }
    }
}
