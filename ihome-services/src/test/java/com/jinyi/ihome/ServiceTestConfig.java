package com.jinyi.ihome;

import com.jinyi.ihome.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by warrior on 14/9/30.
 */
@PropertySource("classpath:application.properties")
@Import({ServiceConfig.class})
@Configurable
public class ServiceTestConfig {
}
