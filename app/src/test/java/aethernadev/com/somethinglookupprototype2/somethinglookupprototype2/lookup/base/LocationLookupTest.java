package aethernadev.com.somethinglookupprototype2.somethinglookupprototype2.lookup.base;


import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.configuration.injection.MockInjection;

import aethernadev.com.somethinglookupprototype2.location.LocationItemModel;
import aethernadev.com.somethinglookupprototype2.location.LocationLookup;
import aethernadev.com.somethinglookupprototype2.location.ui.LocationLookupUI;
import aethernadev.com.somethinglookupprototype2.lookup.base.LookupComponent;
import aethernadev.com.somethinglookupprototype2.transaction.Transaction;

import static junit.framework.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Aetherna on 2015-12-07.
 */

public class LocationLookupTest {

    LocationLookup lookupComponent;

    @Before
    public void setUp() throws Exception {
        LinearLayout viewGroup = mock(LinearLayout.class);
        LocationLookupUI ui = mock(LocationLookupUI.class);
        lookupComponent = new LocationLookup(viewGroup, ui);
    }

    @Test
    public void shouldDisplayLookupOnAdd() {
        //having

        LocationItemModel model = new LocationItemModel();
        model.setName("test");
        //when
        lookupComponent.addItem(model);
        //then
//        verify(viewGroup, times(1)).addView();
//        assertEquals(1, lookupComponent.getComponentView().getChildCount());
    }

    @Test
    public void shouldSetValuesOnTransaction() {
        //having
        LocationItemModel model1 = new LocationItemModel();
        model1.setName("test1");
        model1.setAddress("address1");
        LocationItemModel model2 = new LocationItemModel();
        model2.setName("test2");
        model2.setAddress("address2");

        lookupComponent.addItem(model1);
        lookupComponent.addItem(model2);

        Transaction transaction = new Transaction();

        //when
        lookupComponent.setValuesOnTransaction(transaction);

        //then
        assertEquals(2, transaction.getValues().keySet().size());
        assertEquals("address1", transaction.getValues().get("test1"));
        assertEquals("address2", transaction.getValues().get("test2"));
    }

}
