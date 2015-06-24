package jp.ac.it_college.std.s14006.chain_of_responsibility;

/**
 * Created by kabotya on 15/06/24.
 */
public class ChainOfResponsibilityMain {

    public ChainOfResponsibilityMain() {


        Support azrs = new NoSupport("azrs");
        Support kabotya = new LimitSupport("kabotya", 100);
        Support cloneko = new SpecialSupport("cloneko", 429);
        Support ito = new LimitSupport("ito", 200);
        Support usathon = new OddSupport("usathon");
        Support usao = new LimitSupport("usao", 300);

        azrs.setNext(kabotya).setNext(cloneko).setNext(ito).setNext(usathon).setNext(usao);

        for (int i = 0; i < 500; i++) {
            azrs.support(new Trouble(i));
        }
    }
}
