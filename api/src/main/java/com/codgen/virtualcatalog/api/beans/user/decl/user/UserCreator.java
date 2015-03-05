package com.codgen.virtualcatalog.api.beans.user.decl.user;

import com.codgen.virtualcatalog.domain.StoreUser;

/**
 * Created by vicente on 04/03/15.
 */
public interface UserCreator {
    public StoreUser create(StoreUser storeUser);
}
