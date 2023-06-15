
package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class generalqueries {


			
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		int index[]=new int[3];
		String []name= {"ram","raj","urs"};
		int stud,sem,sub,sco,avg=0,total=0;
		int sci_avg,math_avg,Eng_avg;
		double perc=0;
		double class_percent=0;
		double perc1=0;
		
		
		double cla_per=0;
		int[][][]scores= {
				          {{69,76,98},{25,35,46}},
				          {{62,56,98},{35,65,95}},
				          {{57,26,98},{85,27,56}},	
				         };
		
		for(stud=0;stud<3;stud++) {
			//for(int i=0;i<3;i++) {
				System.out.println("student name :  "+name[stud]+" ");
			//}
			for( sem=0;sem<2;sem++) {
				System.out.println("Semister:"+(sem+1)+"    scores"+" \n with respect to Science ,Maths and English are:");
				
				for( sco=0;sco<3;sco++) {
					
					System.out.println(scores[stud][sem][sco]);
					total+=scores[stud][sem][sco];
					avg=total/3;
					perc=(double)total/3;
					
				}
				perc1+=perc;
				class_percent=perc1/2;
				System.out.println("average  "+avg);
				System.out.println(" Percentage   "+ perc+"\n");
				l.add(perc);
				total=0;
				
			}
			
				System.out.println("\n average percentage of "+name[stud]+" from both semister is:    "+class_percent+"\n"+"\n");
				System.out.println("\n average percentage of whole class is:    "+class_percent+"\n"+"\n");
			
			
		}
	
System.out.println(l);
int percent=0;
			for(int i=1;i<l.size();i=i+1)
			{
				index=(int[]) l.get(i);
			System.out.println(l.get(i));
		
			}
			double per=0;
			for(double d:index) {
				per+=d;
			}
			System.out.println(per);
			
//		for(int i=0;i<6;i++) {
//			if(i%2==0) {
//				System.out.println(l.get(i));
//			}
//			else {
//				l.remove(i);
//			}
//		}
//	Iterator itr=l.iterator();
//	while(itr.hasNext())
//	{
//		Double n=(Double)itr.next();
//		if(n+2==0) {
//			System.out.println(n);
//		}
//		else {
//			System.out.println(n);
//		}
//	}
		
		
	}}		





	

	
