package com.codgen.virtualcatalog.api.beans.user.decl;

import com.codgen.virtualcatalog.domain.StoreUser;

/**
 * Created by vicente on 04/03/15.
 */
public interface UserFinder {

    StoreUser find(Long id);

    StoreUser get(Long id);

    StoreUser findByEmail(String email);

    StoreUser getByEmail(String email);
}
