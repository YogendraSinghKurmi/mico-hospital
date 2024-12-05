package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FooterSectionModel {

    @ValueMapValue
    private String logoPath;

    @ValueMapValue
    private String logoAltText;

    @ValueMapValue
    private String location;

    @ValueMapValue
    private String phone;

    @ValueMapValue
    private String email;

    @ChildResource
    private List<UsefulLinks> usefulLinks;

    @ChildResource
    private List<LatestPosts> latestPosts;

    @ChildResource
    private List<NewsLinks> newsLinks;

    public String getLogoPath() {
        return logoPath;
    }

    public String getLogoAltText() {
        return logoAltText;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<UsefulLinks> getUsefulLinks() {
        return usefulLinks;
    }

    public List<LatestPosts> getLatestPosts() {
        return latestPosts;
    }

    public List<NewsLinks> getNewsLinks() {
        return newsLinks;
    }
}
