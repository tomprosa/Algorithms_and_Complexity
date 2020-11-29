package Algorithms_and_Complexity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

public class ReadFile {
	private ArrayList<ArrayList> car_f_92=new ArrayList<>();
	private HashSet<String> fileHash=new HashSet<>();
	private int recordCounter=0;
	private int studentsCounter=0;
	public ReadFile(){
		
	}
	
	public void readFile(String fileName){
		try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
			String line="";
			String csvSplitBy=" ";
			fileHash.clear();
			studentsCounter=0;
			recordCounter=0;
			while ((line=br.readLine())!=null) {
				String[] data = line.split(csvSplitBy);
				ArrayList<String> file_integers=new ArrayList<>();
				for(int i=0;i<data.length;i++){
					file_integers.add(data[i]);
					fileHash.add(data[i]);
					recordCounter++;
				}
				studentsCounter++;
				car_f_92.add(file_integers);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void readFiles(){
		this.readFile("datasets/car-f-92.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/car-s-91.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/ear-f-83.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/hec-s-92.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/kfu-s-93.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/lse-f-91.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/pur-s-93.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/rye-s-93.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/sta-f-83.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/toy_e5_s6.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/tre-s-92.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/uta-s-92.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/ute-s-92.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		this.readFile("datasets/yor-f-83.stu");
		System.out.println("Ta synolika exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
	}

	public ArrayList<ArrayList> getCar_f_92() {
		return car_f_92;
	}

	public void setCar_f_92(ArrayList<ArrayList> car_f_92) {
		this.car_f_92 = car_f_92;
	}

	public int getRecordCounter() {
		return recordCounter;
	}

	public void setRecordCounter(int recordCounter) {
		this.recordCounter = recordCounter;
	}

	public HashSet<String> getFileHash() {
		return fileHash;
	}

	public void setFileHash(HashSet<String> fileHash) {
		this.fileHash = fileHash;
	}

	public int getStudentsCounter() {
		return studentsCounter;
	}

	public void setStudentsCounter(int studentsCounter) {
		this.studentsCounter = studentsCounter;
	}
}
