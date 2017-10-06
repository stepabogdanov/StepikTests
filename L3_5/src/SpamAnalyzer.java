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
        for (int i = 0; i<keywords.length ; i++) {
            if (text.contains(keywords[i])) {
                System.out.println(keywords[i]);
                label = Label.SPAM;
                return Label.SPAM;
            }

        }
        return Label.OK;
    }
}
