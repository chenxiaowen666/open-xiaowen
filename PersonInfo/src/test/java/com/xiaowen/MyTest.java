package com.xiaowen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import javax.sql.DataSource;

@SpringBootTest
public class MyTest {
    @Autowired
    private DataSource dataSource;

    @Test
    void testConnection() throws SQLException {
        System.out.println("驱动类：" + dataSource.getConnection().getMetaData().getDriverName());
    }


    @Test
    void test() {
        //fdsfd
        int a = '1'-'0';
        System.out.println(a);
    }
}
