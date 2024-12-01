package javaAssignement4.generic;

public class GenericWithWildCard<R extends Number> {
    private R content;

    public GenericWithWildCard(R content) {
        this.content = content;
    }

        public R getContent(){
        return content;
    }
}
