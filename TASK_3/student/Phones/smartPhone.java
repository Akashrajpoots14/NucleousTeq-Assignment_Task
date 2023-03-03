package TASK_3.student.Phones;

public class smartPhone extends Phone implements camera,MusicPlayer{

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void click() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'click'");
    }

    @Override
    public void record() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'record'");
    }
    @Override
    public void call() {
        super.call();
    }

    @Override
    public void sms() {
        super.sms();
    }
}
