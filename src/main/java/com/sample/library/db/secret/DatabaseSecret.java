package com.sample.library.db.secret;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DatabaseSecret {
    private String username;
    private String password;
    private String engine;
    private String host;
    private Integer port;
    private String dbname;
    private String dbInstanceIdentifier;
}
