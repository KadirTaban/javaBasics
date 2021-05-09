package homeWork03.src.project.core;

import homeWork03.src.project.googleAuth.GoogleAuthManager;

public class AuthAdapter implements AuthService{

    @Override
    public void logToSystem(String message) {
        GoogleAuthManager manager = new GoogleAuthManager();
        manager.register(message);
    }
}
