package com.two;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx2 extends JFrame{
	
	public LabelEx2() {
		setTitle("LabelImg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel=new JLabel("사랑합니다.");
		
		//이미지 생성
		ImageIcon beauty=new ImageIcon("src/Images/apple.png");
		JLabel imageLabel=new JLabel(beauty);
		
		//문자열과 이미지
		ImageIcon normalIcon=new ImageIcon("src/Images/flying_sheart.png");
		JLabel label=new JLabel("전화하세요", normalIcon, SwingConstants.CENTER);
		
		add(textLabel);
		add(imageLabel);
		add(label);
		
		setSize(400,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx2();
	}
}
