

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class GUIController {
	
	String name = "none";
	
	@FXML
	private TextField nameText;
	
    @FXML
    private TextField in1;
    


    @FXML
    private TextField in2;
    


    @FXML
    private TextField in3;
    
    

    @FXML
    private TextField in4;
    


    @FXML
    private TextField in5;
    


    @FXML
    private TextField in6;
    


    @FXML
    private TextField in7;
    


    @FXML
    private TextField in8;
    


    @FXML
    private TextField out1;
    


    @FXML
    private TextField out2;
    


    @FXML
    private TextField out3;
    


    @FXML
    private TextField out4;
    


    @FXML
    private TextField out5;
    


    @FXML
    private TextField out6;
    


    @FXML
    private TextField out7;
    


    @FXML
    private TextField out8;
    


    @FXML
    private TextField in9;
    


    @FXML
    private TextField in10;
    


    @FXML
    private TextField in11;
    


    @FXML
    private TextField in12;
    

    @FXML
    private TextField in13;
    


    @FXML
    private TextField in14;
    


    @FXML
    private TextField in15;
    


    @FXML
    private TextField in16;
    


    @FXML
    private TextField out9;
    


    @FXML
    private TextField out10;
    


    @FXML
    private TextField out11;
    


    @FXML
    private TextField out12;
    
 

    @FXML
    private TextField out13;
    


    @FXML
    private TextField out14;
    


    @FXML
    private TextField out15;
    


    @FXML
    private TextField out16;
    


    @FXML
    private TextField in17;
    


    @FXML
    private TextField in18;
    


    @FXML
    private TextField in19;
    


    @FXML
    private TextField in20;
    


    @FXML
    private TextField in21;
    


    @FXML
    private TextField in22;
    


    @FXML
    private TextField in23;
    


    @FXML
    private TextField in24;
    


    @FXML
    private TextField out17;
    


    @FXML
    private TextField out18;
    


    @FXML
    private TextField out19;
    


    @FXML
    private TextField out20;
    


    @FXML
    private TextField out21;
    


    @FXML
    private TextField out22;
    


    @FXML
    private TextField out23;
    


    @FXML
    private TextField out24;
    


    @FXML
    private TextField in25;
    


    @FXML
    private TextField in26;
    

    @FXML
    private TextField in27;
    


    @FXML
    private TextField in28;
    


    @FXML
    private TextField in29;
    


    @FXML
    private TextField in30;
    


    @FXML
    private TextField in31;
    


    @FXML
    private TextField salary;

    @FXML
    private TextField out25;
    


    @FXML
    private TextField out26;
    


    @FXML
    private TextField out27;
    


    @FXML
    private TextField out28;
    


    @FXML
    private TextField out29;
    


    @FXML
    private TextField out30;
    


    @FXML
    private TextField out31;
    


    @FXML
    private Text salaryText;
    
    
    
    public static double salaryInt = 0;
    
    

    @FXML
    private Text avgDaysText;
    
    
    
    public double calculateOverHours(double hour, double minutes) {
    	double result = 0;
    	
        double salaryOHone = salaryInt*125/100;
        
        double salaryOHtwo = salaryInt*150/100;
    	
    	if(hour >= 8) {
    		result += 8 * salaryInt;
    		hour -= 8;
    		if(hour >= 2) {
    			result += 2 * salaryOHone;
    			hour -= 2;
    			result += hour * salaryOHtwo;
    			result += salaryOHtwo/60*minutes;
    		}else {
    			result += hour * salaryOHone;
    			result += salaryOHone/60*minutes;
    		}
    	}else {
    		result += hour * salaryInt;
    		result += salaryInt/60*minutes;
    	}
    	return result;
    }
    

    @FXML
    private Text totalEH100;

    @FXML
    private Text totalEH125;

    @FXML
    private Text totalEH150;

    @FXML
    private Text salaryInfo;

    @FXML
    private Text salaryInfo125;

    @FXML
    private Text salaryInfo150;

    @FXML
    public void calculateButton(ActionEvent event) {
    	updateInfo();
    }
    
    @FXML
    void openSalary(ActionEvent event) {
    	Main.openSalary();
    }
    
    @FXML
    void closeSalary(ActionEvent event) {
    	if(salary.getText().equals(""))
    		salary.setText("0");
    	salaryInt = Double.parseDouble(salary.getText());
    	Main.closeSalary();
    }
    

    @FXML
    void resetValues(ActionEvent event) {
    	in1.setText("0");
    	in2.setText("0");
    	in3.setText("0");
    	in4.setText("0");
    	in5.setText("0");
    	in6.setText("0");
    	in7.setText("0");
    	in8.setText("0");
    	in9.setText("0");
    	in10.setText("0");
    	in11.setText("0");
    	in12.setText("0");
    	in13.setText("0");
    	in14.setText("0");
    	in15.setText("0");
    	in16.setText("0");
    	in17.setText("0");
    	in18.setText("0");
    	in19.setText("0");
    	in20.setText("0");
    	in21.setText("0");
    	in22.setText("0");
    	in23.setText("0");
    	in24.setText("0");
    	in25.setText("0");
    	in26.setText("0");
    	in27.setText("0");
    	in28.setText("0");
    	in29.setText("0");
    	in30.setText("0");
    	in31.setText("0");
    	out1.setText("0");
    	out2.setText("0");
    	out3.setText("0");
    	out4.setText("0");
    	out5.setText("0");
    	out6.setText("0");
    	out7.setText("0");
    	out8.setText("0");
    	out9.setText("0");
    	out10.setText("0");
    	out11.setText("0");
    	out12.setText("0");
    	out13.setText("0");
    	out14.setText("0");
    	out15.setText("0");
    	out16.setText("0");
    	out17.setText("0");
    	out18.setText("0");
    	out19.setText("0");
    	out20.setText("0");
    	out21.setText("0");
    	out22.setText("0");
    	out23.setText("0");
    	out24.setText("0");
    	out25.setText("0");
    	out26.setText("0");
    	out27.setText("0");
    	out28.setText("0");
    	out29.setText("0");
    	out30.setText("0");
    	out31.setText("0");
    	salaryText.setText("0");
    	updateInfo();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
    @FXML
    void openReport(ActionEvent event) {
    	openReport();
    }
    
    @FXML
    void saveReport(ActionEvent event) {
    	saveReport();
    }
    
	public void openReport() {
		File workingDirectory = new File(System.getProperty("user.dir"));
		final JFileChooser fc = new JFileChooser(workingDirectory);
		fc.setDialogType(1);
		fc.showOpenDialog(new JFrame());
		File file = fc.getSelectedFile();
		if(file == null || !file.exists())
			return;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			nameText.setText(br.readLine());
			salaryInt = Double.parseDouble(br.readLine());
			
	    	in1.setText(br.readLine());
	    	in2.setText(br.readLine());
	    	in3.setText(br.readLine());
	    	in4.setText(br.readLine());
	    	in5.setText(br.readLine());
	    	in6.setText(br.readLine());
	    	in7.setText(br.readLine());
	    	in8.setText(br.readLine());
	    	in9.setText(br.readLine());
	    	in10.setText(br.readLine());
	    	in11.setText(br.readLine());
	    	in12.setText(br.readLine());
	    	in13.setText(br.readLine());
	    	in14.setText(br.readLine());
	    	in15.setText(br.readLine());
	    	in16.setText(br.readLine());
	    	in17.setText(br.readLine());
	    	in18.setText(br.readLine());
	    	in19.setText(br.readLine());
	    	in20.setText(br.readLine());
	    	in21.setText(br.readLine());
	    	in22.setText(br.readLine());
	    	in23.setText(br.readLine());
	    	in24.setText(br.readLine());
	    	in25.setText(br.readLine());
	    	in26.setText(br.readLine());
	    	in27.setText(br.readLine());
	    	in28.setText(br.readLine());
	    	in29.setText(br.readLine());
	    	in30.setText(br.readLine());
	    	in31.setText(br.readLine());
	    	out1.setText(br.readLine());
	    	out2.setText(br.readLine());
	    	out3.setText(br.readLine());
	    	out4.setText(br.readLine());
	    	out5.setText(br.readLine());
	    	out6.setText(br.readLine());
	    	out7.setText(br.readLine());
	    	out8.setText(br.readLine());
	    	out9.setText(br.readLine());
	    	out10.setText(br.readLine());
	    	out11.setText(br.readLine());
	    	out12.setText(br.readLine());
	    	out13.setText(br.readLine());
	    	out14.setText(br.readLine());
	    	out15.setText(br.readLine());
	    	out16.setText(br.readLine());
	    	out17.setText(br.readLine());
	    	out18.setText(br.readLine());
	    	out19.setText(br.readLine());
	    	out20.setText(br.readLine());
	    	out21.setText(br.readLine());
	    	out22.setText(br.readLine());
	    	out23.setText(br.readLine());
	    	out24.setText(br.readLine());
	    	out25.setText(br.readLine());
	    	out26.setText(br.readLine());
	    	out27.setText(br.readLine());
	    	out28.setText(br.readLine());
	    	out29.setText(br.readLine());
	    	out30.setText(br.readLine());
	    	out31.setText(br.readLine());
	    	
	    	salaryText.setText(br.readLine());
	    	
	    	updateInfo();
	    	
			br.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(file);
	}
	
	public void saveReport() {
		File workingDirectory = new File(System.getProperty("user.dir"));
		final JFileChooser fc = new JFileChooser(workingDirectory);
		fc.setDialogType(1);
		fc.showSaveDialog(new JFrame());
		File file = fc.getSelectedFile();
		if(file == null)
			return;
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String spc = System.lineSeparator();
			
			bw.write(nameText.getText() + spc + salaryInt + spc + in1.getText() + spc + in2.getText() + spc + in3.getText() + spc + in4.getText() + spc + in5.getText() + spc + in6.getText() + spc + in7.getText() + spc + in8.getText() + spc + in9.getText() + spc + in10.getText() + spc + in11.getText() + spc + in12.getText() + spc + in13.getText() + spc + in14.getText() + spc + in15.getText() + spc + in16.getText() + spc + in17.getText() + spc + in18.getText() + spc + in19.getText() + spc + in20.getText() + spc + in21.getText() + spc + in22.getText() + spc + in23.getText() + spc + in24.getText() + spc + in25.getText() + spc + in26.getText() + spc + in27.getText() + spc + in28.getText() + spc + in29.getText() + spc + in30.getText() + spc + in31.getText() + spc + out1.getText() + spc + out2.getText() + spc + out3.getText() + spc + out4.getText() + spc + out5.getText() + spc + out6.getText() + spc + out7.getText() + spc + out8.getText() + spc + out9.getText() + spc + out10.getText() + spc + out11.getText() + spc + out12.getText() + spc + out13.getText() + spc + out14.getText() + spc + out15.getText() + spc + out16.getText() + spc + out17.getText() + spc + out18.getText() + spc + out19.getText() + spc + out20.getText() + spc + out21.getText() + spc + out22.getText() + spc + out23.getText() + spc + out24.getText() + spc + out25.getText() + spc + out26.getText() + spc + out27.getText() + spc + out28.getText() + spc + out29.getText() + spc + out30.getText() + spc + out31.getText() + spc + salaryText.getText());
	    	
			bw.close();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(file);
	}
	
    @FXML
    private Text salaryWOE;

    @FXML
    private Text totalHours;

    @FXML
    private Text totalEH;

    @FXML
    private Text sickDays;

    @FXML
    private Text vacDays;
    
    @FXML
    private Text totalDays;
    
    public void updateInfo() {
    	try {
    		
	    	double in1Int = Integer.parseInt(in1.getText());
		    double in2Int = Integer.parseInt(in2.getText());
		    double in3Int = Integer.parseInt(in3.getText());
		    double in4Int = Integer.parseInt(in4.getText());
		    double in5Int = Integer.parseInt(in5.getText());
		    double in6Int = Integer.parseInt(in6.getText());
		    double in7Int = Integer.parseInt(in7.getText());
		    double in8Int = Integer.parseInt(in8.getText());
		    double out1Int = Integer.parseInt(out1.getText());
		    double out2Int = Integer.parseInt(out2.getText());
		    double out3Int = Integer.parseInt(out3.getText());
		    double out4Int = Integer.parseInt(out4.getText());
		    double out5Int = Integer.parseInt(out5.getText());
		    double out6Int = Integer.parseInt(out6.getText());
		    double out7Int = Integer.parseInt(out7.getText());
		    double out8Int = Integer.parseInt(out8.getText());
		    double in9Int = Integer.parseInt(in9.getText());
		    double in10Int = Integer.parseInt(in10.getText());
		    double in11Int = Integer.parseInt(in11.getText());
		    double in12Int = Integer.parseInt(in12.getText());
		    double in13Int = Integer.parseInt(in13.getText());
		    double in14Int = Integer.parseInt(in14.getText());
		    double in15Int = Integer.parseInt(in15.getText());
		    double in16Int = Integer.parseInt(in16.getText());
		    double out9Int = Integer.parseInt(out9.getText());
		    double out10Int = Integer.parseInt(out10.getText());
		    double out11Int = Integer.parseInt(out11.getText());
		    double out12Int = Integer.parseInt(out12.getText());
		    double out13Int = Integer.parseInt(out13.getText());
		    double out14Int = Integer.parseInt(out14.getText());
		    double out15Int = Integer.parseInt(out15.getText());
		    double out16Int = Integer.parseInt(out16.getText());
		    double in17Int = Integer.parseInt(in17.getText());
		    double in18Int = Integer.parseInt(in18.getText());
		    double in19Int = Integer.parseInt(in19.getText());
		    double in20Int = Integer.parseInt(in20.getText());
		    double in21Int = Integer.parseInt(in21.getText());
		    double in22Int = Integer.parseInt(in22.getText());
		    double in23Int = Integer.parseInt(in23.getText());
		    double in24Int = Integer.parseInt(in24.getText());
		    double out17Int = Integer.parseInt(out17.getText());
		    double out18Int = Integer.parseInt(out18.getText());
		    double out19Int = Integer.parseInt(out19.getText());
		    double out20Int = Integer.parseInt(out20.getText());
		    double out21Int = Integer.parseInt(out21.getText());
		    double out22Int = Integer.parseInt(out22.getText());
		    double out23Int = Integer.parseInt(out23.getText());
		    double out24Int = Integer.parseInt(out24.getText());
		    double in25Int = Integer.parseInt(in25.getText());
		    double in26Int = Integer.parseInt(in26.getText());
		    double in27Int = Integer.parseInt(in27.getText());
		    double in28Int = Integer.parseInt(in28.getText());
		    double in29Int = Integer.parseInt(in29.getText());
		    double in30Int = Integer.parseInt(in30.getText());
		    double in31Int = Integer.parseInt(in31.getText());
		    double out25Int = Integer.parseInt(out25.getText());
		    double out26Int = Integer.parseInt(out26.getText());
		    double out27Int = Integer.parseInt(out27.getText());
		    double out28Int = Integer.parseInt(out28.getText());
		    double out29Int = Integer.parseInt(out29.getText());
		    double out30Int = Integer.parseInt(out30.getText());
		    double out31Int = Integer.parseInt(out31.getText());
	    
	    
		    
		    
		    
	    	salaryText.setText(String.format("$%,.2f", calculateOverHours(in1Int, out1Int) + calculateOverHours(in2Int, out2Int) + calculateOverHours(in3Int, out3Int) + 
	    			calculateOverHours(in4Int, out4Int) + calculateOverHours(in5Int, out5Int) + calculateOverHours(in6Int, out6Int) + 
	    			calculateOverHours(in7Int, out7Int) + calculateOverHours(in8Int, out8Int) + calculateOverHours(in9Int, out9Int) + 
	    			calculateOverHours(in10Int, out10Int) + calculateOverHours(in11Int, out11Int) + calculateOverHours(in12Int, out12Int) + 
	    			calculateOverHours(in13Int, out13Int) + calculateOverHours(in14Int, out14Int) + calculateOverHours(in15Int, out15Int) + 
	    			calculateOverHours(in16Int, out16Int) + calculateOverHours(in17Int, out17Int) + calculateOverHours(in18Int, out18Int) + 
	    			calculateOverHours(in19Int, out19Int) + calculateOverHours(in20Int, out20Int) + calculateOverHours(in21Int, out21Int) + 
	    			calculateOverHours(in22Int, out22Int) + calculateOverHours(in23Int, out23Int) + calculateOverHours(in24Int, out24Int) + 
	    			calculateOverHours(in25Int, out25Int) + calculateOverHours(in26Int, out26Int) + calculateOverHours(in27Int, out27Int) + 
	    			calculateOverHours(in28Int, out28Int) + calculateOverHours(in29Int, out29Int) + calculateOverHours(in30Int, out30Int) + 
	    			calculateOverHours(in31Int, out31Int)));
		    
		    double minCal = (out1Int + out2Int + out3Int + out4Int + out5Int + out6Int + out7Int + out8Int + out9Int + out10Int + out11Int + out12Int + out13Int + out14Int + out15Int + out16Int + out17Int + out18Int + out19Int + out20Int + out21Int + out22Int + out23Int + out24Int + out25Int + out26Int + out27Int + out28Int + out29Int + out30Int + out31Int)/60;
	    	
	    	double totalHoursDouble = in1Int + in2Int + in3Int + in4Int + in5Int + in6Int + in7Int + in8Int + in9Int + in10Int + in11Int + in12Int + in13Int + in14Int + in15Int + in16Int + in17Int + in18Int + in19Int + in20Int + in21Int + in22Int + in23Int + in24Int + in25Int + in26Int + in27Int + in28Int + in29Int + in30Int + in31Int + minCal;
	    	
	    	totalHours.setText(String.format("%,.2f", totalHoursDouble));
	    	
	    	double extraHoursDouble = 0;
	    	double extraHoursDouble150 = 0;
	    	
	    	if(in1Int + (out1Int / 60) >= 8) {
	    		extraHoursDouble += (in1Int + (out1Int / 60) - 8);
	    		if((in1Int + (out1Int / 60) >= 10))
	    			extraHoursDouble150 += (in1Int + (out1Int / 60) - 10);
	    	}
	    	System.out.println(in2Int);
	    	if(in2Int + (out2Int / 60) >= 8) {
	    		extraHoursDouble += (in2Int + (out2Int / 60) - 8);
	    		if((in2Int + (out2Int / 60) >= 10))
	    			extraHoursDouble150 += (in2Int + (out2Int / 60) - 10);
	    	}
	    	System.out.println(in2Int);
	    	if(in3Int + (out3Int / 60) >= 8) {
	    		extraHoursDouble += (in3Int + (out3Int / 60) - 8);
	    		if((in3Int + (out3Int / 60) >= 10))
	    			extraHoursDouble150 += (in3Int + (out3Int / 60) - 10);
	    	}
	    	if(in4Int + (out4Int / 60) >= 8) {
	    		extraHoursDouble += (in4Int + (out4Int / 60) - 8);
	    		if((in4Int + (out4Int / 60) >= 10))
	    			extraHoursDouble150 += (in4Int + (out4Int / 60) - 10);
	    	}
	    	if(in5Int + (out5Int / 60) >= 8) {
	    		extraHoursDouble += (in5Int + (out5Int / 60) - 8);
	    		if((in5Int + (out5Int / 60) >= 10))
	    			extraHoursDouble150 += (in5Int + (out5Int / 60) - 10);
	    	}
	    	if(in6Int + (out6Int / 60) >= 8) {
	    		extraHoursDouble += (in6Int + (out6Int / 60) - 8);
	    		if((in6Int + (out6Int / 60) >= 10))
	    			extraHoursDouble150 += (in6Int + (out6Int / 60) - 10);
	    	}
	    	if(in7Int + (out7Int / 60) >= 8) {
	    		extraHoursDouble += (in7Int + (out7Int / 60) - 8);
	    		if((in7Int + (out7Int / 60) >= 10))
	    			extraHoursDouble150 += (in7Int + (out7Int / 60) - 10);
	    	}
	    	if(in8Int + (out8Int / 60) >= 8) {
	    		extraHoursDouble += (in8Int + (out8Int / 60) - 8);
	    		if((in8Int + (out8Int / 60) >= 10))
	    			extraHoursDouble150 += (in8Int + (out8Int / 60) - 10);
	    	}
	    	if(in9Int + (out9Int / 60) >= 8) {
	    		extraHoursDouble += (in9Int + (out9Int / 60) - 8);
	    		if((in9Int + (out9Int / 60) >= 10))
	    			extraHoursDouble150 += (in9Int + (out9Int / 60) - 10);
	    	}
	    	if(in10Int + (out10Int / 60) >= 8) {
	    		extraHoursDouble += (in10Int + (out10Int / 60) - 8);
	    		if((in10Int + (out10Int / 60) >= 10))
	    			extraHoursDouble150 += (in10Int + (out10Int / 60) - 10);
	    	}
	    	if(in11Int + (out11Int / 60) >= 8) {
	    		extraHoursDouble += (in11Int + (out11Int / 60) - 8);
	    		if((in11Int + (out11Int / 60) >= 10))
	    			extraHoursDouble150 += (in11Int + (out11Int / 60) - 10);
	    	}
	    	if(in12Int + (out12Int / 60) >= 8) {
	    		extraHoursDouble += (in12Int + (out12Int / 60) - 8);
	    		if((in12Int + (out12Int / 60) >= 10))
	    			extraHoursDouble150 += (in12Int + (out12Int / 60) - 10);
	    	}
	    	if(in13Int + (out13Int / 60) >= 8) {
	    		extraHoursDouble += (in13Int + (out13Int / 60) - 8);
	    		if((in13Int + (out13Int / 60) >= 10))
	    			extraHoursDouble150 += (in13Int + (out13Int / 60) - 10);
	    	}
	    	if(in14Int + (out14Int / 60) >= 8) {
	    		extraHoursDouble += (in14Int + (out14Int / 60) - 8);
	    		if((in14Int + (out14Int / 60) >= 10))
	    			extraHoursDouble150 += (in14Int + (out14Int / 60) - 10);
	    	}
	    	if(in15Int + (out15Int / 60) >= 8) {
	    		extraHoursDouble += (in15Int + (out15Int / 60) - 8);
	    		if((in15Int + (out15Int / 60) >= 10))
	    			extraHoursDouble150 += (in15Int + (out15Int / 60) - 10);
	    	}
	    	if(in16Int + (out16Int / 60) >= 8) {
	    		extraHoursDouble += (in16Int + (out16Int / 60) - 8);
	    		if((in16Int + (out16Int / 60) >= 10))
	    			extraHoursDouble150 += (in16Int + (out16Int / 60) - 10);
	    	}
	    	if(in17Int + (out17Int / 60) >= 8) {
	    		extraHoursDouble += (in17Int + (out17Int / 60) - 8);
	    		if((in17Int + (out17Int / 60) >= 10))
	    			extraHoursDouble150 += (in17Int + (out17Int / 60) - 10);
	    	}
	    	if(in18Int + (out18Int / 60) >= 8) {
	    		extraHoursDouble += (in18Int + (out18Int / 60) - 8);
	    		if((in18Int + (out18Int / 60) >= 10))
	    			extraHoursDouble150 += (in18Int + (out18Int / 60) - 10);
	    	}
	    	if(in19Int + (out19Int / 60) >= 8) {
	    		extraHoursDouble += (in19Int + (out19Int / 60) - 8);
	    		if((in19Int + (out19Int / 60) >= 10))
	    			extraHoursDouble150 += (in19Int + (out19Int / 60) - 10);
	    	}
	    	if(in20Int + (out20Int / 60) >= 8) {
	    		extraHoursDouble += (in20Int + (out20Int / 60) - 8);
	    		if((in20Int + (out20Int / 60) >= 10))
	    			extraHoursDouble150 += (in20Int + (out20Int / 60) - 10);
	    	}
	    	if(in21Int + (out21Int / 60) >= 8) {
	    		extraHoursDouble += (in21Int + (out21Int / 60) - 8);
	    		if((in21Int + (out21Int / 60) >= 10))
	    			extraHoursDouble150 += (in21Int + (out21Int / 60) - 10);
	    	}
	    	if(in22Int + (out22Int / 60) >= 8) {
	    		extraHoursDouble += (in22Int + (out22Int / 60) - 8);
	    		if((in22Int + (out22Int / 60) >= 10))
	    			extraHoursDouble150 += (in22Int + (out22Int / 60) - 10);
	    	}
	    	if(in23Int + (out23Int / 60) >= 8) {
	    		extraHoursDouble += (in23Int + (out23Int / 60) - 8);
	    		if((in23Int + (out23Int / 60) >= 10))
	    			extraHoursDouble150 += (in23Int + (out23Int / 60) - 10);
	    	}
	    	if(in24Int + (out24Int / 60) >= 8) {
	    		extraHoursDouble += (in24Int + (out24Int / 60) - 8);
	    		if((in24Int + (out24Int / 60) >= 10))
	    			extraHoursDouble150 += (in24Int + (out24Int / 60) - 10);
	    	}
	    	if(in25Int + (out25Int / 60) >= 8) {
	    		extraHoursDouble += (in25Int + (out25Int / 60) - 8);
	    		if((in25Int + (out25Int / 60) >= 10))
	    			extraHoursDouble150 += (in25Int + (out25Int / 60) - 10);
	    	}
	    	if(in26Int + (out26Int / 60) >= 8) {
	    		extraHoursDouble += (in26Int + (out26Int / 60) - 8);
	    		if((in26Int + (out26Int / 60) >= 10))
	    			extraHoursDouble150 += (in26Int + (out26Int / 60) - 10);
	    	}
	    	if(in27Int + (out27Int / 60) >= 8) {
	    		extraHoursDouble += (in27Int + (out27Int / 60) - 8);
	    		if((in27Int + (out27Int / 60) >= 10))
	    			extraHoursDouble150 += (in27Int + (out27Int / 60) - 10);
	    	}
	    	if(in28Int + (out28Int / 60) >= 8) {
	    		extraHoursDouble += (in28Int + (out28Int / 60) - 8);
	    		if((in28Int + (out28Int / 60) >= 10))
	    			extraHoursDouble150 += (in28Int + (out28Int / 60) - 10);
	    	}
	    	if(in29Int + (out29Int / 60) >= 8) {
	    		extraHoursDouble += (in29Int + (out29Int / 60) - 8);
	    		if((in29Int + (out29Int / 60) >= 10))
	    			extraHoursDouble150 += (in29Int + (out29Int / 60) - 10);
	    	}
	    	if(in30Int + (out30Int / 60) >= 8) {
	    		extraHoursDouble += (in30Int + (out30Int / 60) - 8);
	    		if((in30Int + (out30Int / 60) >= 10))
	    			extraHoursDouble150 += (in30Int + (out30Int / 60) - 10);
	    	}
	    	if(in31Int + (out31Int / 60) >= 8) {
	    		extraHoursDouble += (in31Int + (out31Int / 60) - 8);
	    		if((in31Int + (out31Int / 60) >= 10))
	    			extraHoursDouble150 += (in31Int + (out31Int / 60) - 10);
	    	}
	    	
	    	salaryInfo.setText(String.format("$%,.2f", salaryInt));
	    	
	    	salaryInfo125.setText(String.format("$%,.2f", salaryInt*1.25));
	    	
	    	salaryInfo150.setText(String.format("$%,.2f", salaryInt*1.5));
	    	
	    	totalEH.setText(String.format("%,.2f", extraHoursDouble));
	    	
	    	
		    salaryWOE.setText(String.format("$%,.2f", totalHoursDouble * salaryInt));
		    
		    int daysCount = 0;
		    
		    if(in1Int != 0)
		    	daysCount++;
		    if(in2Int != 0)
		    	daysCount++;
		    if(in3Int != 0)
		    	daysCount++;
		    if(in4Int != 0)
		    	daysCount++;
		    if(in5Int != 0)
		    	daysCount++;
		    if(in6Int != 0)
		    	daysCount++;
		    if(in7Int != 0)
		    	daysCount++;
		    if(in8Int != 0)
		    	daysCount++;
		    if(in9Int != 0)
		    	daysCount++;
		    if(in10Int != 0)
		    	daysCount++;
		    if(in11Int != 0)
		    	daysCount++;
		    if(in12Int != 0)
		    	daysCount++;
		    if(in13Int != 0)
		    	daysCount++;
		    if(in14Int != 0)
		    	daysCount++;
		    if(in15Int != 0)
		    	daysCount++;
		    if(in16Int != 0)
		    	daysCount++;
		    if(in17Int != 0)
		    	daysCount++;
		    if(in18Int != 0)
		    	daysCount++;
		    if(in19Int != 0)
		    	daysCount++;
		    if(in20Int != 0)
		    	daysCount++;
		    if(in21Int != 0)
		    	daysCount++;
		    if(in22Int != 0)
		    	daysCount++;
		    if(in23Int != 0)
		    	daysCount++;
		    if(in24Int != 0)
		    	daysCount++;
		    if(in25Int != 0)
		    	daysCount++;
		    if(in26Int != 0)
		    	daysCount++;
		    if(in27Int != 0)
		    	daysCount++;
		    if(in28Int != 0)
		    	daysCount++;
		    if(in29Int != 0)
		    	daysCount++;
		    if(in30Int != 0)
		    	daysCount++;
		    if(in31Int != 0)
		    	daysCount++;
		    
		    totalDays.setText(Integer.toString(daysCount));
		    
		    sickDays.setText(String.format("%,.2f", (daysCount/21.66) * 1.5));
		    
		    avgDaysText.setText(String.format("%,.2f", totalHoursDouble/daysCount));
		    
		    totalEH100.setText(String.format("%,.2f", totalHoursDouble-extraHoursDouble));
		    
		    totalEH125.setText(String.format("%,.2f", extraHoursDouble - extraHoursDouble150));
		    
		    totalEH150.setText(String.format("%,.2f", extraHoursDouble150));
		    
    	}catch(NumberFormatException e) {
    		Main.openError();
    	}
    }
}