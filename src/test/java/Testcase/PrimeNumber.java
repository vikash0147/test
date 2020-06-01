package Testcase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws  IOException {

		// TODO Auto-generated method stub

		InputStreamReader fis = new InputStreamReader(System.in);


		BufferedReader br = new BufferedReader( fis);
		System.out.println("Enter any integer");
		int n = Integer.parseInt(br.readLine());

		int k =0;
		for(int i=2; i<n/2; i++) {


			if(n<=2 && n%i==0)
			{
				k =0;
				break;
			}
			else {

				k= 1;

			}


		}
		if(k>0) {

			System.out.println("prime number"+ n);
		}
		else {
			System.out.println(" Not prime number"+ n);
		}

	}
}


