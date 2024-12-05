package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class NavBarModel{

    @ValueMapValue
    private String logoPath;

    @ValueMapValue
    private String logoAltText;

    @ChildResource
    private List<Resource> navItems;

    private List<NavItemModel> navItemModels;

    @PostConstruct
    protected void init() {
        if (navItems != null) {
            navItemModels = navItems.stream()
                    .map(resource -> resource.adaptTo(NavItemModel.class))
                    .collect(Collectors.toList());
        } else {
            navItemModels = Collections.emptyList();
        }
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getLogoAltText() {
        return logoAltText;
    }

    public List<NavItemModel> getNavItems() {
        return navItemModels;
    }


}
