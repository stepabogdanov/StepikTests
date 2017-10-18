public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private Label label;
    private String[] keywords;

    SpamAnalyzer (String[] keywords) {
        this.keywords =keywords;
    }
    @Override
    protected String[] getKeywords() {

        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }


    @Override
    public Label processText(String text) {
        for (int i = 0; i<getKeywords().length ; i++) {
            if (text.contains(getKeywords()[i])) {
                //System.out.println(getKeywords()[i]);
                return label;
            }

        }
        label = Label.OK;
        return label;
    }
}
