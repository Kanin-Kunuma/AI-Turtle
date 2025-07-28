package com.zcom.zcomturtle.config;


import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;


/**
 * AI 配置类
 */
@Configuration
@ConfigurationProperties(prefix = "ai")
@Data
public class AiConfig {

    private  String apikey;

    static String baseUrl = "https://ark.cn-beijing.volces.com/api/r1";

    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();

    /**
     * 初始化AI客户端
     * @return
     */
    @Bean
    public ArkService getAIService() {
        return ArkService.builder().dispatcher(dispatcher)
                .connectionPool(connectionPool)
                .baseUrl(baseUrl)
                .apiKey(apikey).build();
    }
}
