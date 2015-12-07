package aethernadev.com.somethinglookupprototype2.somethinglookupprototype2.lookup.base;

import android.view.View;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import aethernadev.com.somethinglookupprototype2.location.LocationItemModel;
import aethernadev.com.somethinglookupprototype2.location.ui.LocationLookupLayout;
import aethernadev.com.somethinglookupprototype2.location.ui.LocationLookupUI;

import static junit.framework.Assert.*;

/**
 * Created by Aetherna on 2015-12-07.
 */
public class LocationLookupUITest {

    LocationLookupUI classUnderTest;

    @Before
    public void setUp() throws Exception {
        LocationLookupLayout layoutProvider = Mockito.mock(LocationLookupLayout.class);
        classUnderTest = new LocationLookupUI(layoutProvider);
    }

    @Test
    public void shouldCreateUIFromModel() {
        //having
        LocationItemModel location = new LocationItemModel();
        location.setName("Test");

        //when
        View view = classUnderTest.createLookupFrom(location);

        assertNotNull(view);
    }
}
