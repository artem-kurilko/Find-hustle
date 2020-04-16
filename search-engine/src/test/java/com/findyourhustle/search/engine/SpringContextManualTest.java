package com.findyourhustle.search.engine;

import com.findyourhustle.search.engine.configuration.SearchConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * This Manual test requires:
 * * Elasticsearch instance running on host
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SearchConfiguration.class)
public class SpringContextManualTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}