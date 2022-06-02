package ec.espe.edu.Bookify.Model;

/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 */
public class Movie {
    
        private String title;
        
        private String gender;
        private String clasification;
        private String idiom;
        private String format;
        private boolean available;
        private int amount;
        private int year;

    public Movie() {
    }
        public Movie(String title, String gender, String clasification, String idiom, String format, boolean available, int amount, int year) {
        this.title = title;
        this.gender = gender;
        this.clasification = clasification;
        this.idiom = idiom;
        this.format = format;
        this.available = available;
        this.amount = amount;
        this.year = year;
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
     * @return the clasification
     */
    public String getClasification() {
        return clasification;
    }

    /**
     * @param clasification the clasification to set
     */
    public void setClasification(String clasification) {
        this.clasification = clasification;
    }

    /**
     * @return the idiom
     */
    public String getIdiom() {
        return idiom;
    }

    /**
     * @param idiom the idiom to set
     */
    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", gender=" + gender + ", clasification=" + clasification + ", idiom=" + idiom + ", format=" + format + ", available=" + available + ", amount=" + amount + ", year=" + year + '}';
    }
}
