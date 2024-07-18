package exercise;

// BEGIN
import io.javalin.*;
// END

public final class App {

    public static Javalin getApp() {

        // BEGIN
        Javalin app = Javalin.create();

        app.get("/welcome", ctx -> ctx.result("Welcome to Hexlet!"));

        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
