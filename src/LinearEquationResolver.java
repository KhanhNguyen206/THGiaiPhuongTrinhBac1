import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a: ");
        double a= scanner.nextDouble();

        System.out.println("Enter b: ");
        double b= scanner.nextDouble();

        System.out.println("Enter c:");
        double c= scanner.nextDouble();

        if (a==0){
            if(!(b==c)) {
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình vô số nghiệm");
            }
        }else {
            System.out.println("Nghiệm của phương trình: "+ ((c-b)/a));
        }
    }
}
