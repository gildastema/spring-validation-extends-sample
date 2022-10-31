package com.gildastema.springvalidationextends_app;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gildastema.validations.constraints.Match;

@Match(field = "password", confirmation = "passwordConfirmation")
public record HelloRequest(String password , @JsonProperty("password_confirmation") String passwordConfirmation ) {
}
