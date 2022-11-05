package com.sample.library.db.connect;

import com.sample.library.db.secret.DatabaseSecret;
import com.sample.library.db.secret.RetrieveSecret;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class Connection {
    private final RetrieveSecret secretRetriever;

    @Bean
    public DataSource connect(){
        DatabaseSecret secret = secretRetriever.getSecret();
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .username(secret.getUsername())
                .password(secret.getPassword())
                .url("jdbc:"+ secret.getEngine() + "://" + secret.getHost() + ":" + secret.getPort())
                .build();
    }
}
