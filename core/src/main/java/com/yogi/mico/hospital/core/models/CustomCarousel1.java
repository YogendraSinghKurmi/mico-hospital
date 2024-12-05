package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;


@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CustomCarousel1 {

    @ChildResource
    private List<Slides> slides;

    @ValueMapValue
    private String prevButtonImage;

    @ValueMapValue
    private String nextButtonImage;

    @ValueMapValue
    private String backgroundImage;

    public List<Slides> getSlides() {
        return slides;
    }

    public String getPrevButtonImage() {
        return prevButtonImage;
    }

    public String getNextButtonImage() {
        return nextButtonImage;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }
}
