package novel.admin.bean;

public class Ranklist {
    private int id;
    private String coverImg;
    private String author;
    private String bookName;
    private String score;
    private String bigKind;
    private String label;
    private int readNum;
    private int collectNum;
    private int recommendNum;

    public Ranklist() {
    }

    public Ranklist(int id, String coverImg, String author, String bookName, String score, String bigKind, String label, int readNum, int collectNum, int recommendNum) {
        this.id = id;
        this.coverImg = coverImg;
        this.author = author;
        this.bookName = bookName;
        this.score = score;
        this.bigKind = bigKind;
        this.label = label;
        this.readNum = readNum;
        this.collectNum = collectNum;
        this.recommendNum = recommendNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getBigKind() {
        return bigKind;
    }

    public void setBigKind(String bigKind) {
        this.bigKind = bigKind;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getReadNum() {
        return readNum;
    }

    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }

    public int getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(int collectNum) {
        this.collectNum = collectNum;
    }

    public int getRecommendNum() {
        return recommendNum;
    }

    public void setRecommendNum(int recommendNum) {
        this.recommendNum = recommendNum;
    }

    public String getFirstLabel() {
        return this.label.split(",")[0];
    }

    @Override
    public String toString() {
        return "Ranklist{" +
                "id=" + id +
                ", coverImg='" + coverImg + '\'' +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", score='" + score + '\'' +
                ", bigKind='" + bigKind + '\'' +
                ", label='" + label + '\'' +
                ", readNum=" + readNum +
                ", collectNum=" + collectNum +
                ", recommendNum=" + recommendNum +
                '}';
    }
}
