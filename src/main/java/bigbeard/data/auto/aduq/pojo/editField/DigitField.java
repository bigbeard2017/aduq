package bigbeard.data.auto.aduq.pojo.editField;

import org.springframework.stereotype.Component;

/**
 * Created by bigbeard on 2018/5/5.
 */
@Component
public class DigitField extends Field {
    /**
     * 最大值,null的时候忽略此参数
     */
    private Integer max = null;
    /**
     * 最小值,null的时候忽略此参数
     */
    private Integer min = null;
    /**
     * 小数位数,小于等于0时无小数位数
     */
    private int decimal = 0;

    public DigitField() {
        this.setFieldType(FieldType.DIGIT);
    }

    /**
     * null 忽略此值
     *
     * @return
     */
    public Integer getMax() {
        return max;
    }

    /**
     * null忽略此值
     *
     * @param max
     */
    public DigitField setMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * null忽略此值
     */
    public Integer getMin() {
        return min;
    }

    /**
     * null忽略此值
     *
     * @param min
     */
    public DigitField setMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 小数位数,小于等于0无小数
     *
     * @return
     */
    public int getDecimal() {
        return decimal;
    }

    /**
     * 小数位数,小于等于0无小数
     *
     * @param decimal
     */
    public DigitField setDecimal(int decimal) {
        this.decimal = decimal;
        return this;
    }
}
