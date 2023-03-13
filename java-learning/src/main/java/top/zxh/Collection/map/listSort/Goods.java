package top.zxh.Collection.map.listSort;

/**
 * Date:2023/3/12
 * Author：zxh
 * Description:
 */
public class Goods {
    private String sn;
    private String title;

    public Goods(String sn, String title) {
        this.title = title;
        this.sn = sn;
    }

    @Override
    public int hashCode() {
        return this.sn.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Goods) {
            return this.sn.equals(((Goods) obj).getSn());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.hashCode() + "=Goods{" +
               "sn='" + sn + '\'' +
               ", title='" + title + '\'' +
               '}';
    }

    public String getSn() {
        return sn;
    }

    public String getTitle() {
        return title;
    }
}
