package org.web3j.protocol.core;

import com.fasterxml.jackson.annotation.JsonValue;

public class DefaultBlockParameterHash implements DefaultBlockParameter {
    private final String hash;

    public DefaultBlockParameterHash(String hash) {
        this.hash = hash;
    }

    @JsonValue
    @Override
    public String getValue() {
        return hash;
    }
}
