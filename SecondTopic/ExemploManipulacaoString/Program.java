public class Program {
    public static void main(String[] args){

        String texto = "  String base de testes!  ";

        // Manipulação
        System.out.println("Texto original: " + texto);
        System.out.println("Trim: " + texto.trim());
        System.out.println("Maiúsculas: " + texto.toUpperCase());
        System.out.println("Substituir: " + texto.replace("testes", "modificacao"));

        // Comparação
        System.out.println("Contém 'String': " + texto.contains("String"));
        System.out.println("Começa com 'String': " + texto.trim().startsWith("String"));

        // Pesquisa
        System.out.println("Índice de 'base': " + texto.indexOf("base"));

        // Divisão
        String linguagens = "Java,Python,C++";
        String[] partes = linguagens.split(",");
        System.out.println("Linguagens: ");
        for (String linguagem : partes) {
            System.out.println(linguagem);
        }
    }
}
