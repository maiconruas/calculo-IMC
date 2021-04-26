public class Principal {
        public static void main(String[] args) {
            Paciente p1 = new Paciente(80, 1.83);
            p1.setIdade(18);
            p1.setNome("Maicon");
            p1.diagnostico();

            System.out.println("--------------------");

            Paciente p2 = new Paciente(110, 2.00);
            p2.setIdade(20);
            p2.setNome("Eduarda");
            p2.diagnostico();

            System.out.println("--------------------");

            Paciente p3 = new Paciente(451, 1.60);
            p1.setIdade(32);
            p1.setNome("Ana");
            p1.diagnostico();
        }
    }

