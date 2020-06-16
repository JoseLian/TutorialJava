package discoDuroDeroer;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 * Clase implementa una calculadora PolacaInversaApp.
 * @author JJauregui
 *
 */
public class Ejercicio06 extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 250;
	private static final int FRAME_X = 150;
	private static final int FRAME_Y = 100;
	
	private JPanel buttonPanel;
	private JPanel inputOutPutPanel;
	private JTextField info;
	private boolean edit = true;
	
	public Ejercicio06() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
		buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		inputOutPutPanel = new JPanel();
		inputOutPutPanel.setLayout(new FlowLayout());
		inputOutPutPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		setTitle("Calculadora JAVA");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setLocation(FRAME_X, FRAME_Y);
		
		info = new JTextField();
		info.setFont(new Font("SansSerif", Font.PLAIN, 16));
		info.setBackground(Color.WHITE);
		info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		info.setPreferredSize(new Dimension(270, 35));
		info.addActionListener(this);
		inputOutPutPanel.add(info);
		contentPane.add(inputOutPutPanel);
		
		// Botones en la calculadora
		String digito[] = {"7", "8", "9", "/"
				, "4", "5", "6", "*"
				, "1", "2", "3", "-"
				, "0", ".", "=", "+"};
		
		for(String i: digito) {
			JButton button = new JButton(i);
			button.addActionListener(this);
			buttonPanel.add(button);
		}
		
		contentPane.add(buttonPanel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent event) {
		JButton clickButton = (JButton)event.getSource();
		
		if(clickButton.getText().equals("=")) {
			addOutPut();
		}
		else {
			addInput(clickButton.getText());
		}
	}
	
	public void addInput(String line) {
		if(edit) {
			info.setText(info.getText()+line);
		}else {
			info.setText(line);
			edit = true;
		}
	}
	
	public void addOutPut() {
		double outPut = 0;
		
		try {
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine motor = mgr.getEngineByName("JavaScript");
			info.setText(motor.eval(info.getText()).toString());
		}catch(ScriptException e) {
			info.setText("Error sintaxis");
		}
		
		edit = false;
	}
}
