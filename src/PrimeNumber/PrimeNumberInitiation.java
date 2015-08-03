package PrimeNumber;

public class PrimeNumberInitiation {

	public boolean[] intialise(boolean[] f) {
		// TODO Auto-generated method stub
		for (int i=0; i< f.length;i++){
			f[i]=true;
		}
		return f;
		
	}

	public boolean[] getRid(boolean[] f) {
		// TODO Auto-generated method stub
		f[0]=f[1]=false;
		return f;
	}

}
