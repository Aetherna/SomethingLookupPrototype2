package aethernadev.com.somethinglookupprototype2.lookup.base;


import org.junit.Test;

import aethernadev.com.somethinglookupprototype2.location.LocationItemModel;

/**
 * Created by Aetherna on 2015-12-07.
 */

public class LocationLookupTest {

    LookupComponent lookupComponent;

    @Test
    public void shouldDisplayLookupOnAdd() {
        //having
        LocationItemModel model = new LocationItemModel();
        //when
        lookupComponent.addItem(model);
        //then

//       lookupComponent.getComponentView().getChildCount() == 1;
    }

    public void shouldSetValuesOnTransaction() {
    }

}
