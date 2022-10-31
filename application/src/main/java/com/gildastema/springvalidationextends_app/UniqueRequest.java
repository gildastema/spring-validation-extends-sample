package com.gildastema.springvalidationextends_app;

import com.gildastema.validations.constraints.Unique;

public record UniqueRequest(@Unique(field = "name" , table = "hello") String name ) {
}
