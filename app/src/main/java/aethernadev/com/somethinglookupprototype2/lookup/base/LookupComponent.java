package aethernadev.com.somethinglookupprototype2.lookup.base;

import android.view.ViewGroup;

import aethernadev.com.somethinglookupprototype2.transaction.Transaction;

/**
 * Created by Aetherna on 2015-12-07.
 */
public interface LookupComponent<T extends ItemModel> {

    ViewGroup getComponentView();

    void addItem(T item);

    void setValuesOnTransaction(Transaction transaction);
}
