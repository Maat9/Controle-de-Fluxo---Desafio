import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}	
        scanner.close();	
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroDois > parametroUm){
            int contagem = parametroDois - parametroUm;
            for (int x = 1; x <= contagem; x++ ){
                System.out.println("Imprimindo o número " + x);
            }
        }else{
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");  
        }
    }
}
