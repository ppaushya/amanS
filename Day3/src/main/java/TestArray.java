public class TestArray {

	public static void main(String[] args) {
		
		//declaration of array
		short mynum=90;
		int[] num=new int[10];
		num[0]=1;
		num[1]=mynum;
		num[2]=45;
		num[7]=78;
		
		//print array
		for(int i=0;i<10;i++)
		{
			System.out.println(num[i]);	//blank indices initilaized
										//with default value
		}

	}

}
