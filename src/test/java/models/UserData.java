package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class UserData {

        private String name;
        private String email;
        @JsonProperty("first_name")
        private String firstName;
        @JsonProperty("last_name")
        private String lastName;
        private String password;
        private String token;
        private String job;
        private String error;
    }

