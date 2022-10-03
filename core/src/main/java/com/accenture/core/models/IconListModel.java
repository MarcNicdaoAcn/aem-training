package com.accenture.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class IconListModel {

    @ValueMapValue
    private String icon1;

    @ValueMapValue
    private String icon2;

    @ValueMapValue
    private String icon3;

    @ValueMapValue
    private String icon4;

    @ValueMapValue
    private String icon5;

    @ValueMapValue
    private String icon6;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    public String getIcon1() {
        return icon1;
    }

    public String getIcon2() {
        return icon2;
    }

    public String getIcon3() {
        return icon3;
    }

    public String getIcon4() {
        return icon4;
    }

    public String getIcon5() {
        return icon5;
    }

    public String getIcon6() {
        return icon6;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
