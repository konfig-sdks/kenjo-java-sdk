package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://sandbox-api.kenjo.io/api/v1";
        Kenjo client = new Kenjo(configuration);
        assertNotNull(client);
    }
}
