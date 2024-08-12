package com.xj.designpatterns.decoratorPattern;

import com.xj.designpatterns.decoratorPattern.decorators.*;

/**
 * @author : xiongjun
 * @date : 2024/8/8 14:37
 */
public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("/Users/admin/E/eeeeee/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("/Users/admin/E/eeeeee/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

}
