// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter Java method body (type 'END' to finish):");

//             StringBuilder userCodeBuilder = new StringBuilder();
//             String line;
//             while (!(line = sc.nextLine()).equals("END")) {
//                 userCodeBuilder.append(line).append("\n");
//             }

//             String userCode = userCodeBuilder.toString();
//             CodeExecutor.compileAndRun(userCode);
//         }
//     }
// }
