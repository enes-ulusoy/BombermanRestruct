import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ValidateActionListener implements ActionListener{
	
	GamePanel panel;
	int playerNumber;
	JTextField name1Field;
	JTextField name2Field;
	JTextField name3Field;
	JTextField name4Field;
	String name1;
	String name2;
	String name3;
	String name4;
	
	public ValidateActionListener(GamePanel panel, JTextField name1Field, JTextField name2Field, JTextField name3Field, JTextField name4Field, int playerNumber){
		this.panel = panel;
		this.playerNumber = playerNumber;
		this.name1Field = name1Field;
		this.name2Field = name2Field;
		this.name3Field = name3Field;
		this.name4Field = name4Field;
	}
	
	public void actionPerformed(ActionEvent e){
		if (playerNumber == 2){
			name1 = name1Field.getText();
			name2 = name2Field.getText();
			panel.setName(name1);
			panel.setName(name2);
		}
		
		else if (playerNumber == 3){
			name1 = name1Field.getText();
			name2 = name2Field.getText();
			name3 = name3Field.getText();
			panel.setName(name1);
			panel.setName(name2);
			panel.setName(name3);
		}

		else if (playerNumber == 4){
			name1 = name1Field.getText();
			name2 = name2Field.getText();
			name3 = name3Field.getText();
			name4 = name4Field.getText();
			panel.setName(name1);
			panel.setName(name2);
			panel.setName(name3);
			panel.setName(name4);
		}
		
		//Va créer les joueurs en question
		System.out.println(name1 + playerNumber);
		panel.createPlayers(playerNumber);
		
		
	}
}
