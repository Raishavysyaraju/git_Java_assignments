package Mathsprog;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Myframe mf=(Myframe)e.getSource();
		//mf.disable();
		System.out.println("Mouse got clicked in:"+mf.getTitle());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
