package com.firti.webservice.exceptions.notfound;

public class ApartmentNotFoundException extends NotFoundException {
    public ApartmentNotFoundException() {
        super();
    }

    public ApartmentNotFoundException(String s) {
        super(s);
    }
}