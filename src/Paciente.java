public class Paciente {

    //Atributos
    String nome;
    int idade;
    double peso;
    double altura;

    //CONSTRUTOR
    Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    //METODOS
    public double calcularIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public void diagnostico() {
        double imc = calcularIMC();
        System.out.print("O paciente " + this.nome + ", de " + this.idade + " anos, está com ");
        if (imc < 16) {
            System.out.println("baixo peso muito grave.");
            System.out.println("IMC do paciente: " + imc);
        } else if (imc < 17 && imc >= 16) {
            System.out.println("baixo peso grave.");
            System.out.println("IMC do paciente: " + imc);
        } else if (imc < 18.5 && imc >= 17) {
            System.out.println("baixo peso.");
            System.out.println("IMC do paciente: " + imc);
        } else if (imc < 25 && imc >= 18.5) {
            System.out.println("peso normal.");
            System.out.println("IMC do paciente: " + imc);
        } else if (imc < 30 && imc >= 25) {
            System.out.println("sobrepeso.");
            System.out.println("IMC do paciente: " + imc);
        } else if (imc < 35 && imc >= 30) {
            System.out.println("obesidade grau I.");
            System.out.println("IMC do paciente: " + imc);
        } else if (imc < 40 && imc >= 35) {
            System.out.println("obesidade grau II.");
            System.out.println("IMC do paciente: " + imc);
        } else {
            System.out.println("obesidade grau III.");
            System.out.println("IMC do paciente: " + imc);
        }
    }

    //METODOS GETTERS||SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
