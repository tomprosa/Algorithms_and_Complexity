package Algorithms_and_Complexity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class algo {

	public static void main(String[] args) {
		String line="";
		String csvSplitBy=" ";
		ArrayList<ArrayList> car_f_92=new ArrayList<>();
		
		int count=0;
		try(BufferedReader br=new BufferedReader(new FileReader("datasets/car-f-92.stu"))){
			while ((line=br.readLine())!=null) {
				String[] data = line.split(csvSplitBy);
				ArrayList<String> file_integers=new ArrayList<>();
				for(int i=0;i<data.length;i++){
					file_integers.add(data[i]);
				}
				car_f_92.add(file_integers);
				count++;
				System.out.println(count+" Φοιτητής και είναι εγεγγραμένος σε αυτά τα μαθήματα: " +file_integers);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
