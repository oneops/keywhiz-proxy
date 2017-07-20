/*******************************************************************************
 *
 *   Copyright 2017 Walmart, Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *******************************************************************************/
package com.oneops.proxy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Login request for user authentication.
 *
 * @author Suresh
 */
public class LoginRequest {

    @JsonProperty
    public String username;

    @JsonProperty
    public String password;

    @JsonProperty
    public String domain; //For mgmt domain (prod/dev/stg)

    public LoginRequest() {
    }

    public LoginRequest(String username, String password, String domain) {
        this.username = username;
        this.password = password;
        this.domain = domain;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "username='" + username + '\'' +
                ", password=******" +
                ", domain='" + domain + '\'' +
                '}';
    }
}