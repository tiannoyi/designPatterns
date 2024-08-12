package com.xj.designpatterns.decoratorPattern.decorators;

import java.io.*;
import java.nio.file.Files;

/**
 * 简单的数据读写器
 * FileDataSource 是 DataSource 的具体实现类，它代表文件系统中的数据源。它包含一个 name 字段，表示文件的名称。
 * @author : xiongjun
 * @date : 2024/8/8 14:38
 */
public class FileDataSource implements DataSource{
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = Files.newOutputStream(file.toPath())){
            fos.write(data.getBytes(), 0, data.length());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)){
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
