package aethernadev.com.somethinglookupprototype2.location;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aethernadev.com.somethinglookupprototype2.location.ui.LocationLookupUIToPresenterListener;
import aethernadev.com.somethinglookupprototype2.lookup.base.LookupComponent;
import aethernadev.com.somethinglookupprototype2.lookup.ui.LookupUI;
import aethernadev.com.somethinglookupprototype2.transaction.Transaction;

/**
 * Created by Aetherna on 2015-12-07.
 */
public class LocationLookup implements LookupComponent<LocationItemModel>, LocationLookupUIToPresenterListener {

    private Map<LocationItemModel, View> items;

    private LinearLayout componentView;
    private LookupUI<LocationItemModel, LocationLookupUIToPresenterListener> lookupUI;

    public LocationLookup(LinearLayout componentView, LookupUI<LocationItemModel, LocationLookupUIToPresenterListener> lookupUI) {
        this.items = new HashMap<>();
        this.componentView = componentView;
        this.lookupUI = lookupUI;
        this.lookupUI.registerPresenterListener(this);
    }

    @Override
    public ViewGroup getComponentView() {
        return componentView;
    }

    @Override
    public void addItem(LocationItemModel item) {
        View lookup = lookupUI.createLookupFrom(item);
        items.put(item, lookup);
        componentView.addView(lookup);
    }

    @Override
    public void setValuesOnTransaction(Transaction transaction) {
        for (LocationItemModel item : items.keySet()) {
            transaction.addValue(item.getName(), item.getAddress());
        }
    }

    @Override
    public void onDeleteLookup(LocationItemModel itemModel) {
        componentView.removeView(items.get(itemModel));
        items.remove(itemModel);
    }
}
