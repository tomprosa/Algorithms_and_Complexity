package Algorithms_and_Complexity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ReadFile {
	private ArrayList<ArrayList<String>> car_f_92=new ArrayList<>();
	private ArrayList<String> allFileIntegers=new ArrayList<>();
	private HashSet<String> fileHash=new HashSet<>();
	private int recordCounter=0;
	private int studentsCounter=0;
	private int min;
	private int max;
	private ArrayList<ArrayList<String>> minHash= new ArrayList<>();
	private ArrayList<Graph> adjList= new ArrayList<>();
	
	public ReadFile(){

	}
	
	public void readFile(String fileName){
		min=10000;
		max=-5;
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
					allFileIntegers.add(data[i]);
					recordCounter++;
				}
				
				studentsCounter++;
				car_f_92.add(file_integers);
			}
//			for(String f: fileHash) {
//				int currMin=0;
//				for (int j=0;j<car_f_92.size();j++) {
//					if(car_f_92.get(j).equals(f)) {
//						currMin++;
//					}
//				}
//				if(currMin<min) {
//					min=currMin;
//				}
//			}
			
//			init();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
//	public void init () {
//		int AdjMatrix[][] =new int[fileHash.size()][fileHash.size()];
//		
//	    for (int i =1; i<fileHash.size(); i++){
//	       int count = 0; 
//	        for (int j=1; j<fileHash.size(); j++){
//	            if ( allFileIntegers.get(i).equals(allFileIntegers.get(j))) {count++;}
//	            AdjMatrix[i][j] = count;
//	        }
//	    }
//	    initMatrix(AdjMatrix);
//	}
//
//	public void initMatrix(int[][] adjMatrix) {
//	for (int i=0; i<fileHash.size();i++) {
//		for (int j = 0; j < fileHash.size(); j++) {
//            if (i == j) 
//                continue;
//            int c = commonElements(adjMatrix[i+1], adjMatrix[j + 1]);
//            if (c > 0) {
//                if (j > i) {
//                    addEdge(i, j);
//                }
//            }
//		}
//		
//	}
//}
	
//	public void initMatrix(ArrayList<ArrayList<String>> adjMatrix) {
//		for (int i=0; i<fileHash.size();i++) {
//			for (int j = 0; j < fileHash.size(); j++) {
//	            if (i == j) 
//	                continue;
//	            int c = commonElements(adjMatrix.get(i+1), adjMatrix.get(j + 1));
//	            if (c > 0) {
//	                if (j > i) {
//	                    addEdge(i, j);
//	                }
//	            }
//			}
//			
//		}
//	}
//	
//	public int commonElements(int[] s1, int[] s2) {
//	    int c = 0;
//	    for (int x : s1) {
//	        for (int y : s2) {
//	            if (x==y) {
//	                c++;
//	                break;
//	            }
//	        }
//	    }
//	    return c;
//	}

	public void addEdge(int i, int j) {
		Graph g1= new Graph(i);
	    adjList.set(i, g1);
	    Graph g2= new Graph(j);
	    adjList.set(j, g2);
	}
	
	public int calculateMax() {
		for(String f: fileHash) {
			int currMin=0;
			for (int j=0;j<car_f_92.size();j++) {
				ArrayList<String> s=car_f_92.get(j);
				if(s.contains(f)) {
					currMin++;
				}
			}
			if(currMin>max) {
				max=currMin;
			}
		}
		return max;
	}
	
	public int calculateMin() {
		for(String f: fileHash) {
			int currMin=0;
			for (int j=0;j<car_f_92.size();j++) {
				ArrayList<String> s=car_f_92.get(j);
				if(s.contains(f)) {
					currMin++;
				}
			}
			if(currMin<min) {
				min=currMin;
			}
		}
		return min;
	}
	
	public int calculateMed() {
		int currMed=0;
		if (fileHash.size() % 2 == 0) {
			currMed = fileHash.size() / 2;
		} else {
			currMed = (fileHash.size() + 1) / 2;
		}
		return currMed;
	}
	
	public void readFiles(){
		this.readFile("datasets/car-f-92.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());

		this.readFile("datasets/car-s-91.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());

		this.readFile("datasets/ear-f-83.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());

		this.readFile("datasets/hec-s-92.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());

		this.readFile("datasets/kfu-s-93.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());

		this.readFile("datasets/lse-f-91.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/pur-s-93.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/rye-s-93.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/sta-f-83.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/toy_e5_s6.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/tre-s-92.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/uta-s-92.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/ute-s-92.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());
		
		this.readFile("datasets/yor-f-83.stu");
		System.out.println("Oi synolikes exetaseis htan: "+this.fileHash.size());
		System.out.println("Oi synolikoi foithtes einai: "+this.getStudentsCounter());
		System.out.println("Oi synolikes eggrafes einai: "+this.getRecordCounter());
		System.out.println("Min: "+calculateMin());
		System.out.println("Max: "+calculateMax());
		System.out.println("Med: "+calculateMed());

	}

	public ArrayList<ArrayList<String>> getCar_f_92() {
		return car_f_92;
	}

	public void setCar_f_92(ArrayList<ArrayList<String>> car_f_92) {
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

	public ArrayList<String> getAllFileIntegers() {
		return allFileIntegers;
	}

	public void setAllFileIntegers(ArrayList<String> allFileIntegers) {
		this.allFileIntegers = allFileIntegers;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public ArrayList<ArrayList<String>> getMinHash() {
		return minHash;
	}

	public void setMinHash(ArrayList<ArrayList<String>> minHash) {
		this.minHash = minHash;
	}

}
