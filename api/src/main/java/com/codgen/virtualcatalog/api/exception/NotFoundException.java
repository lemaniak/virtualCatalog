package com.codgen.virtualcatalog.api.exception;



import com.codgen.virtualcatalog.exceptions.ServiceException;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class NotFoundException extends ServiceException {
    public NotFoundException(String message) {
        super("user.not.found");
    }
}
