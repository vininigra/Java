
/**
 * Escreva uma descrição da classe Curso aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Curso
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String sigla;
    private String area;
    /**
     * Construtor para objetos da classe Curso
     */
    public Curso(String nome, String sigla, String area)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.sigla = sigla;
        this.area = area;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        // escreva seu código aqui 
        System.out.println("Informaçoes do Curso: ");
        System.out.println("Nome :" + nome);
        System.out.println("Sigla :" + sigla);
        System.out.println("Area :" + area);
        
    }
}
