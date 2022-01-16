package basic;


import constant.ResultType;

/**
 * @description: Result$
 * @since: 2022/1/16$ 2:29 上午$
 * @author: Young
 * @version: 1.0
 */
public class Result<T> {

    /**
     * 结果代码
     */
    private int code;

    /**
     * 消息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    /**
     * 成功
     * success
     * @version: 1.0
     * @since: 2022/1/16 2:55 上午
     * @author: Young
     *
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> success(T t) {
        return create(ResultType.SUCCESS, null, t);
    }

    /**
     * 成功
     * success
     * @version: 1.0
     * @since: 2022/1/16 3:04 上午
     * @author: Young
     *
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> success() {
        return create(ResultType.SUCCESS, null, null);
    }

    /**
     * 成功
     * success
     * @version: 1.0
     * @since: 2022/1/16 3:03 上午
     * @author: Young
     *
     * @param t 数据
     * @param msg 消息
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> success(T t, String msg) {
        return create(ResultType.SUCCESS, msg, t);
    }

    /**
     * 私有化构造函数无法从外部创建
     * Result
     * @version: 1.0
     * @since: 2022/1/16 3:03 上午
     * @author: Young
     *
     * @param code 代码
     * @param msg 消息
     * @param data 数据
     * @return
     */
    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 失败
     * fail
     * @version: 1.0
     * @since: 2022/1/16 3:02 上午
     * @author: Young
     *
     * @param type 类型枚举
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> fail(ResultType type) {
        return create(type, type.getDesc(), null);
    }

    /**
     * 失败
     * fail
     * @version: 1.0
     * @since: 2022/1/16 3:02 上午
     * @author: Young
     *
     * @param type 类型枚举
     * @param msg 消息
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> fail(ResultType type, String msg, T t) {
        return create(type, msg, t);
    }

    /**
     * 失败
     * fail
     * @version: 1.0
     * @since: 2022/1/16 3:02 上午
     * @author: Young
     *
     * @param type 类型枚举
     * @param msg 消息
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> fail(ResultType type, String msg) {
        return create(type, msg, null);
    }

    /**
     * 失败
     * fail
     * @version: 1.0
     * @since: 2022/1/16 3:01 上午
     * @author: Young
     *
     * @param type 类型枚举
     * @param t  数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> fail(ResultType type, T t) {
        return create(type, type.getDesc(), t);
    }

//    业务错误

    /**
     * 业务错误
     * bizError
     * @version: 1.0
     * @since: 2022/1/16 3:01 上午
     * @author: Young
     * @param msg 消息
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> bizError(String msg) {
        return create(ResultType.BIZ_ERROR, msg, null);
    }

    /**
     * 业务错误
     * bizError
     * @version: 1.0
     * @since: 2022/1/16 3:00 上午
     * @author: Young
     *
     * @param msg 消息
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> bizError(String msg, T t) {
        return create(ResultType.BIZ_ERROR, msg, t);
    }

    /**
     * 业务错误
     * bizError
     * @version: 1.0
     * @since: 2022/1/16 3:00 上午
     * @author: Young
     *
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */

    public static <T> Result<T> bizError(T t) {
        return create(ResultType.BIZ_ERROR, ResultType.BIZ_ERROR.getDesc(), t);
    }

    /**
     * 业务错误
     * bizError
     * @version: 1.0
     * @since: 2022/1/16 3:00 上午
     * @author: Young
     *
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> bizError() {
        return create(ResultType.BIZ_ERROR, ResultType.BIZ_ERROR.getDesc(), null);
    }

//    参数错误

    /**
     * 参数错误
     * paramError
     * @version: 1.0
     * @since: 2022/1/16 2:59 上午
     * @author: Young
     *
     * @param msg 消息
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> paramError(String msg) {
        return create(ResultType.PARAM_ERROR, msg, null);
    }

    /**
     * 参数错误
     * paramError
     * @version: 1.0
     * @since: 2022/1/16 2:59 上午
     * @author: Young
     *
     * @param msg 消息
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> paramError(String msg, T t) {
        return create(ResultType.PARAM_ERROR, msg, t);
    }

    /**
     * 参数错误
     * paramError
     * @version: 1.0
     * @since: 2022/1/16 2:58 上午
     * @author: Young
     *
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> paramError(T t) {
        return create(ResultType.PARAM_ERROR, ResultType.BIZ_ERROR.getDesc(), t);
    }

    /**
     * 参数错误
     * paramError
     * @version: 1.0
     * @since: 2022/1/16 2:58 上午
     * @author: Young
     *
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> paramError() {
        return create(ResultType.PARAM_ERROR, ResultType.BIZ_ERROR.getDesc(), null);
    }

    //    运行时错误

    /**
     * 运行时错误
     * runtimeError
     * @version: 1.0
     * @since: 2022/1/16 2:58 上午
     * @author: Young
     *
     * @param msg 消息
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> runtimeError(String msg) {
        return create(ResultType.RUNTIME_ERROR, msg, null);
    }

    /**
     * 运行时错误
     * runtimeError
     * @version: 1.0
     * @since: 2022/1/16 2:57 上午
     * @author: Young
     *
     * @param msg 消息
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> runtimeError(String msg, T t) {
        return create(ResultType.RUNTIME_ERROR, msg, t);
    }

    /**
     * 运行时错误
     * runtimeError
     * @version: 1.0
     * @since: 2022/1/16 2:57 上午
     * @author: Young
     *
     * @param t 数据
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> runtimeError(T t) {
        return create(ResultType.RUNTIME_ERROR, ResultType.BIZ_ERROR.getDesc(), t);
    }

    /**
     * 运行时错误
     * runtimeError
     * @version: 1.0
     * @since: 2022/1/16 2:56 上午
     * @author: Young
     *
     * @return com.xiaowanjiankang.sdk.basic.Result<T>
     */
    public static <T> Result<T> runtimeError() {
        return create(ResultType.RUNTIME_ERROR, ResultType.BIZ_ERROR.getDesc(), null);
    }


    /**
     * 是否成功
     * isSuccess
     * @version: 1.0
     * @since: 2022/1/16 2:56 上午
     * @author: Young
     *
     * @return boolean
     */
    public boolean isSuccess(){
        return this.code == ResultType.SUCCESS.getCode();
    }

    /**
     * <p>description:创建响应主体实例</p>
     *
     * @param code 响应码<br>
     * @param msg  消息字串<br>
     * @param data 数据实例<br>
     * @return 响应信息主体实例<br>
     * @since 2021/10/20 11:07<br>
     */
    private static <T> Result<T> create(ResultType code, String msg, T data) {
        // 合法校验-不存在则直接返回
        return new Result<T>(code.getCode(), msg, data);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result<?> result = (Result<?>) o;

        if (code != result.code) return false;
        if (msg != null ? !msg.equals(result.msg) : result.msg != null) return false;
        return data != null ? data.equals(result.data) : result.data == null;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
