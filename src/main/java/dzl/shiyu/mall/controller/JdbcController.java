package dzl.shiyu.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/queryAll")
    public List<Map<String,Object>> queryAll(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from jdbc_test");
        return list;
    }
    @GetMapping("/insert")
    public Object insert(String type, String name){
        if (StringUtils.isEmpty(type) || StringUtils.isEmpty(name)){
            return false;
        }
        jdbcTemplate.execute("insert into jdbc_test(`type`,`name`) value (\"" + type + "\",\"" + name + "\")");
        return true;
    }
}
