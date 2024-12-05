package com.yogi.mico.hospital.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class RelatedArticleItemModel {

    @ValueMapValue
    private String paths;

    @ValueMapValue
    private String titles;

    public String getPaths() {
        return paths;
    }

    public String getTitles() {
        return titles;
    }


}
