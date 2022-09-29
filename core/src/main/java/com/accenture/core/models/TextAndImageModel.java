package com.accenture.core.models;

import com.adobe.cq.wcm.core.components.models.Teaser;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.via.ResourceSuperType;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, adapters = Teaser.class, resourceType = "training/components/textAndImage")
public class TextAndImageModel implements Teaser {

    @Self
    @Via(type = ResourceSuperType.class)
    private Teaser teaser;

    @Override
    public String getDescription() {
        String test = "yolo";
        return teaser.getDescription() + "\nDisclaimer: I'm an AEM Ninja";
    }
}
