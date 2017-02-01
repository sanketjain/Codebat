public class TimesTable{
	public static void main(String[] args){
		System.out.print("   ");
		for (int i=0; i<10; i++){
			System.out.print(i + "  ");
		}
		System.out.println();
		for(int j=0; j<10; j++){
			System.out.print(j + "");
			for(int k=0; k<10; k++){
				if(k*j/10==0){
					System.out.print("  " + k*j);
				}else{
					System.out.print(" "+ k*j);
				}
			}
			System.out.println();
		}
	}
}