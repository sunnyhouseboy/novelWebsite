package novel.admin.bean;



//轮播图
public class CarouselImage {
    private int id;
    private String imageName;
    private String imagePath;
    private String imageDescription;
    private int imageOrder;
    private int imageStatus;

    public CarouselImage() {
    }

    public CarouselImage(int id, String imageName, String imagePath, String imageDescription, int imageOrder, int imageStatus) {
        this.id = id;
        this.imageName = imageName;
        this.imagePath = imagePath;
        this.imageDescription = imageDescription;
        this.imageOrder = imageOrder;
        this.imageStatus = imageStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public int getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(int imageOrder) {
        this.imageOrder = imageOrder;
    }

    public int getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(int imageStatus) {
        this.imageStatus = imageStatus;
    }

    @Override
    public String toString() {
        return "CarouselImage{" +
                "id=" + id +
                ", imageName='" + imageName + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", imageDescription='" + imageDescription + '\'' +
                ", imageOrder=" + imageOrder +
                ", imageStatus=" + imageStatus +
                '}';
    }
}
