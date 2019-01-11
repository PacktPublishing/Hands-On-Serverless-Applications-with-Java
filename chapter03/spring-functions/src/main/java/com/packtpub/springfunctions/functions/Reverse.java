package com.packtpub.springfunctions.functions;

import java.util.function.Function;

public class Reverse implements Function<String, String> {

    @Override
    public String apply(String value) {
        return new StringBuilder(value).reverse().toString();
    }
}
