package Lesson_3.Regx;

public enum PasswordWarnings {
    NO_DIGITS("В пароле нет цифр!"),
    BAD_QUANTITY("Пароль должен быть от 8 до 20 знаков!"),
    BAD_REGISTR("В пароле буквы одного ргистра!"),
    NEED_SPECIAL_SIMBOL("В пароле нет спецсимвола!");

    String message;

    PasswordWarnings(String message) {
        this.message = message;
    }
}
