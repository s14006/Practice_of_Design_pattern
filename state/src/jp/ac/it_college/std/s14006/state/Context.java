package jp.ac.it_college.std.s14006.state;

/**
 * Created by kabotya on 15/06/24.
 */
public interface Context {

    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recordLog(String msg);
}
