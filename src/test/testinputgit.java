package test;

import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.Arrays;  

public class testinputgit {
	 static String[] item ={};   
	 @SuppressWarnings("resource")  
	 public static String[] Handle(){    
	          
	 try{  
	 BufferedReader reader = new BufferedReader(new FileReader("E:\\sights.csv"));  
	  
	 String line;      
	 while((line=reader.readLine())!=null){    
		 String info[] = line.split(",");  
		 int iteml=item.length;  
		 int infol=info.length;  
		 item=Arrays.copyOf(item,iteml+infol);//���  
		 System.arraycopy(info,0,item,iteml,infol);//�������    
	 	}  
	    }catch (FileNotFoundException ex) {  
	        System.out.println("û�ҵ��ļ���");  
	    }catch (IOException ex) {  
	        System.out.println("��д�ļ�����");  
	    }  
	    System.out.println(Arrays.toString(item));   
	    return item;  
	    }  
}
