import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class HomeActionListener implements ActionListener{
	GamePanel panel;
	JPanel subPanel;
	
	public HomeActionListener(GamePanel panel, JPanel subPanel){
		this.panel = panel;
		this.subPanel = subPanel;
	}
	
	public void actionPerformed(ActionEvent e){
		panel.returnHome(subPanel);
	}
}
