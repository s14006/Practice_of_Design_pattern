package jp.ac.it_college.std.s14006.state;

import javax.naming.Context;

/**
 * Created by kabotya on 15/06/18.
 */
public interface State {

    public abstract void doClock(Context context, int hour);
    public abstract void doUse(Context context);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}
