public abstract class Document {
    String title;
     public abstract int pages();
}

class Book extends Document {
    int pages;
    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    @Override
    public int pages() {
        return pages;
    }
}

class Magazine extends Document {
    int editionPages;

    Magazine(String title, int editionPages) {
        this.title = title;
        this.editionPages = editionPages;
    }

    @Override
    public int pages() {
        return editionPages;
    }
}
