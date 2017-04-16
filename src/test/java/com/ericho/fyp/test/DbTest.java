package com.ericho.fyp.test;

import com.ericho.fyp.dao.ProductDao;
import com.ericho.fyp.model.Product;
import com.google.gson.Gson;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DbTest {
    Logger log = LoggerFactory.getLogger(DbTest.class);
    Gson gs = new Gson();
    @Autowired
    private ProductDao productRepository;


    @Before
    public void setUp() {

        log.debug("before");
    }

    @Test
    public void test111() {
        List<Product> prods = Lists.newArrayList(productRepository.findAll());
        log.debug(gs.toJson(prods));
    }
}
