package com.axyl.the_atelier.data.remote;

import androidx.annotation.NonNull;

public interface ApiResultCallback<T> {
    void onSuccess(@NonNull T data);
    void onError(@NonNull ApiError error);
}

