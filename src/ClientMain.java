import javax.swing.JFrame;
public class ClientMain {
	public static void main(String[] args) {
		Client cl;
		cl = new Client("127.0.0.1");
		cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cl.startRunning();
	}
}