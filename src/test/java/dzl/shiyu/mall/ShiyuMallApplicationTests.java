package dzl.shiyu.mall;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShiyuMallApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSourceTest() throws SQLException{
        Connection connection = dataSource.getConnection();
        System.out.print("获取连接：");

        System.out.println(connection!=null);
        connection.close();
    }


}
