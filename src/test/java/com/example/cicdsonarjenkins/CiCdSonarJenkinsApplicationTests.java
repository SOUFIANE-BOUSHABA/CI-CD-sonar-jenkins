package com.example.cicdsonarjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CiCdSonarJenkinsApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true, "Application context loads without errors");
    }

}
