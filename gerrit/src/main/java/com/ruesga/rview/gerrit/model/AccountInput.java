/*
 * Copyright (C) 2016 Jorge Ruesga
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ruesga.rview.gerrit.model;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * @link "https://gerrit-review.googlesource.com/Documentation/rest-api-accounts.html#account-input"
 */
public class AccountInput {
    @Nullable @SerializedName("name") public String name;
    @Nullable @SerializedName("email") public String email;
    @Nullable @SerializedName("ssh_key") public String sshKey;
    @Nullable @SerializedName("http_password") public String httpPassword;
    @Nullable @SerializedName("groups") public String[] groups;
}

