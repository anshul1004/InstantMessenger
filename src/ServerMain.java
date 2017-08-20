import javax.swing.JFrame;
public class ServerMain {
	public static void main(String[] args) {
		Server ser = new Server();
		ser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ser.startRunning();
	}
}