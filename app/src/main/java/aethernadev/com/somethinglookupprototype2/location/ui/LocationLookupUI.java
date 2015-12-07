package aethernadev.com.somethinglookupprototype2.location.ui;

import android.view.View;
import android.widget.TextView;

import aethernadev.com.somethinglookupprototype2.R;
import aethernadev.com.somethinglookupprototype2.lookup.layoutprovider.LayoutProvider;
import aethernadev.com.somethinglookupprototype2.location.LocationItemModel;
import aethernadev.com.somethinglookupprototype2.lookup.ui.LookupUI;

/**
 * Created by Aetherna on 2015-12-07.
 */
public class LocationLookupUI implements LookupUI<LocationItemModel, LocationLookupUIToPresenterListener> {

    private LayoutProvider layoutProvider;
    private LocationLookupUIToPresenterListener listener;

    public LocationLookupUI(LayoutProvider layoutProvider) {
        this.layoutProvider = layoutProvider;
    }

    @Override
    public View createLookupFrom(LocationItemModel itemModel) {

        View locationLookup = layoutProvider.getLayout();
        ((TextView) locationLookup.findViewById(R.id.locationName)).setText(itemModel.getName());
        locationLookup.findViewById(R.id.deleteLookup).setOnClickListener(view -> listener.onDeleteLookup(itemModel));
        return locationLookup;
    }

    @Override
    public void registerPresenterListener(LocationLookupUIToPresenterListener listener) {
        this.registerPresenterListener(listener);
    }
}
