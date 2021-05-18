package App;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeScreen extends JPanel {
	private JButton createQuiz;
	private JButton takeQuiz;
	private static ActionListener editQuizAction = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			App.editQuiz();
		}
	};
	public HomeScreen() {
		super();
		// set layout to a boxlayout
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		// init buttons
		createQuiz = new JButton("Create Quiz");
		takeQuiz = new JButton("Take Quiz");
		createQuiz.addActionListener(editQuizAction);
		// init title
		JLabel title = new JLabel("<html><h1>Welcome!</h1></html>", JLabel.CENTER);
		// align buttons and title in the middle horizontally
		createQuiz.setAlignmentX(Component.CENTER_ALIGNMENT);
		takeQuiz.setAlignmentX(Component.CENTER_ALIGNMENT);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		// add title
		add(title);
		// add buttons
		add(createQuiz);
		add(takeQuiz);
	}
}
