import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreen extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tela de Login");

        Label lblUsername = new Label("Usuário:");
        TextField txtUsername = new TextField();

        Label lblPassword = new Label("Senha:");
        TextField txtPassword = new TextField();

        Button btnLogin = new Button("Login");
        btnLogin.setOnAction(e -> {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            if (authenticate(username, password)) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Login falhou. Tente novamente!");
            }
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(lblUsername, 0, 0);
        gridPane.add(txtUsername, 1, 0);
        gridPane.add(lblPassword, 0, 1);
        gridPane.add(txtPassword, 1, 1);
        gridPane.add(btnLogin, 1, 2);

        Scene scene = new Scene(gridPane, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean authenticate(String username, String password) {
        return username.equals("usuario") && password.equals("senha");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
