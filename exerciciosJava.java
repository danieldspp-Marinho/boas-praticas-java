package one.digitalinnovation.bootcamp;

public class exerciciosJava {

	public static void main(String[] args) {
		//Treinando boas praticas no Java.
		
		int i;
		//int i;   (variaveis iguais n�o s�o aceitas no Java.)
		int I;
		//int 1i;  (variaveis que come�am com numero n�o s�o aceitas.)
		int _1a = 8; // (n�o d� erro na hora de compilar, por�m n�o � uma boa pratica.)
		int $aq = 6;// (Aqui a mesma situa��o  n�o da erro na hora de compilar, mas n�o � uma boa pratica.)
		
		i = 5;
		I = 10;

		
		final int j = 10;
		//j = 15; (nessa linha da erro, pois a variavel J est� como ''final'' e assim ela � um valor constante, que n�o pode ser alterado)
		
		int awsk1245 = 5; // (� permitido criar uma variavel assim, mas nao � usual, voc� n�o vai saber a fun��o da propria variavel)
		
		int quantidadeProduto = 50; //Camel case, boa pratica, onde a variavel especifica o seu uso.
		//int QuantidadeProduto; ( n�o � boa pratica come�ar a variavel com Letra maiuscula.
		final int NUMERO_TENTATIVAS = 5; // N�o existe Camel case para final e a variavel deve ser toda maiuscula e usar o _ (under line) ja que nao usa o Camel case. � regra
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		System.out.println(j);
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(awsk1245);
		
		
		
		
	}

}
