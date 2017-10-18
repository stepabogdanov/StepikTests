public class NagativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

    private  String [] badSmiles = new String[] {":(", "=(", ":|"};
    private Label label;


    @Override
    protected String[] getKeywords() {

        return badSmiles;
    }

    @Override
    protected Label getLabel() {
        label = Label.NEGATIVE_TEXT;
        return label;
    }

    @Override
    public Label processText(String text) {
        for (int i = 0; i <getKeywords().length ; i++) {
            if (text.contains(badSmiles[i])) {
                //System.out.println(getKeywords()[i]);
                return label;
            }
        }
        label = Label.OK;
        return label;
    }
}
