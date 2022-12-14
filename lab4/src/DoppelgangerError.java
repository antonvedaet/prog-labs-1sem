public class DoppelgangerError extends Error {
    String message;

    DoppelgangerError(String message) {
        super(message);
    }
}
