package com.xj.designpatterns.decoratorPattern;

import com.xj.designpatterns.decoratorPattern.decorators.*;

/**
 * @author : xiongjun
 * @date : 2024/8/8 14:37
 */
public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        //将 FileDataSource 实例包裹在 EncryptionDecorator 和 CompressionDecorator 中，形成一个装饰器链。这意味着数据将首先被加密，然后被压缩，最后写入文件。
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("/Users/admin/E/eeeeee/OutputDemo.txt")));
        encoded.writeData(salaryRecords);

        //通过 plain 对象直接读取文件中的数据，展示加密和压缩后的数据，再通过 encoded 对象解码和解压缩，展示恢复后的原始数据。
        DataSource plain = new FileDataSource("/Users/admin/E/eeeeee/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

}
