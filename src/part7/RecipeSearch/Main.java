package part7.RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        String recipeName = "";
        int recipeCooktime = 0;
        ArrayList<String> ingridients = new ArrayList<>();


        System.out.print("File to read: ");
        String file = scanner1.nextLine();
        String path = "src/part7/RecipeSearch/" + file;

        System.out.println();
        System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\n");

        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                recipeName = scanner.nextLine();
                recipeCooktime = Integer.valueOf(scanner.nextLine());
                String ingridient = scanner.nextLine();
                ingridients = new ArrayList<>();

                while (!(ingridient.isEmpty())) {
                    ingridients.add(ingridient);
                    if (!(scanner.hasNextLine())) {
                        break;
                    }
                    ingridient = scanner.nextLine();
                }
                Recipe newRecipe = new Recipe(recipeName, recipeCooktime, ingridients);
                recipes.add(newRecipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner1.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
                System.out.println();
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                command = scanner1.nextLine();
                System.out.println();

                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(command)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println();
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int cooktime = Integer.valueOf(scanner1.nextLine());
                System.out.println();

                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookTime() <= cooktime) {
                        System.out.println(recipe);
                    }
                }
                System.out.println();
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                command = scanner1.nextLine();
                System.out.println();
                System.out.println("Recipes: ");

                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(command)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println();
            }

        }
    }
}
