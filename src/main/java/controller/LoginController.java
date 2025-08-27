package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    protected void onLogin() {
        String user = usernameField.getText();
        String pass = passwordField.getText();

        if ("admin".equals(user) && "123".equals(pass)) {
            messageLabel.setText("Login realizado com sucesso!");
            messageLabel.setStyle("-fx-text-fill: green;");
        } else {
            messageLabel.setText("Usuário ou senha inválidos!");
            messageLabel.setStyle("-fx-text-fill: red;");
        }
    }
}

