public class Main {
    public static void main(String[] args) {
        double p1 = 60;
        double p2 = 6;
        Aritmetica calculoAritmetica = new Aritmetica(p1, p2);
        Geometrica calculoGeometrica = new Geometrica(p1, p2);
        Teste calculoTeste = new Teste(p1, p2);
        Disciplina d = new Disciplina();
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(p1);
        d.setP2(p2);
        d.calcularMedia(calculoTeste);
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s", d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}