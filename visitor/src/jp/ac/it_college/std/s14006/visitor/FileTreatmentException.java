package jp.ac.it_college.std.s14006.visitor;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by kabotya on 15/06/17.
 */
public class FileTreatmentException extends RuntimeException {

    public FileTreatmentException() {}

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
