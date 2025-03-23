package ghidrathon;

public class GhidrathonInterpreterExitException extends RuntimeException {
  public GhidrathonInterpreterExitException() {
    super("Ghidrathon interpreter requested exit");
  }
}
