package arrays;

public class two_dimensional_array {
	public static void main(String args[]){
		String a[][]=new String[2][3];
		//first set
		a[0][0]="hi";
		a[0][1]="bye";
		a[0][2]="nice";
		//second set
		a[1][0]="siva";
		a[1][1]="Hari";
		a[1][2]="jana";
		//get size of array
		System.out.println("array size: "+a.length);
		//print array
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(i+" "+j+" "+a[i][j]);
			}
		}
		
	}

}
