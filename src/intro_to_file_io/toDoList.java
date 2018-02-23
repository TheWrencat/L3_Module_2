package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class toDoList implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton addTask;
	JButton removeTask;
	JButton save;
	JButton load;
	
	void setup(){
		frame = new JFrame();
		panel = new JPanel();
		addTask = new JButton();
		removeTask = new JButton();
		save = new JButton();
		load = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addTask);
		panel.add(removeTask);
		panel.add(save);
		panel.add(load);
		addTask.addActionListener(this);
		removeTask.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
