package sda.mg.jz127.thread;

public class LineMain {
    public static void main(String[] args) {
        Line line = new Line();
        Thread t1 = new LineThread(line);
        Thread t2 = new LineThread(line);
        t1.start();
        t2.start();
    }

    private static class LineThread extends Thread {
        private final Line line;

        private LineThread(Line line) {
            this.line = line;
        }

        @Override
        public void run() {
            line.getLine(10, 1);
        }
    }
}
