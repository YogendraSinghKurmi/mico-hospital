package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Slides {

    @ValueMapValue
    private String sliderImage;

    @ValueMapValue
    private String sliderImageAltText;

    @ValueMapValue
    private String sliderContent;

    @ValueMapValue
    private String buttonLink;

    @ValueMapValue
    private String buttonName;

    public String getSliderImage() {
        return sliderImage;
    }

    public String getSliderImageAltText() {
        return sliderImageAltText;
    }

    public String getSliderContent() {
        return sliderContent;
    }

    public String getButtonLink() {
        return buttonLink;
    }

    public String getButtonName() {
        return buttonName;
    }
}
