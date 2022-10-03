package com.accenture.core.models;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;

import org.apache.sling.models.factory.ModelFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.apache.sling.api.resource.Resource;
import com.accenture.core.models.IconListModel;

@ExtendWith({ AemContextExtension.class, MockitoExtension.class })
public class IconListModelTest {

    private final AemContext ctx = new AemContext();

    @Mock
    private IconListModel iconListModel;

    // @Mock
    // private ModelFactory modelFactory;

    @BeforeEach
    void setUp() throws Exception {
        ctx.addModelsForClasses(IconListModel.class);

        ctx.load().json("/com/accenture/core/models/IconListModelTest.json", "/content");
        // lenient().when(modelFactory.getModelFromWrappedRequest(eq(ctx.request()),
        // any(Resource.class), eq(IconListModel.class)))
        // .thenReturn(iconListModel);

        // ctx.registerService(ModelFactory.class, modelFactory,
        // org.osgi.framework.Constants.SERVICE_RANKING,
        // Integer.MAX_VALUE);
    }

    @Test
    void testGetIcon1() {
        final String expected = "fa-cloud";

        ctx.currentResource("/content/iconlist");
        iconListModel = ctx.currentResource().adaptTo(IconListModel.class);
        String actual = iconListModel.getIcon1();

        assertEquals(expected, actual);
    }

    @Test
    void testGetTitle() {
        final String expected = "Test title";

        ctx.currentResource("/content/title");
        iconListModel = ctx.currentResource().adaptTo(IconListModel.class);
        String actual = iconListModel.getTitle();

        assertEquals(expected, actual);
    }

    @Test
    void testGetDescription() {
        final String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam sed luctus orci. Nullam ut risus volutpat, convallis justo et, fringilla lacus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.";

        ctx.currentResource("/content/description");
        iconListModel = ctx.currentResource().adaptTo(IconListModel.class);
        String actual = iconListModel.getDescription();

        assertEquals(expected, actual);
    }
}
