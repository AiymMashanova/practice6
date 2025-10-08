public class morfTask5{
    public static void main(String[] args) {
        Sports s1 = new Football();
        Sports s2 = new Basketball();
        Sports s3 = new Rugby();

        s1.play();
        s2.play();
        s3.play();
    }
}

class Sports {
    public void play() {
        System.out.println("Playing a sport..");
    }
}

class Football extends Sports {
    public void play() {
        System.out.println("Playing football!");
    }
}

class Basketball extends Sports {
    public void play() {
        System.out.println("Playing basketball!");
    }
}

class Rugby extends Sports {
    public void play() {
        System.out.println("Playing rugby!");
    }
}
