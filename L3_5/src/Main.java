public class Main {
    public static void main(String[] args) {
        String string = "Итак, берём скрипт, указываем в нём свой пасскей (строка 24) и закидываем файл на хостинг.\n" +
                "Если пасскей не используется, всю строку 24 можно закомментировать или удалить. Но в этом случае вашим " +
                "анонсером может воспользоваться любой (кто о нём знает), что не всегда хорошо.\n" +
                "Теперь добавляем в каждый торрент новый адрес трекера, который формируется на " +
                "основе уже существующего там адреса.";

        String[] spamText = new String []{"."};

        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(spamText);
        spamAnalyzer.processText(string);
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        return Label.OK;
    }
}
