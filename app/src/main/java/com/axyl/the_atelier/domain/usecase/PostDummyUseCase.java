package com.axyl.the_atelier.domain.usecase;

import androidx.annotation.NonNull;

import com.axyl.the_atelier.data.remote.ApiResultCallback;
import com.axyl.the_atelier.data.repository.DummyRepository;
import com.axyl.the_atelier.domain.model.DummyRequest;

import org.json.JSONObject;

public final class PostDummyUseCase {
    private final DummyRepository repository;

    public PostDummyUseCase(@NonNull DummyRepository repository) {
        this.repository = repository;
    }

    public void execute(@NonNull DummyRequest req, @NonNull ApiResultCallback<JSONObject> callback) {
        repository.postDummy(req, callback);
    }
}

