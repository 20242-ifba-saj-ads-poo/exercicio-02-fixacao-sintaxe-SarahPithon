class Exercicio4 {
    public static void main(String[] args) {
        int fatorial = 1;
        
        for (int n = 1; n <= 10; n++) {

            System.out.print("O fatorial de " + n + " é (");
            System.out.print(n - 1 + "!");
            
            System.out.println(") = " + fatorial);
            
            fatorial *= n;
        }
    }
}