import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

       System.out.println("Bem vindo a consulta da Tabela FIPE.");
       System.out.print("Para consulta de carros, digite [marcas]: ");
       String buscar = scan.nextLine();
       String veiculoEncontrado = ConsumoApi.buscarVeiculo(buscar);
       System.out.println("Veiculo encontrado!");
       System.out.println(veiculoEncontrado);

       
       System.out.print("Apos a lista, podera escolher entre um modelo especifico.\nDigite o numero do modelo desejado: ");
       String  verificar  = scan.nextLine();
       String modeloEncontrado = ConsumoApi.buscarModelo(verificar);
       System.out.println("Modelo encontrado!");
       System.out.println(modeloEncontrado);

       System.out.print("Agora, digite o ano do veiculo desejado:");

       String ano = scan.nextLine();
       String codigo = verificar;
       String anoEncontrado = ConsumoApi.buscarAno(verificar,ano);
       System.out.println("Ano encontrado!");
       System.out.println(anoEncontrado);

       System.out.print("Certo, dentre os modelos para consulta, escolha um: ");
       String codModel = scan.nextLine();
       String codModelEncontrado = ConsumoApi.buscarCodModel(verificar,ano,codigo,codModel);
       System.out.println("Modelo encontrado!");
       System.out.println("O veiculo selecionado foi: ");
       
       System.out.println(codModelEncontrado);

}
}