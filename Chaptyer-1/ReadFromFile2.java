import java.io.*; 

public class ReadFromFile2 { 
  public static void main(String[] args)throws Exception { 

  String cmd; 
  File file = new File("/Users/alexis.garza/Documents/repository/HF-Java/Head-First-Java/Chaptyer-1/dm-offers-business-segment.txt"); 
  BufferedReader br = new BufferedReader(new FileReader(file)); 


  while ((cmd = br.readLine()) != null) {
	ReadFromFile2.ExecCMD(cmd);
	} 
  }

    public static void ExecCMD(String cmd){
		try{
			Process process = Runtime.getRuntime().exec(cmd);
		}catch(Exception ex) {
	         ex.printStackTrace();
		}
	}
} 
