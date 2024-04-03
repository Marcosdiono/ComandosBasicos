package numeros;

import java.util.Scanner;

public class calculadora {

	private static Scanner tec;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		tec = new Scanner(System.in);
		System.out.println("selecione a opção, por favor\n ");
		System.out.println("+: soma"
				+ "\n-: subtração"
				+ "\n/: divisão"
				+ "\n*: multiplicação"
				+ "\n²: exponencial de segundo grau");
		sel=tec.next();
		switch(sel){
		case "+":
		System.out.println("você selecionou soma\ndigite os valores");
		System.out.println("digite o primeiro número");
		a=tec.nextInt();
		System.out.println("digite o segundo número");
		b=tec.nextInt();
		res=a+b;
	
		System.out.println(a + "+" + b + "=" + res);
		break;
		case "-":
			System.out.println("você selecionou subtração\ndigite os valores");
			System.out.println("digite o primeiro número");
			a=tec.nextInt();
			System.out.println("digite o segundo número");
			b=tec.nextInt();
			res=a-b;
			
			System.out.println(a + "-" + b + "=" + res);
			break;
			
		case "/":
			System.out.println("você selecionou a opção divisão\ndigite os valores");
			System.out.println("digite o primeiro  número");
			a=tec.nextInt();
			System.out.println("digite o segundo número");
			b=tec.nextInt();
			res=a/b;
			
			System.out.println(a + "/" + b + "=" + res);
			break;
			
		case "*":
			System.out.println("você selecionou a opção multiplicação\ndigite os valores");
			System.out.println("digite o primeiro valou");
			a=tec.nextInt();
			System.out.println("digite o segundo valor");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
		case "²":
			System.out.println("você selecionou a opção exponencial de segundo grau");
			System.out.println("digite o valor a ser exponenciado");
			a=tec.nextInt();
			res=a*a;
			System.out.println(a+"²"+"="+res);
			break;
		
		}

	}

}
