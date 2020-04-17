package com.two;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{

	public ButtonEx() {
		setTitle("이미지 버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		//3개의 이미지 파일
		ImageIcon normalIcon=new ImageIcon("src/Images/button_play_pink.png");
		ImageIcon rolloverIcon=new ImageIcon("src/Images/button_plus_blue.png");
		ImageIcon pressedIcon=new ImageIcon("src/Images/button_play_pink.png");
			
		JButton btn=new JButton("call~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}
}
