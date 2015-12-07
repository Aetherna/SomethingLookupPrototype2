package aethernadev.com.somethinglookupprototype2.location;

import aethernadev.com.somethinglookupprototype2.lookup.base.ItemModel;

/**
 * Created by Aetherna on 2015-12-07.
 */
public class LocationItemModel implements ItemModel {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationItemModel that = (LocationItemModel) o;

        if (!name.equals(that.name)) return false;
        return address.equals(that.address);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
