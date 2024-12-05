package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TreatmentSectionModel {

    @ValueMapValue
    private String sideImagePath;

    @ChildResource
    private List<Treatments> treatments;

    public String getSideImagePath() {
        return sideImagePath;
    }

    public List<Treatments> getTreatments() {
        return treatments;
    }
}
