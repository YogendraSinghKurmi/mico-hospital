package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LatestPosts {
    @ValueMapValue
    private String postImage;

    @ValueMapValue
    private String postTitle;

    public String getPostImage() {
        return postImage;
    }

    public String getPostTitle() {
        return postTitle;
    }
}
