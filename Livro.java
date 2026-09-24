public class Livro {
        private String titulo;
        private String autor;
        private int anoPublicacao;
        private double preco;

        public Livro(String titulo, String autor, int anoPublicacao, double preco) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            this.preco = preco;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAnoPublicacao() {
            return anoPublicacao;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            if (preco > 0) {
                this.preco = preco;
            }
        }

        public int calcularIdade(int anoAtual) {
            return anoAtual - anoPublicacao;
        }

        @Override
        public String toString() {
            return titulo + " (" + autor + ", " + anoPublicacao + ") - R$ " + preco;
        }
    

    public static void main(String[] args) {

        Livro l1 = new Livro("Livro1", "Lucas", 2024, 45.87);
        Livro l2 = new Livro("Livro2", "Lucas", 2020, 71.55);

        System.out.println(l1);
        System.out.println(l2);

        l1.setPreco(-50);

        System.out.println(l1);
    }
}