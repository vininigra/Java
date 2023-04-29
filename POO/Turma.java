
/**
 * Escreva uma descrição da classe Turma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Turma
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int codigo;
    private String nome;
    private int ano;
    private int sala;

    /**
     * Construtor para objetos da classe Turma
     */
    public Turma(int codigo, String nome, int ano, int sala)
    {
      this.codigo = codigo;
      this.nome = nome;
      this.ano = ano;
      this.sala = sala;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeTurma()
    {
        System.out.println("Exibe Turma ");
        System.out.println("Codigo :" + codigo);
        System.out.println("Nome :" + nome);
        System.out.println("Ano :" + ano);
        System.out.println("Sala :" + sala);
    }
}
