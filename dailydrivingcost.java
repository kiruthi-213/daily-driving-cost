import java.util.*;

public class Car{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int milesPerDay;
        int costPerGallon;
         int milesPerGallon;
        int parkingFees;
        int tollsPerDay;
        int  dailyDrivingCost;
        System.out.printf("enter total miles driven per day");
                milesPerDay=sc.nextInt();
                System.out.printf("cost per gallon for gasoline");
                costPerGallon=sc.nextInt();
                System.out.printf("average miles per gallon");
                milesPerGallon=sc.nextInt();
                 System.out.printf ("parking fees per day ");
                 parkingFees=sc.nextInt();
                 System.out.printf("tolls per day ");
                 tollsPerDay=sc.nextInt();
                 
                 
     
        dailyDrivingCost = ((milesPerDay / milesPerGallon) * costPerGallon) + parkingFees + tollsPerDay;
        System.out.printf("total miles driven per day is %d\n  ",milesPerDay);
         System.out.printf("cost per gallon for gasoline %d\n ",milesPerGallon);
          System.out.printf("average miles per gallon %d\n ",milesPerGallon);
           System.out.printf ("parking fees per day %d\n ",parkingFees);
            System.out.printf("tolls per day %d\n",tollsPerDay);
        System.out.printf("Daily driving cost = %d\n", dailyDrivingCost);
    }
}



//gui
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CarGui extends Application {
 
    private TextField milesPerDayField, costPerGallonField, milesPerGallonField, parkingFeesField, tollsPerDayField;
    private Label dailyDrivingCostLabel;
    private Button calculateButton;
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        milesPerDayField = new TextField();
        costPerGallonField = new TextField();
        milesPerGallonField = new TextField();
        parkingFeesField = new TextField();
        tollsPerDayField = new TextField();
        dailyDrivingCostLabel = new Label();
        calculateButton = new Button("Calculate");
 
        VBox root = new VBox(
                new Label("Total miles driven per day:"), milesPerDayField,
                new Label("Cost per gallon for gasoline:"), costPerGallonField,
                new Label("Average miles per gallon:"), milesPerGallonField,
                new Label("Parking fees per day:"), parkingFeesField,
                new Label("Tolls per day:"), tollsPerDayField,
                calculateButton,
                dailyDrivingCostLabel
        );
 
        calculateButton.setOnAction(event -> calculate());
 
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Daily Driving Cost Calculator");
        primaryStage.show();
    }
 
    private void calculate() {
        int milesPerDay = Integer.parseInt(milesPerDayField.getText());
        int costPerGallon = Integer.parseInt(costPerGallonField.getText());
        int milesPerGallon = Integer.parseInt(milesPerGallonField.getText());
        int parkingFees = Integer.parseInt(parkingFeesField.getText());
        int tollsPerDay = Integer.parseInt(tollsPerDayField.getText());
 
        int dailyDrivingCost = ((milesPerDay / milesPerGallon) * costPerGallon) + parkingFees + tollsPerDay;
 
        dailyDrivingCostLabel.setText("Daily driving cost = " + dailyDrivingCost);
    }
}
