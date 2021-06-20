package SelfPractice.practiceConstructors.persone;

public class Ball {

    static {
        System.out.println("execute");
    }
    boolean canBounce;
    String color;

    @Override
    public String toString() {
        return "Ball{" +
                "canBounce=" + canBounce +
                ", color='" + color + '\'' +
                '}';
    }

    public void playBall(String clorful, boolean bounce){
        color=clorful;
        canBounce=bounce;

    }
    public static void main(String[] args) {
        Ball ball = new Ball();
        String color;
        color="red";
        System.out.println(ball.color);
        ball.playBall("blue",true);
        System.out.println(ball);
        Ball newBall =new Ball();
        Ball fghj = new Ball();
        System.out.println(fghj);
    }
}
