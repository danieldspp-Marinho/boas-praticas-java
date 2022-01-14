package one.digitalinnovation.bootcamp;

public class exerciciosJava {

	public static void main(String[] args) {
		//Treinando boas praticas no Java.
		
		int i;
		//int i;   (variaveis iguais não são aceitas no Java.)
		int I;
		//int 1i;  (variaveis que começam com numero não são aceitas.)
		int _1a = 8; // (não dá erro na hora de compilar, porém não é uma boa pratica.)
		int $aq = 6;// (Aqui a mesma situação  não da erro na hora de compilar, mas não é uma boa pratica.)
		
		i = 5;
		I = 10;

		
		final int j = 10;
		//j = 15; (nessa linha da erro, pois a variavel J está como ''final'' e assim ela é um valor constante, que não pode ser alterado)
		
		int awsk1245 = 5; // (é permitido criar uma variavel assim, mas nao é usual, você não vai saber a função da propria variavel)
		
		int quantidadeProduto = 50; //Camel case, boa pratica, onde a variavel especifica o seu uso.
		//int QuantidadeProduto; ( não é boa pratica começar a variavel com Letra maiuscula.
		final int NUMERO_TENTATIVAS = 5; // Não existe Camel case para final e a variavel deve ser toda maiuscula e usar o _ (under line) ja que nao usa o Camel case. é regra
		
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
