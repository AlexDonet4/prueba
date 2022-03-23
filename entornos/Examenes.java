package entornos;

public class Examenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name = "Alex";
		float nota1=6,nota2=7,nota3=8,aciertos1=22,fallos1=8,notafinal=0,totaltest1=0,aciertos2=19,fallos2=11,totaltest2=0;
	
		for  (int i=0;i<fallos1;i=i+3) {
			totaltest1=aciertos1--;
	
		}
		
		for  (int i=0;i<fallos2;i=i+3) {
			totaltest2=aciertos2--;
	
		}
		totaltest1=totaltest1*10/30;
		totaltest2=totaltest2*10/30;
		notafinal=(nota1*10/100)+(nota2*20/100)+(nota3*20/100)+(totaltest1*25/100)+(totaltest2*25/100);*/
		
		String [] nombres= {"Alex","Marta","Inia","Ana","Mario","Jesus","Bella","Messi","CR7","Galileo Galilei"};
		
		float notafinalclasico=0;
		float notafinaltest1=0;
		float finaltestacertadas=0;
		float []notasfinaltest1= new float [10];
		float [][]tipotest1= new float [10][2];
		tipotest1[0][0]=20;
		tipotest1[0][1]=10;
		tipotest1[1][0]=15;
		tipotest1[1][1]=15;
		tipotest1[2][0]=26;
		tipotest1[2][1]=4;
		tipotest1[3][0]=10;
		tipotest1[3][1]=20;
		tipotest1[4][0]=12;
		tipotest1[4][1]=18;
		tipotest1[5][0]=30;
		tipotest1[5][1]=0;
		tipotest1[6][0]=25;
		tipotest1[6][1]=5;
		tipotest1[7][0]=17;
		tipotest1[7][1]=13;
		tipotest1[8][0]=9;
		tipotest1[8][1]=21;
		tipotest1[9][0]=20;
		tipotest1[9][1]=10;
		
		for (int i = 0; i < tipotest1.length; i++) {
		      for (int j = 0; j <=2; j++) {
		    	  if(j==1) {
		    		  for (int x=0;x<tipotest1[i][j];x=x+3) {
		    			  finaltestacertadas=tipotest1[i][j-1]--;
		    			  
		    		  }}
		    		  else if(j==2) {
		    			  notafinaltest1=(finaltestacertadas*10/30)*25/100;
		    			 
		    			  notasfinaltest1[i]=notafinaltest1;
		    			  notafinaltest1=0;
		    		  }
		    	  }
		      }
		
		float notafinaltest2=0;   
		float []notasfinaltest2= new float [10];
		float [][]tipotest2= new float [10][2];
		tipotest2[0][0]=20;
		tipotest2[0][1]=10;
		tipotest2[1][0]=15;
		tipotest2[1][1]=15;
		tipotest2[2][0]=26;
		tipotest2[2][1]=4;
		tipotest2[3][0]=10;
		tipotest2[3][1]=20;
		tipotest2[4][0]=12;
		tipotest2[4][1]=18;
		tipotest2[5][0]=30;
		tipotest2[5][1]=0;
		tipotest2[6][0]=25;
		tipotest2[6][1]=5;
		tipotest2[7][0]=17;
		tipotest2[7][1]=13;
		tipotest2[8][0]=9;
		tipotest2[8][1]=21;
		tipotest2[9][0]=20;
		tipotest2[9][1]=10;
		
		for (int i = 0; i < tipotest2.length; i++) {
		      for (int j = 0; j <=2; j++) {
		    	  if(j==1) {
		    		  for (int x=0;x<tipotest2[i][j];x=x+3) {
		    			  finaltestacertadas=tipotest2[i][j-1]--;
		    			  
		    		  }}
		    		  else if(j==2) {
		    			  notafinaltest2=(finaltestacertadas*10/30)*25/100;
		    		
		    			  notasfinaltest2[i]=notafinaltest2;
		    			  notafinaltest2=0;
		    		  }
		    	  }
		      }
		
		      
		
		
	
		float [][]notasclasico= new float [10][3];
		float []notasfinalclasico= new float [10];
		notasclasico[0][0]=8;
		notasclasico[0][1]=6;
		notasclasico[0][2]=5;
		notasclasico[1][0]=7;
		notasclasico[1][1]=6;
		notasclasico[1][2]=5;
		notasclasico[2][0]=4;
		notasclasico[2][1]=9;
		notasclasico[2][2]=5;
		notasclasico[3][0]=10;
		notasclasico[3][1]=9;
		notasclasico[3][2]=8;
		notasclasico[4][0]=7;
		notasclasico[4][1]=2;
		notasclasico[4][2]=5;
		notasclasico[5][0]=3;
		notasclasico[5][1]=9;
		notasclasico[5][2]=3;
		notasclasico[6][0]=4;
		notasclasico[6][1]=4;
		notasclasico[6][2]=4;
		notasclasico[7][0]=10;
		notasclasico[7][1]=9;
		notasclasico[7][2]=6;
		notasclasico[8][0]=10;
		notasclasico[8][1]=10;
		notasclasico[8][2]=10;
		notasclasico[9][0]=1;
		notasclasico[9][1]=2;
		notasclasico[9][2]=3;
	
		
		for (int i = 0; i < notasclasico.length; i++) {
		      for (int j = 0; j <=3; j++) {
		    	  if(j==0) 
		    		  notafinalclasico=notafinalclasico+(notasclasico[i][j]*10/100);
		    	  else if (j>0&&j<=2)
		    		  notafinalclasico=notafinalclasico+(notasclasico[i][j]*20/100);
		    	  else {
		    		
		    		  notasfinalclasico[i]=notafinalclasico;
		    		  notafinalclasico=0;
		    		 	}
		    	  }
		      }
		
		float []notasfinal= new float [10];
		for (int y=0;y<notasfinal.length;y++) {
			notasfinal[y]=notasfinalclasico[y]+notasfinaltest1[y]+notasfinaltest2[y];
			System.out.println("La nota final de la evaluación"
		    		  		+ " de"+" "+nombres[y]+" "+"es:" +" "+notasfinal[y]);
		}
		
		
	}
}
