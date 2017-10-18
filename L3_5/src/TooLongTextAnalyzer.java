public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLenght  = 50;
    private  Label label;
    TooLongTextAnalyzer () {
        }

    Label getLabel() {
        label = Label.TOO_LONG;
        return label;

    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLenght){
            return getLabel();
        }
        else {
         label = Label.OK;
         return label;
        }
    }
}
