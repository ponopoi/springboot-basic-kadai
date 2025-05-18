package com.example.springkadaiform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class ContactForm {

    @NotBlank(message = "お名前は必須です。")
    private String name;

    @NotBlank(message = "メールアドレスは必須です。")
    @Email(message = "正しいメールアドレス形式で入力してください。")
    private String email;

    @NotBlank(message = "お問い合わせ内容は必須です。")
    private String message;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}