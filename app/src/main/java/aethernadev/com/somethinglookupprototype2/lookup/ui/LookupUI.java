package aethernadev.com.somethinglookupprototype2.lookup.ui;

import android.view.View;

import aethernadev.com.somethinglookupprototype2.lookup.base.ItemModel;

/**
 * Created by Aetherna on 2015-12-07.
 */
public interface LookupUI<T extends ItemModel, S extends UIToPresenterListener> {

    View createLookupFrom(T itemModel);

    void registerPresenterListener(S listener);
}
