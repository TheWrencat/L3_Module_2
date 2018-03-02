package intro_to_file_io;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class toDoList implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton addTask;
	JButton removeTask;
	JButton showTasks;
	JButton save;
	JButton load;
	String newTask;
	ArrayList<String> pendingTasks = new ArrayList<String>();
	
	void setup(){
		frame = new JFrame();
		panel = new JPanel();
		addTask = new JButton();
		removeTask = new JButton();
		showTasks = new JButton();
		save = new JButton();
		load = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addTask);
		panel.add(removeTask);
		panel.add(showTasks);
		panel.add(save);
		panel.add(load);
		addTask.setText("Add task");
		removeTask.setText("Remove oldest task");
		showTasks.setText("Show current tasks");
		save.setText("Save");
		load.setText("Load");
		addTask.addActionListener(this);
		removeTask.addActionListener(this);
		showTasks.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		
		frame.pack();
		
	}
	
	public static void main(String[] args) {
		toDoList todo = new toDoList();
		todo.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addTask)) {
			newTask = JOptionPane.showInputDialog("Add a task to your To-Do List.");
			pendingTasks.add(newTask);
		}
		if(e.getSource().equals(removeTask)) {
			pendingTasks.remove(0);
		}
		if(e.getSource().equals(showTasks)) {
			System.out.println(pendingTasks);
		}
		if(e.getSource().equals(save)) {
			try {
				String writer;
				FileWriter file = new FileWriter("src/intro_to_file_io/ToDoList.txt");
				for(int i=0;  i<pendingTasks.size(); i++) {
					writer = pendingTasks.get(i);
					file.write("* " + writer + "\n");
				}
				pendingTasks.clear();
				file.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		if(e.getSource().equals(load)) {
			try {
				
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/ToDoList.txt"));
				String loadedTasks = "";
				String line = br.readLine();
				while(line != null){
					loadedTasks = line;
					pendingTasks.add(loadedTasks); 
					line = br.readLine();
				}
				
				br.close();
		} catch (Exception e1) {
			// TODO: handle exception
		}
		}
	}
}
