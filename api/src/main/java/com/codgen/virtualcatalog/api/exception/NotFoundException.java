package com.codgen.virtualcatalog.api.exception;



import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class NotFoundException extends ServiceException {
    public NotFoundException(String message) {
        super("com.petzila.api.validation.constraints.UnknownError.message");
    }
}
