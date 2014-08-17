package arrays;

public class object_array {
	public static void main(String[] args){
		Object a1[]=new Object[4];
		a1[0]="Nidhi";
		a1[1]=789;
		a1[2]="bbdb89";
		a1[3]="*&*%";
		//print array length
		System.out.println("array length :"+a1.length);
		//print array value
		for(int i=0;i<a1.length;i++){
			System.out.println(i+" "+a1[i]);
		}   
		
		Object a2[][]=new Object[2][3];
		a2[0][0]="My";
		a2[0][1]=898;
		a2[0][2]="nknkc98";
		
		a2[1][0]="class";
		a2[1][1]="is 677";
		a2[1][2]=456;
		//print array length
		System.out.println("array length :"+a2.length);
		//print value
		for(int n=0;n<a2.length;n++){
			for(int m=0;m<a2[0].length;m++){
				System.out.println(n+" "+m+" "+a2[n][m]);
			}
		}
				
		
		
	}

}
