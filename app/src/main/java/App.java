// import com.recipeapp.datahandler.CSVDataHandler;
// import com.recipeapp.datahandler.DataHandler;
// import com.recipeapp.datahandler.JSONDataHandler;
// import com.recipeapp.ui.RecipeUI;
// import java.io.*;
// import java.util.ArrayList;
// import java.util.logging.Handler;

// public class App {

//     public static void main(String[] args) {
//         try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//             System.out.println("Choose the file format:");
//             System.out.println("1. CSV");
//             System.out.println("2. JSON");
//             System.out.print("Select (1/2): ");
//             String choice = reader.readLine();

//             //swich文で入力に応じてインスタンスを生成する。
//             //RecipeUIに渡し、displayMenuメソッドを呼び出してメインメニューを表示
//             switch (choice) {
//                 case "1":
//                     CSVDataHandler csv = new CSVDataHandler();
//                     RecipeUI recipeUI = new RecipeUI(csv);
//                     recipeUI.displayMenu();
//                     break;
//                 case "2":
//                     JSONDataHandler json = new JSONDataHandler();
//                     RecipeUI recipeUI2 = new RecipeUI(json);
//                     recipeUI2.displayMenu();
//                 default:
//                     CSVDataHandler csv = new CSVDataHandler();
//                     recipeUI = new RecipeUI(csv);
//                     recipeUI.displayMenu();
//                     break;
//             }

//         } catch (Exception e) {
//             System.err.println("Error: " + e.getMessage());
//         }

//     }
//     public ArrayList<Recipe> readData(){
        
//     }
// }