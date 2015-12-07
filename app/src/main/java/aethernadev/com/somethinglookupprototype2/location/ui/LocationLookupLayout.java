package aethernadev.com.somethinglookupprototype2.location.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import aethernadev.com.somethinglookupprototype2.R;
import aethernadev.com.somethinglookupprototype2.lookup.layoutprovider.LayoutProvider;

/**
 * Created by Aetherna on 2015-12-07.
 */
public class LocationLookupLayout implements LayoutProvider {

    private Context context;

    public LocationLookupLayout(Context context) {
        this.context = context;
    }

    @Override
    public View getLayout() {
        return LayoutInflater.from(context).inflate(R.layout.location_lookup, null);
    }
}
