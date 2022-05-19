package org.loose.fis.sre.exceptions;

public class InvalidFlightIdException extends Exception{
    public InvalidFlightIdException(){
        super("A flight with the same ID already exists.");
    }
}
