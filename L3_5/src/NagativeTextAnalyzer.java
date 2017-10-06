public class NagativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    String [] keywords;

    NagativeTextAnalyzer(String[] keywords){

    }


    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
