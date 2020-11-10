package algorithms_and_complexity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class algorithms_and_complexity {

	public static void main(String[] args) {
		String line="";
		String csvSplitBy=" ";
		ArrayList<ArrayList> file_input=new ArrayList<>();
		
		int count=0;
		try(BufferedReader br=new BufferedReader(new FileReader("../datasets/car-f-92.stu"))){
			while ((line=br.readLine())!=null) {
				String[] data = line.split(csvSplitBy);
				ArrayList<String> file_integers=new ArrayList<>();
				for(int i=0;i<data.length;i++){
					file_integers.add(data[i]);
				}
				file_input.add(file_integers);
				count++;
				System.out.println(count+" Φοιτητής και είναι εγεγγραμένος σε αυτά τα μαθήματα: " +file_integers);
				if(count==18419)
				{
					if(file_integers.get(0).equals(file_integers.get(1))){
					System.out.println("Thee mou");
					System.out.println(file_integers.get(0));
					System.out.println(file_integers.get(1));
					}
				}
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
