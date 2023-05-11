package Sessions;

import java.awt.Frame;

public class Myframe extends Frame {
	public Myframe(boolean visible, String Title, int x, int y, int width, int height) {
	this.setVisible(visible);
	this.setTitle(Title);
	this.setBounds(x, y, width, height);
	this.setLayout(null);
	this.addWindowListener(new WindowHandler());
}
}