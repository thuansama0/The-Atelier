package com.axyl.the_atelier.data.repository;

import androidx.annotation.NonNull;

import com.axyl.the_atelier.data.remote.ApiResultCallback;
import com.axyl.the_atelier.data.remote.VolleyClient;
import com.axyl.the_atelier.domain.model.DummyRequest;

import org.json.JSONException;
import org.json.JSONObject;

public final class DummyRepository {
    private final VolleyClient client;

    public DummyRepository(@NonNull VolleyClient client) {
        this.client = client;
    }

    public void postDummy(@NonNull DummyRequest req, @NonNull ApiResultCallback<JSONObject> callback) {
        JSONObject body = new JSONObject();
        try {
            body.put("name", req.name);
        } catch (JSONException e) {
            callback.onError(new com.axyl.the_atelier.data.remote.ApiError(-1, null, e.getMessage()));
            return;
        }

        client.postJson("/dummy/" + req.slug, body, null, callback);
    }
}

