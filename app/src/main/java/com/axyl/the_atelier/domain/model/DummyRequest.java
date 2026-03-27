package com.axyl.the_atelier.domain.model;

import androidx.annotation.NonNull;

public final class DummyRequest {
    @NonNull public final String slug;
    @NonNull public final String name;

    public DummyRequest(@NonNull String slug, @NonNull String name) {
        this.slug = slug;
        this.name = name;
    }
}

