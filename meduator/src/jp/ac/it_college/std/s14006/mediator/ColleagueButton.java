package jp.ac.it_college.std.s14006.mediator;

import java.awt.Button;

/**
 * Created by kabotya on 15/06/18.
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
