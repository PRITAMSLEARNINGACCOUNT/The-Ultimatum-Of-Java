class TommyVecetti {
    public void Hit() {
        System.out.println("Hitting...");
    }

    public void Fire() {
        System.out.println("Firing...");
    }

    public void Run() {
        System.out.println("Running...");
    }
}

public class Practice_5 {
    public static void main(String[] args) {
        TommyVecetti Player = new TommyVecetti();
        Player.Hit();
        Player.Fire();
        Player.Run();
    }
}
