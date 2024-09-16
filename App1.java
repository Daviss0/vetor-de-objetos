import java.util.Scanner;

public class App1 {
    
    public static void main(String[] args) throws Exception {

          // Criação de vetor de objetos para criar e manipular dados de componentes e periféricos de computador
    	/*esse programa ajuda a registrar dados de componentes e periféricos de
    	 *  computador(com atributos como, nome do produto, marca, cor e valor)  usando as funções passadas nas aulas para 
    	 *  manipular os dados como função para adicionar, função para aummentar capacidade, função para mostrar a quantidade
    	 *  de objetos criados, função para adicionar no inicio, entre outras*/

        VetorObjeto vetor = new VetorObjeto(5);
        Scanner scan = new Scanner (System.in);
        int opcao = 0;
        do { 
            
        System.out.println("====Menu de Opções====");
        System.out.println("1. Adicionar");
        System.out.println("2. Visualizar quantidade");
        System.out.println("3. Buscar por posição");
        System.out.println("4. Verificar se componente existe");
        System.out.println("5. Adicionar no  inicio");
        System.out.println("6. Remover");
        System.out.println("0 Sair");
        opcao = scan.nextInt();
        scan.nextLine();

        
         Componentes c1 = new Componentes ("Pen Drive","San Disk","preto", 40);
         Componentes c2 = new Componentes ("Teclado Mecanico", "Logitech", "Preto", 800);
         Componentes c3 = new Componentes  ("Mouse", "Razer", "Preto", 350);
         Componentes c4 = new Componentes ("Monitor", "LG", "Branco", 2000);
         Componentes c5 = new Componentes ("HeadSet", "HyperX", "Vermelho", 400);
        
         switch (opcao) {
            case 1:
            try {
            vetor.adicionar(c1);
            vetor.adicionar(c2);
            vetor.adicionar(c3);
            vetor.adicionar(c4);
            vetor.adicionar(c5);
            
            }
            catch (Exception e){
                e.printStackTrace();
            }
                break;

            case 2:
            System.out.println(vetor.getTamanho()); 
            break;

            case 3:
            System.out.println("qual a posição no vetor?");
            int posicao = scan.nextInt();
            System.out.println(vetor.busca(posicao));
            ;
            break;

            case 4:
            System.out.println("qual o objeto?");
            String posicao1 = scan.next();  
            vetor.busca1(posicao1);
            break;

            case 5:
            Object elemento = new Object();
            int posicaoInicio = 0;
            vetor.adicionarInicio(posicaoInicio, elemento);
            break;

            case 6: 
            System.out.println("qual a posição?");
            int posExcluir = 0;
            posExcluir = scan.nextInt();
            vetor.remove(vetor.setTamaho(posExcluir));
            break;
            default:
            System.out.println("opcao invalida, tente novamente!");
                break;
        
        }
    } while (opcao != 0);
    scan.close();   
}
}
