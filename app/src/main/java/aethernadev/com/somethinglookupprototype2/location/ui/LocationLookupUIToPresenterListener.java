package aethernadev.com.somethinglookupprototype2.location.ui;

import aethernadev.com.somethinglookupprototype2.location.LocationItemModel;
import aethernadev.com.somethinglookupprototype2.lookup.ui.UIToPresenterListener;

/**
 * Created by Aetherna on 2015-12-08.
 */
public interface LocationLookupUIToPresenterListener extends UIToPresenterListener {

    void onDeleteLookup(LocationItemModel itemModel);
}
