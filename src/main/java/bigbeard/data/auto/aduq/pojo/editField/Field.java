package bigbeard.data.auto.aduq.pojo.editField;

/**
 * Created by bigbeard on 2018/5/5.
 */
public abstract class Field {

    /**
     * 是否允许为空
     */
    private boolean nullable = false;
    /**
     * 是否主键
     */
    private boolean key = false;
    /**
     * 是否必填
     */
    private boolean mustInput = false;
    /**
     * 字段中文名称
     */
    private String title = "";
    /**
     * 字段名称,对应于类中的名称
     */
    private String name = "";
    /**
     * UI显示的控件类型
     */
    private FieldType fieldType;
    /**
     * 验证正则表达式
     */
    private String regular = "";
    /**
     * 验证失败后的提示信息
     */
    private String faultMsg = "";

    /**
     * 控件宽度
     */
    private int width = 100;

    /**
     * 控件显示高度
     */
    private int height = 30;



    public boolean isMustInput() {
        return mustInput;
    }

    public Field setMustInput(boolean mustInput) {
        this.mustInput = mustInput;
        return this;
    }

    public boolean isKey() {
        return key;
    }

    public Field setKey(boolean key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name;
    }

    public Field setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isNullable() {
        return nullable;
    }

    public Field setNullable(boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Field setTitle(String title) {
        this.title = title;
        return this;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    protected Field setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    public String getRegular() {
        return regular;
    }

    public Field setRegular(String regular) {
        this.regular = regular;
        return this;
    }

    public String getFaultMsg() {
        return faultMsg;
    }

    public Field setFaultMsg(String faultMsg) {
        this.faultMsg = faultMsg;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Field setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Field setHeight(int height) {
        this.height = height;
        return this;
    }
}
