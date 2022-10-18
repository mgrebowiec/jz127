package sda.mg.jz127.thread;

public class LottoMain {

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Thread t1 = new LottoThread(lotto);
        Thread t2 = new LottoThread(lotto);
        Thread t3 = new LottoThread(lotto);

        t1.start();
        t2.start();
        t3.start();

    }

    private static class LottoThread extends Thread {
        private Lotto lotto;

        public LottoThread(Lotto lotto) {
            this.lotto = lotto;
        }

        @Override
        public void run() {
            lotto.start(6);
        }
    }

}
