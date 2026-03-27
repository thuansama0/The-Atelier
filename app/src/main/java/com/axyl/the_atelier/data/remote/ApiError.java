package com.axyl.the_atelier.data.remote;

import androidx.annotation.Nullable;

public final class ApiError {
    public final int statusCode;
    @Nullable public final String body;
    @Nullable public final String message;

    public ApiError(int statusCode, @Nullable String body, @Nullable String message) {
        this.statusCode = statusCode;
        this.body = body;
        this.message = message;
    }

    @Override
    public String toString() {
        String code = statusCode > 0 ? ("HTTP " + statusCode) : "Network error";
        String msg = message == null ? "" : ("\n" + message);
        String b = body == null || body.isEmpty() ? "" : ("\n\n" + body);
        return code + msg + b;
    }
}
