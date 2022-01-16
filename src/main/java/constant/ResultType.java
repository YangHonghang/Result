package constant;


/**
 * @description: ResultConst$
 * @since: 2022/1/16$ 2:31 上午$
 * @author: Young
 * @version: 1.0
 */
public class ResultType {

    /**
     * 成功
     */
    public static final ResultType SUCCESS = new ResultType(0, "成功");

    /**
     * 业务错误
     */
    public static final ResultType BIZ_ERROR = new ResultType(1, "业务错误");

    /**
     * 参数错误
     */
    public static final ResultType PARAM_ERROR = new ResultType(2, "参数错误");

    /**
     * 运行时错误
     */
    public static final ResultType RUNTIME_ERROR = new ResultType(3, "运行时错误");

    private int code;

    private String desc;

    public ResultType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultType that = (ResultType) o;

        if (code != that.code) return false;
        return desc != null ? desc.equals(that.desc) : that.desc == null;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResultTypeConst{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
