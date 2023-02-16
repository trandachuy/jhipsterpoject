package com.trandachuy.myapp;

import com.trandachuy.myapp.JhipsterProjectApplicationApp;
import com.trandachuy.myapp.config.AsyncSyncConfiguration;
import com.trandachuy.myapp.config.EmbeddedElasticsearch;
import com.trandachuy.myapp.config.EmbeddedKafka;
import com.trandachuy.myapp.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterProjectApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
