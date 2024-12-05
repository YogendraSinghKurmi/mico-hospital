package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Treatments {

    @ValueMapValue
    private String iconImage;

    @ValueMapValue
    private String iconImageAltText;

    @ValueMapValue
    private String treatmentDescription;

    @ValueMapValue
    private String treatmentName;

    public String getIconImage() {
        return iconImage;
    }

    public String getIconImageAltText() {
        return iconImageAltText;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public String getTreatmentName() {
        return treatmentName;
    }
}
