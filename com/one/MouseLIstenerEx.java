package com.one;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseLIstenerEx extends JFrame {
	private JLabel la=new JLabel("No Mouse Event");
	
	public MouseLIstenerEx() {
		setTitle("MouseMotion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener=new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(la);
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setFont(new Font("±Ã¼­Ã¼", Font.BOLD, 20));
			la.setForeground(Color.blue);
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");		
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
			la.setForeground(Color.blue);
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			//»ö»ó ·£´ýÃ³¸®
			if (e.getClickCount()==2) {
				int r=(int)(Math.random()*256);//0~255
				int g=(int)(Math.random()*256);
				int b=(int)(Math.random()*256);
				
				Component c=(Component) e.getSource();
				c.setBackground(new Color(r,b,g));
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c=(Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c=(Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased ("+e.getX()+","+e.getY()+")");	
		}
	}
	
	public static void main(String[] args) {
		new MouseLIstenerEx();
	}
}
