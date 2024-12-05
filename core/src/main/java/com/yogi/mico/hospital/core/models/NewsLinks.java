package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NewsLinks {

    @ValueMapValue
    private String newsImage;

    @ValueMapValue
    private String newsTitle;

    public String getNewsImage() {
        return newsImage;
    }

    public String getNewsTitle() {
        return newsTitle;
    }
}
