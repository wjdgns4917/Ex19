package com.two;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{

	public CheckBoxEx() {
		setTitle("체크박스 버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon=new ImageIcon("src/Images/button_play_pink.png");
		ImageIcon selectedIcon=new ImageIcon("src/Images/button_plus_blue.png");
		
		JCheckBox apple=new JCheckBox("사과");
		JCheckBox pear=new JCheckBox("배",true);
		JCheckBox cherry=new JCheckBox("체리",cherryIcon);
		
		apple.setBorderPainted(true);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
