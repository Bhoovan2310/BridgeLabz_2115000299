interface MealPlan {
    void displayMeal();
}

class VegetarianMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal Plan: Includes vegetables, grains, and plant-based proteins.");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal Plan: Includes plant-based foods, no animal products.");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Keto Meal Plan: Low-carb, high-fat foods for ketosis.");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("High Protein Meal Plan: Focuses on lean meats, eggs, and legumes.");
    }
}

class Meal<T extends MealPlan> {
    private String name;
    private T mealPlan;

    public Meal(String name, T mealPlan) {
        this.name = name;
        this.mealPlan = mealPlan;
    }

    public String getName() {
        return name;
    }

    public void displayMealDetails() {
        System.out.println("Meal Plan: " + name);
        mealPlan.displayMeal();
    }
}

class MealPlanner {
    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {
        mealPlan.displayMeal();
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>("Vegetarian Meal", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>("Vegan Meal", new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>("Keto Meal", new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>("High Protein Meal", new HighProteinMeal());

        System.out.println("Displaying Personalized Meal Plans:");
        vegMeal.displayMealDetails();
        veganMeal.displayMealDetails();
        ketoMeal.displayMealDetails();
        highProteinMeal.displayMealDetails();

        System.out.println("\nValidating and Generating Meal Plans Dynamically:");
        MealPlanner.generateMealPlan(new VegetarianMeal());
        MealPlanner.generateMealPlan(new VeganMeal());
        MealPlanner.generateMealPlan(new KetoMeal());
        MealPlanner.generateMealPlan(new HighProteinMeal());
    }
}
