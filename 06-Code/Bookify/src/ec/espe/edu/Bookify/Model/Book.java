package ec.espe.edu.Bookify.Model;

/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 */
public class Book {
        private String title;
        private String ranking;
        private String gender;
        private String author;
        private String yearOfPublication;
        private String publisher;
        private int numberOfPage;
        private int ISBN;
        private int amount;   
        private boolean available;

    public Book() {
    }
        public Book(String title, String ranking, String gender, String author, String yearOfPublication, String publisher, int numberOfPage, int ISBN, int amount, boolean available) {
        this.title = title;
        this.ranking = ranking;
        this.gender = gender;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.numberOfPage = numberOfPage;
        this.ISBN = ISBN;
        this.amount = amount;
        this.available = available;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the ranking
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * @param ranking the ranking to set
     */
    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the yearOfPublication
     */
    public String getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearOfPublication the yearOfPublication to set
     */
    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the numberOfPage
     */
    public int getNumberOfPage() {
        return numberOfPage;
    }

    /**
     * @param numberOfPage the numberOfPage to set
     */
    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    /**
     * @return the ISBN
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "\nTitle = " + title + "\nRanking = " + ranking + "\nGender = " + gender + "\nAuthor = " + author + "\nYearOfPublication = " + yearOfPublication + "\nPublisher = " + publisher + "\nNumberOfPage = " + numberOfPage + "\nISBN = " + ISBN + "\nAmount = " + amount + "\nAvailable = " + available + '\n';
    }  
    
    
}

