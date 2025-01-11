import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Seja bem-vindo(a)");

                String email = "taylon@gmail.com";
                String senha = "teste123";

                System.out.println();

                System.out.println("Informe seu email: ");
                String emailLogin = sc.nextLine();

                System.out.println("Informe sua senha: ");
                String senhaLogin = sc.nextLine();


                if (emailLogin.equals("taylon@gmail.com") && senhaLogin.equals("teste123")){
                    System.out.println("Login realizado com sucesso");

                } else {
                    System.out.println("Login inválido! Tente novamente.");
                }






            }


        }

