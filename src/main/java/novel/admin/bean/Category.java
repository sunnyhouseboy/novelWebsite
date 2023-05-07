package novel.admin.bean;

//管理小说分类
public class Category {
    private Integer id;
    private String name;//分类名称
    private Integer parentId;//父级分类Id,若为顶级分类则为0；
    private Integer isLeaf;//是否为叶子节点，1表示是，0表示不是
    private String path;//分类路径,用于层次展示和查询
    private Integer sortOrder;//用于控制展示顺序

    public Category() {
    }

    public Category(Integer id, String name, Integer parentId, Integer isLeaf, String path, Integer sortOrder) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.isLeaf = isLeaf;
        this.path = path;
        this.sortOrder = sortOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", isLeaf=" + isLeaf +
                ", path='" + path + '\'' +
                ", sortOrder=" + sortOrder +
                '}';
    }
}
