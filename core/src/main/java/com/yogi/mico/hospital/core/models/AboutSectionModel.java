package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AboutSectionModel {

    @ValueMapValue
    private String imagePath;

    @ValueMapValue
    private String imageAltText;

    @ValueMapValue
    private String aboutContent;

    @ValueMapValue
    private String buttonLink;

    @ValueMapValue
    private String buttonName;

    public String getImagePath() {
        return imagePath;
    }

    public String getImageAltText() {
        return imageAltText;
    }

    public String getAboutContent() {
        return aboutContent;
    }

    public String getButtonLink() {
        return buttonLink;
    }

    public String getButtonName() {
        return buttonName;
    }
}
