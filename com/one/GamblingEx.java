package com.one;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamblingEx extends JFrame implements ActionListener{
	private JLabel[] labels;
	private JButton button;
	private int[] numbers;
	JLabel rLabel;
	
	public GamblingEx() {
		setTitle("Open Challenge 10");
		JPanel panel=new JPanel();
		
		panel.setLayout(null);
		
		labels=new JLabel[3];
		rLabel=new JLabel("레고");
		numbers=new int[3];
		
		//for문으로 label을 적용
		for (int i = 0; i < labels.length; i++) {
			labels[i]=new JLabel("0");
			labels[i].setFont(new Font("impact", Font.BOLD, 100));
			labels[i].setSize(100,100);
			labels[i].setLocation(100+100*i, 20);
			panel.add(labels[i]);
		}
		rLabel.setSize(200, 100);
		rLabel.setLocation(150, 100);
		panel.add(rLabel);
		
		//돌려버튼
		button=new JButton("가즈아");
		button.setSize(250,50);
		button.setLocation(100, 180);
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);
		setSize(500,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");
		for (int i = 0; i < labels.length; i++) {
			numbers[i]=(int)(Math.random()*5);
			labels[i].setText(""+numbers[i]);
		}
		
		boolean flag=(numbers[0]==numbers[1]&&numbers[0]==numbers[2]);
		if (flag) {
			rLabel.setText("ㅊㅋ");
		}
		
		
	}
	public static void main(String[] args) {
		new GamblingEx();
	}
}
