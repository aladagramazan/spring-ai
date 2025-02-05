package com.rem.springai.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
class OpenAiServiceImplTest {

    @Autowired
    OpenAiService openAiService;

    @Test
    void getAnswer() {
        String answer = openAiService.getAnswer("25 - 4 * 2 + 3 ? ");
        log.info("Answer: {}", answer);
    }
}