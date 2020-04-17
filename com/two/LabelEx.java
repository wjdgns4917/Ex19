package com.two;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx extends JFrame{
	
	public LabelEx() {
		setTitle("LabelImg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel=new JLabel("사랑합니다.");
		
		//이미지 생성
		ImageIcon beauty=new ImageIcon("apple.png");
		JLabel imageLabel=new JLabel(beauty);
		
		add(textLabel,BorderLayout.CENTER);
		add(imageLabel,BorderLayout.NORTH);
		
		
		setSize(400,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx();
	}
}
