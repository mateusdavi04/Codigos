package Aula05;

public class ExemplosString {

	//Criando String
	String NomeDaString = " Minha String ";
	
	
	//Criando String modo construtor,
	char[] caracteres = {'M','i','n','h','a',' ','S','t','r','i','n','g'};
	String stringFromArray = new String (caracteres);
	String outraString = new String (" Isso e outra String ");
	
	
	//Uma vez criada, a string não pode ser alterada, então se criam novas strings.	
	String strOriginal = " Hello ";
	String strConcatenada = strOriginal + " World ";
	String strMaiuscula = strOriginal.toUpperCase();
	System.out.println(" String original: " + strOriginal);
	System.out.println(" String concatenada: " + strConcatenada);
	System.out.println(" String maiúscula: "  strMaiuscula);
	System.out.println("String original após manipulações " + strOriginal);
	
	

	// Usado para contar o numero de caracteres da string
	String minhaString = "Exemplo de string";
	int tamanhoMinhaString =  minhaString.length(17);
	
	
	
	//Usado para mostrar o caracter referente ao numero, começando por 0.
	String minhaString = "Exemplo";
	char primeiroCaractere = minhaString.charAt(0); //E
	char terceiroCaractere = minhaString.charAt(2); //e
	
	
	
	//Conta quantos caracteres tem antes da palavra, ou retorna -1
	String minhaString = "Exemplo de String";
	int indice = minhaString.indexOf("String"); //11
	int indice2 = minhaString.indexOf("Java"); //-1
	String minhaString = "Substituir todos os 'a' por 'X'. ";
	String novaString = minhaString.replace('a', 'X');
	
	
	
	//Tudo em letra maiuscula ou minuscula
	Srting minhaString = "Texto de exemplo";
	String emMaiuscula = minhaString.toUpperCase();
	String emMinuscula = minhaString.toLowerCase();
	
	
	
	//Dividindo a string com base nas virgulas
	String minhaString = "Maça, banana, cerveja, damasco":
	String[] partes = minhaString.split(",");
	for (String parte : partes) {
		System.out.println(parte);
		
	}
	// Retira um pedaço da string
	String  texto = "Exemplo de substring";
	String sub = texto.substring(8,15); //"de subs"
	
	
	
	//Compara se são iguais 
	String str1 = "Hello";
	String str2 = "World";
	String str3 = "Hello";
	boolean saoIguais = str1.equals(str2); // false
	boolean saoIguais2 = str1.equals(str3); // true
	
	
	//Ignora se a letra e maiuscula ou minuscula
	String str1 = "Hello";
	String str2 = "hello";
	boolean saoIguais = str1.equalsIgnoreCase(str2); // true
	
	
	//Começam com o prefixo
	String minhaString = "Ola mundo";
	boolean comecaComOla = minhaString.startsWith("Ola"); // true
	boolean terminaComMundo = minhaString.endsWith("Mundo"); // false
	
	
	//formatar a string para exibir de forma mais legivel
	String nome = "Alice";
	int idade = 30;
	String mensagem = String.format("Ola,meu nome é %d e eu tenho %f anos ", nome, idade);
	
	
	//Colocar casas decimais  em um numero especifico
	double valor = 123.456789;
	String valorFormatado = String.format("O valor é %.2f",); // 123.46
	
	
	//Remover espaços em branco no incio ou final
	String texto = "    Espaço em brancoi no incio e no final   ";
	String textoTrimmed = texto.trim();
	
	
	//Unir duas Strings
	String saudacao = "Ola, ";
	String nome = "Alice";
	String mensagem = saudacao + nome;
	System.out.println("mensagem"); //Ola alice 
	
	
	
	//Percorremndo os caracteres da string
	String minhaString = "Exemplo de string";
	for (int i = 0; i < minhaString.lenght(); i++) {
		char caractere = minhaString.charAt(i);
		System.out.println(caractere + " ");
		
	}
	
	//Usando loop for-each para percorrer caractereres
	String minhaString = "Exemplo de String";
	for (char caractere: minhaString.toCharArray ()) {
		System.out.print(caractere + " ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
